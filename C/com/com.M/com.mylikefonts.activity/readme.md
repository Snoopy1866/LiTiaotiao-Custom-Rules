# com.mylikefonts.activity（字体美化大师）

⚠ 该 App 使用了 优量汇 SDK 向用户提供广告弹窗，部分广告无法通过规则关闭。

## 普通规则

快速复制:
```
{"popup_rules":
    [
        {"id":"广告","action":"跳过"},
        {"id":"main_ad_alert","action":"main_ad_alert_close"},
        {"id":"slideshowView","action":"ivClose"}
    ]
}
```
详细说明：
- [{"id":"广告","action":"跳过"}](#id广告action跳过)
- [{"id":"main_ad_alert","action":"main_ad_alert_close"}](#idmain_ad_alertactionmain_ad_alert_close)
- [{"id":"slideshowView","action":"ivClose"}](#idslideshowviewactionivclose)

### {"id":"广告","action":"跳过"}
关闭开屏广告

![](./assets/开屏广告.jpg)

### {"id":"main_ad_alert","action":"main_ad_alert_close"}
关闭首页广告弹窗

![](./assets/关闭首页广告弹窗.jpg)

### {"id":"slideshowView","action":"ivClose"}
关闭首页上方滚动广告

⚡ 需要手动触发

![](./assets/首页上方滚动广告.jpg)

## 增强规则
