# com.qiyi.video（爱奇艺）

⚠ 该 app 控件 id 无法明确区分（大部分均为 unused_res_a），为不影响正常使用，对其适配极其有限。

## 基础规则

快速复制:
```
{"popup_rules":
    [
        {"id":"恭喜获得&红包","action":"unused_res_a"},
        {"id":"狠心离开&去看看","action":"狠心离开"},
        {"id":"=logo","action":"=close"}
    ]
}
```
详细说明：
- [{"id":"恭喜获得随机红包","action":"unused_res_a"}](#id恭喜获得随机红包actionunused_res_a)
- [{"id":"狠心离开&去看看","action":"狠心离开"}](#id狠心离开去看看action狠心离开)
- [{"id":"=logo","action":"=close"}](#idlogoactionclose)

### {"id":"恭喜获得随机红包","action":"unused_res_a"}
关闭获得随机红包弹窗

![](./assets/获得随机红包弹窗.jpg)

### {"id":"狠心离开&去看看","action":"狠心离开"}
关闭月卡0.01元购弹窗

![](./assets/月卡0.01元购弹窗.jpg)

### {"id":"=logo","action":"=close"}
关闭 “我的” 页面上方广告

![](./assets/“我的”页面上方广告.jpg)


## 增强规则
