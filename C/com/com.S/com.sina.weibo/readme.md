# com.sina.weibo（微博）

## 普通规则

快速复制:
```
{"popup_rules":
    [
        {"id":"打开通知，及时收到互动消息","action":"right_icon"},
        {"id":"选择通知类型","action":"暂不开启"},
        {"id":"bottom_process_tv","action":"close"},
        {"id":"使用您的位置信息","action":"以后再说"},

        {"id":"tv_tips","action":"iv_close_icon"},
        {"id":"不感兴趣&为何会看到此广告","action":"不感兴趣"}
    ]
}
```
详细说明：
- [{"id":"打开通知，及时收到互动消息","action":"right_icon"}](#id打开通知及时收到互动消息actionright_icon)
- [{"id":"选择通知类型","action":"暂不开启"}](#id选择通知类型action暂不开启)
- [{"id":"bottom_process_tv","action":"close"}](#idbottom_process_tvactionclose)
- [{"id":"使用您的位置信息","action":"以后再说"}](#id使用您的位置信息action以后再说)
- [{"id":"tv_tips","action":"iv_close_icon"} - {"id":"不感兴趣&为何会看到此广告","action":"不感兴趣"}](#idtv_tipsactioniv_close_icon---id不感兴趣为何会看到此广告action不感兴趣)

### {"id":"打开通知，及时收到互动消息","action":"right_icon"}
关闭打开通知提示信息

![](./assets/打开通知提示信息.jpg)

### {"id":"选择通知类型","action":"暂不开启"}
关闭选择通知类型弹窗

![](./assets/选择通知类型弹窗.jpg)

### {"id":"bottom_process_tv","action":"close"}
关闭 “首页” 页面 “刷微博领现金” 悬浮控件

![](./assets/hongbao_pop.jpg)

### {"id":"使用您的位置信息","action":"以后再说"}
关闭 “使用位置信息” 弹窗

![](./assets/location.jpg)

### {"id":"tv_tips","action":"iv_close_icon"} - {"id":"不感兴趣&为何会看到此广告","action":"不感兴趣"}

**联合规则** : 关闭评论区广告

⚡ 需要手动触发

![](./assets/评论区广告.jpg)

## 增强规则
