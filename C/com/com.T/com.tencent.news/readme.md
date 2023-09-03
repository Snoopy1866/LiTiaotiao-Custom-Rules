# com.tencent.news（腾讯新闻）

## 基础规则

快速复制:
```
{"popup_rules":
    [
        {"id":"开启通知","action":"close_btn"},

        {"id":"查看活动详情","action":"关闭"},

        {"id":"txt_streamAd_title","action":"ad_feedback_dots"},
        {"id":"关闭广告","action":"不感兴趣"}
    ]
}
```
详细说明：
- [{"id":"开启通知","action":"close_btn"}](#id开启通知actionclose_btn)
- [{"id":"查看活动详情","action":"关闭"}](#id查看活动详情action关闭)
- [{"id":"txt_streamAd_title","action":"ad_feedback_dots"} - {"id":"关闭广告","action":"不感兴趣"}](#idtxt_streamad_titleactionad_feedback_dots---id关闭广告action不感兴趣)

### {"id":"开启通知","action":"close_btn"}
关闭开启通知弹窗

![](./assets/开启通知弹窗.jpg)

### {"id":"查看活动详情","action":"关闭"}
关闭活动弹窗

![](./assets/活动弹窗.jpg)

### {"id":"txt_streamAd_title","action":"ad_feedback_dots"} - {"id":"关闭广告","action":"不感兴趣"}
**联合规则**：关闭评论区广告

![](./assets/评论区广告.jpg)

## 增强规则
