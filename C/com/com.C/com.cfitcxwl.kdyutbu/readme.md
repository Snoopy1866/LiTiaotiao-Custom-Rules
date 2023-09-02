# com.cfitcxwl.kdyutbu（囧次元）

⚠ 该 App 使用了 Pangle SDK（穿山甲）向用户提供广告弹窗，部分广告无法通过规则关闭。

## 基础规则

快速复制:
```
{"popup_rules":
    [
        {"id":"tt_ad_logo","action":"tt_video_ad_close_layout"},

        {"id":"tt_bu_title","action":"tt_bu_close"},
        {"id":"不感兴趣&举报广告","action":"不感兴趣"}
    ]
}
```
详细说明：
- [{"id":"tt_ad_logo","action":"tt_video_ad_close_layout"}](#idtt_ad_logoactiontt_video_ad_close_layout)
- [{"id":"tt_bu_title","action":"tt_bu_close"} - {"id":"不感兴趣&举报广告","action":"不感兴趣"}](#idtt_bu_titleactiontt_bu_close---id不感兴趣举报广告action不感兴趣)

### {"id":"tt_ad_logo","action":"tt_video_ad_close_layout"}
关闭广告弹窗

![](./assets/广告弹窗.jpg)

### {"id":"tt_bu_title","action":"tt_bu_close"} - {"id":"不感兴趣&举报广告","action":"不感兴趣"}
关闭信息流广告

![](./assets/信息流广告.jpg)

## 增强规则
