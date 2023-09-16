# com.kmxs.reader（七猫免费小说）

## 基础规则

快速复制:
```
{"popup_rules":
    [
        {"id":"tv_teen_dialog_title","action":"young_dialog_close_img"},
        {"id":"txt_push_open_title","action":"btn_open_cancel"},
        {"id":"七猫新人红包","action":"iv_close_bonus"},
        {"id":"red_packet_img","action":"close_red_packet"},
        {"id":"imageView","action":"imageView_close"},
        {"id":"read_view","action":"close"},
        {"id":"ad_privacy_view","action":"iv_ad_direct_close"},
        {"id":"ll_ad_bottom_remind_group","action":"ad_direct_close"}
    ]
}
```
详细说明：
- [{"id":"tv_teen_dialog_title","action":"young_dialog_close_img"}](#idtv_teen_dialog_titleactionyoung_dialog_close_img)
- [{"id":"txt_push_open_title","action":"btn_open_cancel"}](#idtxt_push_open_titleactionbtn_open_cancel)
- [{"id":"七猫新人红包","action":"iv_close_bonus"}](#id七猫新人红包actioniv_close_bonus)
- [{"id":"red_packet_img","action":"close_red_packet"}](#idred_packet_imgactionclose_red_packet)
- [{"id":"imageView","action":"imageView_close"}](#idimageviewactionimageview_close)
- [{"id":"read_view","action":"close"}](#idread_viewactionclose)
- [{"id":"ad_privacy_view","action":"iv_ad_direct_close"}](#idad_privacy_viewactioniv_ad_direct_close)
- [{"id":"ll_ad_bottom_remind_group","action":"ad_direct_close"}](#idll_ad_bottom_remind_groupactionad_direct_close)

### {"id":"tv_teen_dialog_title","action":"young_dialog_close_img"}
关闭青少年模式弹窗

![](./assets/青少年模式.jpg)

### {"id":"txt_push_open_title","action":"btn_open_cancel"}
关闭开启推送提醒弹窗

![](./assets/开启推送提醒弹窗.jpg)

### {"id":"七猫新人红包","action":"iv_close_bonus"}
关闭 “七猫新人红包” 弹窗

⚡ 可能需要手动触发

![](./assets/七猫新人红包.jpg)

### {"id":"red_packet_img","action":"close_red_packet"}
关闭右侧悬浮广告

⚠ 触发不稳定

![](./assets/右侧悬浮广告.jpg)

### {"id":"imageView","action":"imageView_close"}
关闭活动弹窗

![](./assets/活动弹窗.jpg)

### {"id":"read_view","action":"close"}
关闭每日专属推荐弹窗

![](./assets/每日专属推荐弹窗.jpg)

### {"id":"ad_privacy_view","action":"iv_ad_direct_close"}
关闭小说阅读底部广告

⚡ 可能需要手动触发

![](./assets/小说阅读底部广告.jpg)

### {"id":"ll_ad_bottom_remind_group","action":"ad_direct_close"}
关闭小说章节阅读完成后的广告

⚡ 可能需要手动触发

![](./assets/小说章节阅读完成后的广告.jpg)

## 增强规则