# cn.quicktv.androidpro（影视大全WTV）

⚠ 该 App 使用了 优量汇 SDK 向用户提供广告弹窗，部分广告无法通过规则关闭。

## 基础规则

快速复制:
```
{"popup_rules":
    [
        {"id":"青少年模式","action":"不开启"},
        {"id":"iv_vip_order_tip","action":"iv_vip_order_close"},
        {"id":"gdt_media_view","action":"gdt_btn_close"}
    ]
}
```
详细说明：
- [{"id":"青少年模式","action":"不开启"}](#id青少年模式action不开启)
- [{"id":"iv_vip_order_tip","action":"iv_vip_order_close"}](#idiv_vip_order_tipactioniv_vip_order_close)
- [{"id":"gdt_media_view","action":"gdt_btn_close"}](#idgdt_media_viewactiongdt_btn_close)

### {"id":"青少年模式","action":"不开启"}
关闭青少年模式弹窗

![](./assets/青少年模式弹窗.jpg)

### {"id":"iv_vip_order_tip","action":"iv_vip_order_close"}
关闭视频权益红包弹窗

![](./assets/视频权益红包弹窗.jpg)

### {"id":"gdt_media_view","action":"gdt_btn_close"}
关闭视频详情页面广告

![](./assets/视频详情页面广告.jpg)

## 增强规则
