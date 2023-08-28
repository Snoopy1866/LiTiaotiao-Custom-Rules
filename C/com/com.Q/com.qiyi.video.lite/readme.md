# com.qiyi.video.lite（爱奇艺极速版）

⚠ 该 app 控件 id 无法明确区分（大部分均为 unused_res_a），为不影响正常使用，对其适配极其有限。

## 基础规则

快速复制:
```
{"popup_rules":
    [
        {"id":"立即领现金","action":"unused_res_a"},
        {"id":"unused_res_a","action":"=关闭"}
    ]
}
```
详细说明：
- [{"id":"立即领现金","action":"unused_res_a"}](#id立即领现金actionunused_res_a)
- [{"id":"unused_res_a","action":"=关闭"}](#idunused_res_aaction关闭)

### {"id":"立即领现金","action":"unused_res_a"}
关闭立即领现金弹窗

![](./assets/立即领现金弹窗.jpg)

### {"id":"unused_res_a","action":"=关闭"}
关闭开屏广告

![](./assets/开屏广告.jpg)

## 增强规则
