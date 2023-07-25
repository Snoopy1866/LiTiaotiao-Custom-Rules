# com.xunlei.downloadprovider（迅雷）

## 普通规则

快速复制:
```
{"popup_rules":
    [
        {"id":"开启超级保险箱","action":"close"},
        {"id":"touch_bottom_bar_bubble_main_title_tv","action":"touch_bottom_bar_bubble_close_iv"},
        {"id":"touch_dlg_main_title_tv","action":"touch_dlg_close_iv"},
        {"id":"移动积分别浪费，迅雷会员抢先兑","action":"放弃支付"},
        {"id":"老用户专属，劲爆惊喜价","action":"放弃优惠"},
        {"id":"xl_download_guide_tip_close","action":"xl_download_guide_tip_close"}
    ]
}
```
详细说明：
- [{"id":"开启超级保险箱","action":"close"}](#id开启超级保险箱actionclose)
- [{"id":"touch_bottom_bar_bubble_main_title_tv","action":"touch_bottom_bar_bubble_close_iv"}](#idtouch_bottom_bar_bubble_main_title_tvactiontouch_bottom_bar_bubble_close_iv)
- [{"id":"touch_dlg_main_title_tv","action":"touch_dlg_close_iv"}](#idtouch_dlg_main_title_tvactiontouch_dlg_close_iv)
- [{"id":"移动积分别浪费，迅雷会员抢先兑","action":"放弃支付"}](#id移动积分别浪费迅雷会员抢先兑action放弃支付)
- [{"id":"老用户专属，劲爆惊喜价","action":"放弃优惠"}](#id老用户专属劲爆惊喜价action放弃优惠)
- [{"id":"xl_download_guide_tip_close","action":"xl_download_guide_tip_close"}](#idxl_download_guide_tip_closeactionxl_download_guide_tip_close)

### {"id":"开启超级保险箱","action":"close"}
去除 “开启超级保险箱” 弹窗

![](./assets/开启超级保险箱.jpg)

### {"id":"touch_bottom_bar_bubble_main_title_tv","action":"touch_bottom_bar_bubble_close_iv"}
去除 “云盘” 页面底部 “超值特惠” 广告

![](./assets/touch_bottom_bar_bubble_close_iv.jpg)

### {"id":"touch_dlg_main_title_tv","action":"touch_dlg_close_iv"}
去除 “我的” 页面 “会员过期” 弹窗

![](./assets/touch_dlg_close_iv.jpg)

### {"id":"移动积分别浪费，迅雷会员抢先兑","action":"放弃支付"}
去除 “移动积分兑会员” 弹窗

![](./assets/移动积分兑会员.jpg)

### {"id":"老用户专属，劲爆惊喜价","action":"放弃优惠"}
去除 “超级会员老用户” 专属弹窗

![](./assets/超级会员老用户专属弹窗.jpg)

### {"id":"xl_download_guide_tip_close","action":"xl_download_guide_tip_close"}
去除 “迅雷直播” 页面下载悬浮窗

![](./assets/xl_download_guide_tip_close.jpg)

## 增强规则
