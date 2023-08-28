# org.fungo.fungolive（天天电视直播）

⚠ 该 App 使用了 Pangle SDK（穿山甲）向用户提供广告弹窗，部分广告无法通过规则关闭。

## 基础规则

快速复制:
```
{"popup_rules":
    [
        {"id":"青少年模式","action":"我知道了"},
        {"id":"viewClose","action":"viewClose"},
        {"id":"fl_video","action":"iv_highlight_close"}
    ]
}
```
详细说明：
- [{"id":"青少年模式","action":"我知道了"}](#id青少年模式action我知道了)
- [{"id":"viewClose","action":"viewClose"}](#idviewcloseactionviewclose)
- [{"id":"fl_video","action":"iv_highlight_close"}](#idfl_videoactioniv_highlight_close)

### {"id":"青少年模式","action":"我知道了"}
关闭青少年模式弹窗

![](./assets/青少年模式弹窗.jpg)

### {"id":"viewClose","action":"viewClose"}
关闭频道页面广告

![](./assets/频道页面广告.jpg)

### {"id":"fl_video","action":"iv_highlight_close"}
关闭直播右侧精彩瞬间悬浮广告

![](./assets/直播右侧精彩瞬间悬浮广告.jpg)

## 增强规则
