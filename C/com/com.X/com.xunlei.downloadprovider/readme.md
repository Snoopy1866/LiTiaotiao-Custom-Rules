# com.xunlei.downloadprovider（迅雷）

## 普通规则

快速复制:
```
{"popup_rules":
    [
        {"id":"开启超级保险箱","action":"close"},
        {"id":"touch_bottom_bar_bubble_main_title_tv","action":"touch_bottom_bar_bubble_close_iv"},
        {"id":"touch_dlg_main_title_tv","action":"touch_dlg_close_iv"}
    ]
}
```
详细说明：
- [{"id":"开启超级保险箱","action":"close"}](#id开启超级保险箱actionclose)
- [{"id":"touch_bottom_bar_bubble_main_title_tv","action":"touch_bottom_bar_bubble_close_iv"}](#idtouch_bottom_bar_bubble_main_title_tvactiontouch_bottom_bar_bubble_close_iv)
- [{"id":"touch_dlg_main_title_tv","action":"touch_dlg_close_iv"}](#idtouch_dlg_main_title_tvactiontouch_dlg_close_iv)

### {"id":"开启超级保险箱","action":"close"}
去除 “开启超级保险箱” 弹窗

![](./assets/开启超级保险箱.jpg)

### {"id":"touch_bottom_bar_bubble_main_title_tv","action":"touch_bottom_bar_bubble_close_iv"}
去除 “云盘” 页面底部 “超值特惠” 广告

![](./assets/touch_bottom_bar_bubble_close_iv.jpg)

### {"id":"touch_dlg_main_title_tv","action":"touch_dlg_close_iv"}
去除 “我的” 页面 “会员过期” 弹窗

![](./assets/touch_dlg_close_iv.jpg)

## 增强规则
