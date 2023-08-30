# com.xunruifairy.wallpaper（壁纸精灵）

⚠ 该 App 使用了 Pangle SDK（穿山甲）向用户提供广告弹窗，部分广告无法通过规则关闭。

## 基础规则

快速复制:
```
{"popup_rules":
    [
        {"id":"da_container","action":"closeAd"},
        {"id":"itah_layout","action":"closeAd"},
        {"id":"iltas_ad_layout","action":"closeAd"}
    ]
}
```
详细说明：
- [{"id":"da_container","action":"closeAd"}](#idda_containeractionclosead)
- [{"id":"itah_layout","action":"closeAd"}](#iditah_layoutactionclosead)
- [{"id":"iltas_ad_layout","action":"closeAd"}](#idiltas_ad_layoutactionclosead)

### {"id":"da_container","action":"closeAd"}
关闭首页广告弹窗

![](./assets/首页广告弹窗.jpg)

### {"id":"itah_layout","action":"closeAd"}
关闭首页信息流巨幅广告

![](./assets/首页信息流巨幅广告.jpg)

### {"id":"iltas_ad_layout","action":"closeAd"}
关闭首页信息流小幅广告

![](./assets/首页信息流小幅广告.jpg)

## 增强规则
