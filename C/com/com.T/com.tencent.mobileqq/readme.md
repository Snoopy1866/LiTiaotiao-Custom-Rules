# com.tencent.mobileqq（QQ）

## 基础规则

快速复制:
```
{"popup_rules":
    [
        {"id":"lpk","action":"关闭"},
        {"id":"=广告","action":"=更多"},
        {"id":"=关闭此条广告","action":"=关闭此条广告"},
        {"id":"=立即前往","action":"close"}
    ]
}
```
详细说明：
- [{"id":"lpk","action":"关闭"}](#idlpkaction关闭)
- [{"id":"=广告","action":"=更多"} - {"id":"=关闭此条广告","action":"=关闭此条广告"}](#id广告action更多---id关闭此条广告action关闭此条广告)
- [{"id":"=立即前往","action":"close"}](#id立即前往actionclose)

### {"id":"lpk","action":"关闭"}
关闭 “消息” 页面上方广告

![](./assets/消息页面上方广告.jpg)

### {"id":"=广告","action":"=更多"} - {"id":"=关闭此条广告","action":"=关闭此条广告"}
**联合规则**: 关闭好友动态页面广告推荐

![](./assets/好友动态广告推荐.jpg)

### {"id":"=立即前往","action":"close"}
关闭 “频道” 页面广告弹窗

![](./assets/“频道”%20页面广告弹窗.jpg)

## 增强规则
