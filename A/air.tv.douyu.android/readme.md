# air.tv.douyu.android（斗鱼）

## 基础规则

快速复制:
```
{"popup_rules":
    [
        {"id":"发现新版本","action":"忽略"},
        {"id":"byr","action":"byr","times":5},
        {"id":"page-title","action":"avq"},
    ],
    "click_way_popup":1
}
```
详细说明：
- [{"id":"发现新版本","action":"忽略"}](#id发现新版本action忽略)
- [{"id":"byr","action":"byr","times":5}](#idbyractionbyrtimes5)
- [{"id":"page-title","action":"avq"}](#idpage-titleactionavq)

### {"id":"发现新版本","action":"忽略"}
去除更新弹窗

![](./assets/更新弹窗.jpg)

### {"id":"byr","action":"byr","times":5}
去除直播键右侧悬浮广告（⚠ 7.5.5 版本适用，其他版本未知）

![](./assets/直播间右侧悬浮广告.jpg)

### {"id":"page-title","action":"avq"}
去除直播间横幅广告（⚠ 7.5.5 版本适用，其他版本未知）

![](./assets/直播间横幅广告.jpg)


## 增强规则
