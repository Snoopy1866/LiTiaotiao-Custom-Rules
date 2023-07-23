# com.miui.packageinstaller（MIUI 应用包管理组件）

## 普通规则



## 增强规则

快速复制:
```
{"popup_rules":
    [
        {"id":"准备中","action":"准备中","times":0},
        {"id":"检测中","action":"检测中","times":0},
        {"id":"继续更新","action":"继续更新","times":3},
        {"id":"继续安装","action":"继续安装","times":3},
        {"id":"安装中","action":"安装中","times":0},
        {"id":"打开","action":"完成"}
    ],
    "unite_popup_rules":true,
    "ltt_service":true
}
```
详细说明：
- [{"id":"准备中","action":"准备中","times":0}-{"id":"打开","action":"完成"}](#id准备中action准备中times0-id打开action完成)

### {"id":"准备中","action":"准备中","times":0}-{"id":"打开","action":"完成"}
规则贡献者：酷安@[ka丶Alex](http://www.coolapk.com/u/576503)

**联合规则**: MIUI 应用包自动安装。

该规则需联合以下规则使用：

- {"id":"检测中","action":"检测中","times":0}
- {"id":"继续更新","action":"继续更新","times":3}
- {"id":"继续安装","action":"继续安装","times":3}
- {"id":"安装中","action":"安装中","times":0}
- {"id":"打开","action":"完成"}