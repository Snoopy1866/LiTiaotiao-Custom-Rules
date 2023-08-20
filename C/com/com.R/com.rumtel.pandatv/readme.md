# com.rumtel.pandatv（电视直播）

⚠ 该 App 使用了 Pangle SDK（穿山甲）向用户提供广告弹窗，部分广告无法适配。

## 普通规则

快速复制:
```
{"popup_rules":
    [
        {"id":"native_ad_container","action":"topon_btn_close"},
        {"id":"csj_ad_logo","action":"csj_btn_close"},
        {"id":"| 跳过","action":"| 跳过"},
        {"id":"再看&可领奖励","action":"坚持退出"}
    ],
    "click_way_popup":1
}
```
详细说明：
- [{"id":"native_ad_container","action":"topon_btn_close"}](#idnative_ad_containeractiontopon_btn_close)
- [{"id":"csj_ad_logo","action":"csj_btn_close"}](#idcsj_ad_logoactioncsj_btn_close)
- [{"id":"| 跳过","action":"| 跳过"} - {"id":"再看&可领奖励","action":"坚持退出"}](#id-跳过action-跳过---id再看可领奖励action坚持退出)

### {"id":"native_ad_container","action":"topon_btn_close"}
关闭直播页面广告-1

![](./assets/直播页面广告-1.jpg)

### {"id":"csj_ad_logo","action":"csj_btn_close"}
关闭直播页面广告-2

![](./assets/直播页面广告-2.jpg)

### {"id":"| 跳过","action":"| 跳过"} - {"id":"再看&可领奖励","action":"坚持退出"}
**联合规则**：关闭进入直播时弹出的广告 (⚠ 触发不稳定)

![](./assets/进入直播时弹出的广告.jpg)

## 增强规则
