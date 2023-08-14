import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 仓库路径
        String userDir = System.getProperty("user.dir");
        String userDirRemoveLastSlash = userDir.substring(0, userDir.lastIndexOf("\\"));
        String repoPath = userDirRemoveLastSlash.substring(0, userDirRemoveLastSlash.lastIndexOf("\\"));
        // String repoPath = "D:\\Documents\\GitHub\\LiTiaotiao-Custom-Rules";


        // 创建 HashMap, 存储 app 相关信息（包名, readme.md路径, 普通规则, 增强规则）
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

        // 写入规则至外部文件中
        // index = 2, 表示普通规则
        // index = 3, 表示增强规则
        writeCustomRulesJson(packagesHashMap, 2, repoPath + "\\BasicRules.json");
        writeCustomRulesJson(packagesHashMap, 3, repoPath + "\\ExtensiveRules.json");
    }

    private static void writeCustomRulesJson(HashMap<String, ArrayList<String>> packagesHashMap, int index, String path) {
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
        String[] customRules = new String[2];
        try {
            FileInputStream inputStream = new FileInputStream(packageCustomRulesMdFilePath);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            // 普通规则内容
            String basicRulesStr = "";
            // 增强规则内容
            String extensiveRulesStr = "";

            // 检测到普通规则标题
            Boolean basicRulesHeaderLineDetected = false;
            // 检测到普通规则内容开始
            Boolean basicRulesContentLineStartDetected = false;

            // 检测到增强规则标题
            Boolean extensiveRulesHeaderLineDetected = false;
            // 检测到增强规则内容开始
            Boolean extensiveRulesContentLineStartDetected = false;

            // 当前读取的行内容
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals("## 普通规则")) {
                    basicRulesHeaderLineDetected = true;
                }
                else if (line.equals("```") && basicRulesHeaderLineDetected) {
                    basicRulesContentLineStartDetected = !basicRulesContentLineStartDetected;
                    continue;
                }
                else if (line.equals("## 增强规则")) {
                    extensiveRulesHeaderLineDetected = true;
                    basicRulesHeaderLineDetected = false;
                    basicRulesContentLineStartDetected = false;
                }
                else if (line.equals("```") && extensiveRulesHeaderLineDetected) {
                    extensiveRulesContentLineStartDetected = !extensiveRulesContentLineStartDetected;
                    continue;
                }

                if (basicRulesContentLineStartDetected) {
                    basicRulesStr += line.strip().replace("\"", "\\\"");
                }
                else if (extensiveRulesContentLineStartDetected) {
                    extensiveRulesStr += line.strip().replace("\"", "\\\"");
                }
            }

            customRules[0] = basicRulesStr;
            customRules[1] = extensiveRulesStr;
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

