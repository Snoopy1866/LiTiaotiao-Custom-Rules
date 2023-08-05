# com.ximalaya.ting.android（喜马拉雅）

## 普通规则

快速复制:
```
{"popup_rules":
    [
        {"id":"打开推送通知","action":"暂不开启"},
        {"id":"main_iv_limit_confirm","action":"main_iv_limit_close"},
        {"id":"host_lockscreen_guide_alert_dialog_rich_confirm_title_tv","action":"host_lockscreen_guide_alert_dialog_rich_confirm_cancel_btn"},
        {"id":"host_layout_vote_title","action":"host_timeline_card_close"}
    ]
}
```
详细说明：
- [{"id":"打开推送通知","action":"暂不开启"}](#id打开推送通知action暂不开启)
- [{"id":"main_iv_limit_confirm","action":"main_iv_limit_close"}](#idmain_iv_limit_confirmactionmain_iv_limit_close)
- [{"id":"host_lockscreen_guide_alert_dialog_rich_confirm_title_tv","action":"host_lockscreen_guide_alert_dialog_rich_confirm_cancel_btn"}](#idhost_lockscreen_guide_alert_dialog_rich_confirm_title_tvactionhost_lockscreen_guide_alert_dialog_rich_confirm_cancel_btn)
- [{"id":"host_layout_vote_title","action":"host_timeline_card_close"}](#idhost_layout_vote_titleactionhost_timeline_card_close)

### {"id":"打开推送通知","action":"暂不开启"}
去除打开推送通知弹窗

![](./assets/打开推送通知.jpg)

### {"id":"main_iv_limit_confirm","action":"main_iv_limit_close"}
去除红包弹窗

### {"id":"host_lockscreen_guide_alert_dialog_rich_confirm_title_tv","action":"host_lockscreen_guide_alert_dialog_rich_confirm_cancel_btn"}
去除 “开启悬浮窗锁屏功能” 弹窗

![](./assets/开启悬浮锁屏功能.jpg)

### {"id":"host_layout_vote_title","action":"host_timeline_card_close"}
去除播放页面上方投票信息

![](./assets/投票.jpg)

## 增强规则
