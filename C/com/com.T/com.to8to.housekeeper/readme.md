# com.to8to.housekeeper（土巴兔装修）

## 基础规则

快速复制:
```
{"popup_rules":
    [
        {"id":"index_pop_img","action":"img_cancel"},
        {"id":"打开推送通知","action":"iv_close_notification_alert"},
        {"id":"tv_notif","action":"iv_close"}
    ]
}
```
详细说明：
- [{"id":"index_pop_img","action":"img_cancel"}](#idindex_pop_imgactionimg_cancel)
- [{"id":"打开推送通知","action":"iv_close_notification_alert"}](#id打开推送通知actioniv_close_notification_alert)
- [{"id":"tv_notif","action":"iv_close"}](#idtv_notifactioniv_close)

### {"id":"index_pop_img","action":"img_cancel"}
去除首页广告

![](./assets/首页广告.jpg)

### {"id":"打开推送通知","action":"iv_close_notification_alert"}
去除打开推送通知提示信息

![](./assets/打开推送通知提示信息.jpg)

### {"id":"tv_notif","action":"iv_close"}
去除打开推送通知弹窗

![](./assets/打开推送通知弹窗.jpg)

## 增强规则
