# com.unionpay（云闪付）

## 基础规则

快速复制:
```
{"popup_rules":
    [
        {"id":"开启定位权限","action":"locate_iv_close"},
        {"id":"marquee","action":"关闭"},
        {"id":"fortune_adv","action":"关闭"}
    ]
}
```
详细说明：
- [{"id":"开启定位权限","action":"locate_iv_close"}](#id开启定位权限actionlocate_iv_close)
- [{"id":"marquee","action":"关闭"}](#idmarqueeaction关闭)
- [{"id":"fortune_adv","action":"关闭"}](#idfortune_advaction关闭)

### {"id":"开启定位权限","action":"locate_iv_close"}
去除首页开启定位权限提示信息

![](./assets/开启定位权限.jpg)

### {"id":"marquee","action":"关闭"}
去除 “我的” 页面滚动广告

![](./assets/滚动广告.jpg)

### {"id":"fortune_adv","action":"关闭"}
去除 “金融” 页面 “幸运” 广告

![](./assets/幸运广告.jpg)

## 增强规则
