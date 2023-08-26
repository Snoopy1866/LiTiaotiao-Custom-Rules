import java.io.*;
import java.util.*;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        // 仓库路径
        String userDir = System.getProperty("user.dir");
        String userDirRemoveLastSlash = userDir.substring(0, userDir.lastIndexOf("\\"));
        String repoPath = userDirRemoveLastSlash.substring(0, userDirRemoveLastSlash.lastIndexOf("\\"));
        // String repoPath = "D:\\Documents\\GitHub\\LiTiaotiao-Custom-Rules";


        // 创建 HashMap, 存储 app 相关信息（包名, （哈希值, readme.md路径, app 名称, 普通规则, 增强规则））
        HashMap<String, ArrayList<String>> packagesHashMap = new HashMap<String, ArrayList<String>>();
        // 获取规则文件
        ArrayList<String> packageCustomRulesMdFilePathList = getPackageCustomRulesMdFilePathList(repoPath);
        System.out.println("获取到" + packageCustomRulesMdFilePathList.size() + "个规则文件");

        // 获取包名和哈希值
        for (String path:packageCustomRulesMdFilePathList) {
            File mdFile = new File(path);
            String mdFilePath = mdFile.getPath();
            String mdFilePathLastOneSlashRemoved = mdFilePath.substring(0, mdFilePath.lastIndexOf("\\"));
            String mdFilePathLastTwoSlashRemoved = mdFilePathLastOneSlashRemoved.substring(mdFilePathLastOneSlashRemoved.lastIndexOf("\\") + 1);

            // 填充到 HashMap 中
            ArrayList<String> packageHashCodeAndPathList = new ArrayList<>();
            packageHashCodeAndPathList.add(0, String.valueOf(mdFilePathLastTwoSlashRemoved.hashCode()));
            packageHashCodeAndPathList.add(1, path);
            packagesHashMap.put(mdFilePathLastTwoSlashRemoved, packageHashCodeAndPathList);
        }

        // 读取规则文件并写入到 HashMap 中
        for (String key:packagesHashMap.keySet()) {
            String[] customRules = readCustomRules(packagesHashMap.get(key).get(1));
            packagesHashMap.get(key).addAll(List.of(customRules));
        }

        // 写入 app 列表至外部文件中
        writeAppList(packagesHashMap, repoPath, repoPath + "\\AppList.md");

        // 写入规则至外部文件中
        // index = 3, 表示普通规则
        // index = 4, 表示增强规则
        // index = 5, 表示所有规则

        writeCustomRulesJson(packagesHashMap, repoPath + "\\BasicRules.json", 3);
        writeCustomRulesJson(packagesHashMap, repoPath + "\\ExtendedRules.json", 4);
        writeCustomRulesJson(packagesHashMap, repoPath + "\\AllRules.json", 5);
    }

    private static void writeAppList(HashMap<String, ArrayList<String>> packagesHashMap, String repoPath, String path) {
        try {
            FileWriter fwBasic = new FileWriter(new File(path));
            BufferedWriter bwBasic = new BufferedWriter(fwBasic);

            // 对包名排序
            ArrayList<String> packageNameList = new ArrayList<>(packagesHashMap.keySet());
            Collections.sort(packageNameList, String.CASE_INSENSITIVE_ORDER);

            // 开始写入
            bwBasic.write("## Supported App List\r\n");

            String lastLetterPrefix = "";
            String lastletterComPrefix = "";

            Boolean comPrefix = false;
            for(String packageName: packageNameList) {
                // 添加首字母标题
                String letterPrefix = packageName.substring(0, 1).toUpperCase();
                if (!letterPrefix.equals(lastLetterPrefix)) {
                    bwBasic.write("\r\n");
                    bwBasic.write("### " + letterPrefix + "\r\n");
                    lastLetterPrefix = letterPrefix;
                    if (letterPrefix.equals("C") && packageName.startsWith("com.")) {
                        String letterComPrefix = packageName.substring(4, 5).toUpperCase();
                        bwBasic.write("- #### " + "com." + letterComPrefix + "\r\n");
                        lastletterComPrefix = letterComPrefix;

                        comPrefix = true;
                    }
                }
                else if (letterPrefix.equals("C") && packageName.startsWith("com.")) {
                    String letterComPrefix = packageName.substring(4, 5).toUpperCase();
                    if (!letterComPrefix.equals(lastletterComPrefix)) {
                        bwBasic.write("- #### " + "com." + letterComPrefix + "\r\n");
                        lastletterComPrefix = letterComPrefix;

                        comPrefix = true;
                    }
                }
                String appMdFilePath = packagesHashMap.get(packageName).get(1);
                String appName = packagesHashMap.get(packageName).get(2);
                if (comPrefix) {
                    String line = "  - [" + packageName + "](" + appMdFilePath.replace(repoPath, ".").replace("\\", "/") + ")（" + appName + "）" + "\r\n";
                    bwBasic.write(line);
                }
                else {
                    String line = "- [" + packageName + "](" + appMdFilePath.replace(repoPath, ".").replace("\\", "/") + ")（" + appName + "）" + "\r\n";
                    bwBasic.write(line);
                }
                bwBasic.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeCustomRulesJson(HashMap<String, ArrayList<String>> packagesHashMap, String path, int index) {
        try {
            FileWriter fwBasic = new FileWriter(new File(path));
            BufferedWriter bwBasic = new BufferedWriter(fwBasic);

            bwBasic.write("[\r\n");
            int i = 1;
            int count = packagesHashMap.size();
            for(String key: packagesHashMap.keySet()) {
                String rules = packagesHashMap.get(key).get(index);
                if (rules.isEmpty()) {
                    i++;
                    continue;
                }
                bwBasic.write("\t{\r\n");
                bwBasic.write("\t\t\"" + packagesHashMap.get(key).get(0) + "\": \"" + packagesHashMap.get(key).get(index) + "\"\r\n");
                if (i == count) {
                    bwBasic.write("\t}\r\n");
                }
                else {
                    bwBasic.write("\t},\r\n");
                    i++;
                }
            }
            bwBasic.write("]");
            bwBasic.close();
            fwBasic.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 获取所有 app 包名文件夹下的规则文件
    public static ArrayList<String> getPackageCustomRulesMdFilePathList(String rootDir) {
        // 初始化文件夹路径列表
        ArrayList<String> topDirList = new ArrayList<>();
        char alphabetFirst = 'A';
        for (int i = 0; i < 26; i++) {
            char alphabet = (char)(alphabetFirst + i);
            topDirList.add(rootDir + "\\" + alphabet);
            topDirList.add(rootDir + "\\C\\com\\com." + alphabet);
        }
        topDirList.add(rootDir + "\\C\\cn");

        ArrayList<String> packageCustomRulesMdFilePathList = new ArrayList<>();
        for (String topDir:topDirList) {
            packageCustomRulesMdFilePathList.addAll(getPackageCustomRulesMdDirPathList(new File(topDir)));
            // 去除 cn, com 根目录的readme.md文件路径
            packageCustomRulesMdFilePathList.remove(rootDir + "\\C\\cn\\readme.md");
            packageCustomRulesMdFilePathList.remove(rootDir + "\\C\\com\\readme.md");
        }
        return packageCustomRulesMdFilePathList;
    }

    // 获取 app 包名文件夹路径
    public static ArrayList<String> getPackageCustomRulesMdDirPathList(File baseDir) {
        // 声明列表，存储所有包名文件夹下的readme.md文件路径
        ArrayList<String> packageCustomRulesMdFilePathList = new ArrayList<String>();
        // 获取子文件和子目录
        File[] subFileList = baseDir.listFiles();
        // 判断是否为目录
        for (File subFile:subFileList) {
            if (subFile.isDirectory()) {
                packageCustomRulesMdFilePathList.add(getPackageCustomRulesMdFilePath(new File(subFile.getPath())));
            }
        }

        return packageCustomRulesMdFilePathList;
    }

    // 获取单个 app 规则文件路径
    public static String getPackageCustomRulesMdFilePath(File subDir) {
        File[] FileList = subDir.listFiles(new FilenameFilterEqual("readme.md"));
        if (FileList.length == 1) {
            return FileList[0].getPath();
        }
        else return null;
    }

    // 读取规则文件
    public static String[] readCustomRules(String packageCustomRulesMdFilePath) {
        String[] customRules = new String[4];
        try {
            FileInputStream inputStream = new FileInputStream(packageCustomRulesMdFilePath);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            // app 名称
            String appName = "";
            // 普通规则内容
            String basicRulesStr = "";
            // 增强规则内容
            String extendedRulesStr = "";
            // 所有规则
            String allRulesStr = "";

            // 检测到 app 名称
            Boolean appNameDetected = false;
            // 检测到普通规则标题
            Boolean basicRulesHeaderLineDetected = false;
            // 检测到普通规则内容开始
            Boolean basicRulesContentLineStartDetected = false;

            // 检测到增强规则标题
            Boolean extendedRulesHeaderLineDetected = false;
            // 检测到增强规则内容开始
            Boolean extendedRulesContentLineStartDetected = false;

            // 当前读取的行内容
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (!appNameDetected) {
                    appName = line.substring(line.indexOf("（") + 1, line.indexOf("）"));
                    appNameDetected = true;
                }
                else if (line.equals("## 普通规则")) {
                    basicRulesHeaderLineDetected = true;
                }
                else if (line.equals("```") && basicRulesHeaderLineDetected) {
                    basicRulesContentLineStartDetected = !basicRulesContentLineStartDetected;
                    continue;
                }
                else if (line.equals("## 增强规则")) {
                    extendedRulesHeaderLineDetected = true;
                    basicRulesHeaderLineDetected = false;
                    basicRulesContentLineStartDetected = false;
                }
                else if (line.equals("```") && extendedRulesHeaderLineDetected) {
                    extendedRulesContentLineStartDetected = !extendedRulesContentLineStartDetected;
                    continue;
                }


                if (basicRulesContentLineStartDetected) {
                    basicRulesStr += line.strip().replace("\"", "\\\"");
                }
                else if (extendedRulesContentLineStartDetected) {
                    extendedRulesStr += line.strip().replace("\"", "\\\"");
                }
            }

            if (!basicRulesStr.isEmpty() && extendedRulesStr.isEmpty()) {
                allRulesStr = basicRulesStr;
            }
            else if (basicRulesStr.isEmpty() && !extendedRulesStr.isEmpty()) {
                allRulesStr = extendedRulesStr;
            }
            else if (!basicRulesStr.isEmpty() && !extendedRulesStr.isEmpty()) {
                allRulesStr = basicRulesStr.substring(0, basicRulesStr.length() - 2) + "," + extendedRulesStr.substring(18);
            }

            customRules[0] = appName;
            customRules[1] = basicRulesStr;
            customRules[2] = extendedRulesStr;
            customRules[3] = allRulesStr;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return customRules;
    }




    // 实现文件名过滤器接口, 筛选以 xxx 结尾的文件
    static class FilenameFilterEndWidth implements FilenameFilter {
        private String type;
        public FilenameFilterEndWidth(String type) {
            this.type = type;
        }

        public boolean accept(File dir, String name) {
            return name.endsWith(type);
        }
    }

    // 实现文件名过滤器接口, 特定名称的文件
    static class FilenameFilterEqual implements FilenameFilter {
        private String type;
        public FilenameFilterEqual(String type) {
            this.type = type;
        }

        public boolean accept(File dir, String name) {
            return name.equals(type);
        }
    }
}

