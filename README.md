<p align="center">
    <h2 align="center">LiTiaotiao-Custom-Rules</h2>
</p>

<p align="center">
    <a href="https://github.com/Snoopy1866/LiTiaotiao-Custom-Rules/blob/main/LICENSE">
        <img src="https://img.shields.io/github/license/Snoopy1866/LiTiaotiao-Custom-Rules">
    </a>
    <a href="https://github.com/Snoopy1866/LiTiaotiao-Custom-Rules/graphs/contributors">
        <img src="https://img.shields.io/github/contributors/Snoopy1866/LiTiaotiao-Custom-Rules">
    </a>
    <a href="https://github.com/Snoopy1866/LiTiaotiao-Custom-Rules/stargazers">
        <img src="https://img.shields.io/github/stars/Snoopy1866/LiTiaotiao-Custom-Rules">
    </a>
    <a href="https://github.com/Snoopy1866/LiTiaotiao-Custom-Rules/forks">
        <img src="https://img.shields.io/github/forks/Snoopy1866/LiTiaotiao-Custom-Rules">
    </a>
    <a href="https://github.com/Snoopy1866/LiTiaotiao-Custom-Rules/releases">
        <img src="https://img.shields.io/github/v/release/Snoopy1866/LiTiaotiao-Custom-Rules">
    </a>
    <a href="https://github.com/Snoopy1866/LiTiaotiao-Custom-Rules/issues">
        <img src="https://img.shields.io/github/issues/Snoopy1866/LiTiaotiao-Custom-Rules">
    </a>
    <a href="https://github.com/Snoopy1866/LiTiaotiao-Custom-Rules/pulls">
        <img src="https://img.shields.io/github/issues-pr/Snoopy1866/LiTiaotiao-Custom-Rules">
    </a>
</p>


# 简介
本项目收集适用于“李跳跳”的 app 自定义规则，包括**普通规则**和**增强规则**。
- 普通规则：去除应用内广告、更新弹窗、青少年模式弹窗、权限索取提示等
- 增强规则：自动点击等

# 如何使用

1. 前往 [Releases](https://github.com/Snoopy1866/LiTiaotiao-Custom-Rules/releases) 页面下载最新版本的 BasicRules.json 和 ExtendedRules.json
2. 打开 BasicRules.json 和 Extended.json，复制全部文本
3. 打开 “李跳跳”，点击 “更多”，点击右上角三个小点，点击 “导入规则”，长按输入框，选择 “粘贴”，点击“保存”。

⚠ 建议长按输入框，以调用系统自带的粘贴功能，请不要通过第三方 app （例如：输入法、微信等）作为中介进行复制，否则可能会出现规则被截断，粘贴不全导致格式错误的问题。

💡 除了一键导入所有 app 规则，你还可以根据包名在本项目中自行查找单独 app 的规则进行导入。本项目文件夹结构遵循包名结构，例如：如果你要找包名为 'ad.top.xyz' 的 app 规则，可以前往文件夹 A 中进行查找。特别地，如果你要找包名为 'com.ad.top.xyz' 的 app 规则，应当前往文件夹 C/com/com.A 中进行查找。

🍭 找不到你需要的 app 规则？你可以前往 [Issues](https://github.com/Snoopy1866/LiTiaotiao-Custom-Rules/issues) 提交适配需求。

💀 某些 APP 的广告布局中的控件不存在任何可以标识的文本（id, desc, text），因此无法为这些 APP 书写通用规则。除非在未来的某一天这些 APP 为关闭广告按钮增加了可标识的文本（或者广告布局中的其他控件增加了可标识文本且可通过返回键关闭广告），否则这些 APP 将不会被本项目所适配。点击查看 [无法适配的 APP 清单](./not_support_list.md)。

🎯 **[FAQ](#faq)**

### 点击下方包名首字母或前缀快速导航
- [A](./A/readme.md)
- [B](./B/readme.md)
- [C](./C/readme.md)
    - [cn](./C/cn/readme.md)
    - [com](./C/com/readme.md)
        - [com.A*xxx*](./C/com/com.A/readme.md)
        - [com.B*xxx*](./C/com/com.B/readme.md)
        - [com.C*xxx*](./C/com/com.C/readme.md)
        - [com.D*xxx*](./C/com/com.D/readme.md)
        - [com.E*xxx*](./C/com/com.E/readme.md)
        - [com.F*xxx*](./C/com/com.F/readme.md)
        - [com.G*xxx*](./C/com/com.G/readme.md)
        - [com.H*xxx*](./C/com/com.H/readme.md)
        - [com.I*xxx*](./C/com/com.I/readme.md)
        - [com.J*xxx*](./C/com/com.J/readme.md)
        - [com.K*xxx*](./C/com/com.K/readme.md)
        - [com.L*xxx*](./C/com/com.L/readme.md)
        - [com.M*xxx*](./C/com/com.M/readme.md)
        - [com.N*xxx*](./C/com/com.N/readme.md)
        - [com.O*xxx*](./C/com/com.O/readme.md)
        - [com.P*xxx*](./C/com/com.P/readme.md)
        - [com.Q*xxx*](./C/com/com.Q/readme.md)
        - [com.R*xxx*](./C/com/com.R/readme.md)
        - [com.S*xxx*](./C/com/com.S/readme.md)
        - [com.T*xxx*](./C/com/com.T/readme.md)
        - [com.U*xxx*](./C/com/com.U/readme.md)
        - [com.V*xxx*](./C/com/com.V/readme.md)
        - [com.W*xxx*](./C/com/com.W/readme.md)
        - [com.X*xxx*](./C/com/com.X/readme.md)
        - [com.Y*xxx*](./C/com/com.Y/readme.md)
        - [com.Z*xxx*](./C/com/com.Z/readme.md)
- [D](./D/readme.md)
- [E](./E/readme.md)
- [F](./F/readme.md)
- [G](./G/readme.md)
- [H](./H/readme.md)
- [I](./I/readme.md)
- [J](./J/readme.md)
- [K](./K/readme.md)
- [L](./L/readme.md)
- [M](./M/readme.md)
- [N](./N/readme.md)
- [O](./O/readme.md)
- [P](./P/readme.md)
- [Q](./Q/readme.md)
- [R](./R/readme.md)
- [S](./S/readme.md)
- [T](./T/readme.md)
- [U](./U/readme.md)
- [V](./V/readme.md)
- [W](./W/readme.md)
- [X](./X/readme.md)
- [Y](./Y/readme.md)
- [Z](./Z/readme.md)

# Github Star 趋势
<a href="https://star-history.com/#Snoopy1866/LiTiaotiao-Custom-Rules&Date">
  <picture>
    <source media="(prefers-color-scheme: dark)" srcset="https://api.star-history.com/svg?repos=Snoopy1866/LiTiaotiao-Custom-Rules&type=Date&theme=dark" />
    <source media="(prefers-color-scheme: light)" srcset="https://api.star-history.com/svg?repos=Snoopy1866/LiTiaotiao-Custom-Rules&type=Date" />
    <img alt="Star History Chart" src="https://api.star-history.com/svg?repos=Snoopy1866/LiTiaotiao-Custom-Rules&type=Date" />
  </picture>
</a>

# 参与贡献
本项目欢迎贡献规则，贡献规则时请参考 [模版](template.md) 新增或修改规则。具体操作如下：

### 新增未收录 app 的自定义规则
1. 根据包名首字母进入相应的文件夹中，如包名以 “cn”，“com” 开头，需再次进入 C 文件夹的对应 cn, com 子文件夹中，然后新建一个子文件夹，名称与包名一致；
2. 在新创建的子文件夹中，创建 readme.md 文件，如有必要，还可以创建 assets 文件夹，用于存放 readme.md 使用的截图文件；
3. 复制 [模版](template.md) 全部内容到新创建的 readme.md 文件中，进行相应修改；

### 新增已收录 app 的自定义规则
1. 根据包名找到对应文件夹内的 readme.md 文件；
2. 打开 readme.md 文件，请先查找是否已经存在你要新增的规则，若不存在，请新增一条，请在代码块、详细说明列表、详细说明具体内容中新增对应内容
3. 请勿新增重复的规则

### 修改已收录 app 的自定义规则
1. 根据包名找到对应文件夹内的 readme.md 文件；
2. 打开 readme.md 文件，查找需要更新的规则，修改相应内容

### 删除已收录 app 的自定义规则

若您认为某条规则可能是错误提交的，并不适用于此 app 的任何版本，或者某条规则影响到了 app 的正常使用，可以删除对应规则，同时删除 assets 文件夹中的相关图片（如有）。

⚠ **请在模板中的代码块中书写规则，以便用于提取规则的 java 程序 [ExportRules](https://github.com/Snoopy1866/LiTiaotiao-Custom-Rules/blob/main/.src/ExportRules/src/Main.java) 能够正确识别。**

⚠ **一般情况下，不建议删除已有的规则，不同版本的 app，规则可能不完全一致，最大限度保留已有规则，以适用于大多数版本的 app。**

⚠ **贡献规则时如需同时提供 app 截图，请注意将关键信息打码，保护个人隐私。**

相关链接：

- [李跳跳进阶指南](https://juejin.cn/post/6938590373740544007)
- [李跳跳自定义规则](https://www.timeit.cn/post-543.html#:~:text=%E8%AE%BE%E7%BD%AE%E5%85%A5%E5%8F%A3%EF%BC%9A%E9%95%BF%E6%8C%89%E9%A6%96%E9%A1%B5%20%E6%9B%B4%E5%A4%9A%20%E6%8C%89%E9%92%AE%E3%80%82%20%E4%BF%AE%E6%94%B9%E8%B7%B3%E8%BF%87%E6%8F%90%E7%A4%BA%EF%BC%9A%20%7B%223%22%3A%22%E5%B0%8F%E7%8C%AA%E4%BD%A9%E5%A5%87%22%7D%20%E9%9A%90%E8%97%8F%E8%B7%B3%E8%BF%87%E6%8F%90%E7%A4%BA%EF%BC%9A%20%7B%224%22%3Atrue%7D,%E9%9A%90%E8%97%8F%E8%B7%B3%E8%B7%B3%E5%90%8E%E5%8F%B0%EF%BC%9A%20%7B%225%22%3Atrue%7D%20%E4%B8%80%E9%94%AE%E5%81%9C%E7%94%A8%E6%89%80%E6%9C%89APP%E7%9A%84%E6%9C%8D%E5%8A%A1%EF%BC%9A%20%7B%226%22%3Afalse%7D%20%E5%BC%80%E5%90%AF%E5%89%8D%E5%8F%B0%E6%9C%8D%E5%8A%A1%EF%BC%9A%20%7B%227%22%3Atrue%7D%20%E4%BF%AE%E6%94%B9%E5%89%8D%E5%8F%B0%E6%9C%8D%E5%8A%A1%E6%96%87%E6%A1%88%EF%BC%9A%20%7B%2210%22%3A%22%E6%B4%BE%E5%A4%A7%E6%98%9F%3A%E6%88%91%E4%BB%AC%E4%B8%80%E8%B5%B7%E5%8E%BB%E6%8A%93%E6%B0%B4%E6%AF%8D%E5%90%A7~%22%7D)


# FAQ

### 01. 如何获取 “李跳跳”?
请关注李跳跳官方公众号，回复任意内容获取下载链接（非广告，只是近期盗版软件猖獗，本人实在看不下去了，原作者不应该被恶意抹黑利用😠）。

<img src="./litiaotiao-logo.jpg" height = 129 width = 129></img>
<img src="./litiaotiao-qrcode.bmp" height = 129 width = 129></img>

⚠ 目前各大应用商店已经出现了盗版 “李跳跳”，不仅无法跳过广告，反而会弹出广告，请大家不要下载。

⚠ 下图为盗版李跳跳商店页面，请大家注意甄别！！！

<img src="./litiaotiao-piracy.jpg" height = 500></img>

### 02. 如何打开 json 文件？
PC 端使用记事本打开，手机端后缀改为 .txt 打开（或使用 MT 管理器）。

### 03. 规则导入出现格式错误？
请确保复制了 json 文件中的所有内容。在导入规则的输入框中，长按输入框，选择 “粘贴”。
将规则复制到第三方 app（如微信、输入法等）后可能会出现字符串被截断的问题，进而导致从第三方 app 复制到李跳跳时出现 “格式错误”！！！

### 04. 为什么有些规则需要手动触发？
由于 “李跳跳” 仅在 app 界面更新布局时进行检测，因此少数规则需要通过手动更新界面布局才能生效，具体做法有：下拉状态栏、使用手势将 app 切换至后台等，只要实现了界面布局的改变即可切换回 app 界面。需要手动触发的规则在规则详情页中有所标注。

### 05. app 卸载重装后，还需要再次导入规则吗？
**不需要！** 只要你之前有通过 BasicRules.json 或 ExtendedRules.json 成功导入某个 app 的规则，那么当这个 app 卸载重装后，只需要打开李跳跳，点击 更多->设置，刷新一次应用列表即可，之前导入的规则依然生效。

我强烈建议你通过 json 文件导入规则，而不是对单独 app 导入规则。如果你不需要那么多 app 的规则，可以手动编辑 json 文件后自行导入。手动编辑需注意 json 文件的结构，每个 app 使用包名的哈希值（使用 Java 中的 String.hashCode() 方法获得）作为唯一标识符，你可能需要先手动生成哈希值，然后在 json 文件中筛选对应的规则。
