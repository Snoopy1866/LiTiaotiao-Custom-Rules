*斜体文字均为示例或提示文本，提交 Pull Request 前请先修改或删除这些文字，并删除下方代码块中的注释，同时删除本行*
# com.*xxx.xxx*（*app名称*）

*（可选）⚠ 该 App 使用了 Pangle SDK（穿山甲）向用户提供广告弹窗，部分广告无法通过规则关闭。*

## 基础规则

快速复制:
```
{"popup_rules":
    [
        {"id":"cancel_update","action":"cancel_update"}
        /*添加更多规则，一条规则独占一行，并在上一条规则的末尾添加英文逗号*/
    ]
    /*（可选）追加参数，例如：union_popup_rules 等*/
}
```
详细说明：
- [{"id":"update_title","action":"update_cancel"}](#idupdate_titleactionupdate_cancel)
- [*("id":"xxx","action":"xxx")*](#idxxxactionxxx)

### {"id":"update_title","action":"update_cancel"}
*关闭更新弹窗* *(这里是详细说明，您应当使用“关闭”而不是“去除”，因为李跳跳并没有去除弹窗，只是帮助用户点击了跳过按钮)*

*(可选) 以下说明文字是可选的，您可以添加更多说明文字，只要您愿意*

*(可选，通常是由于 App 经过混淆，控件 id 无意义的情况) ⚠ 仅测试 8.0.50.08195 版本，其他版本可用性未知*

*(可选) ⚡ 需要手动触发*

![]() *添加截图 (可选) (⚠ 注意保护个人隐私)*

### *("id":"xxx","action":"xxx")*
*(xxx)*

![]() *添加截图 (可选) (⚠ 注意保护个人隐私)*

## 增强规则
快速复制:
```
{"popup_rules":
    [
        {"id":"cancel_update","action":"cancel_update"}
        /*添加更多规则，一条规则独占一行，并在上一条规则的末尾添加英文逗号*/
    ]
    /*（可选）追加参数，例如：union_popup_rules 等*/
}
```
详细说明：
- [{"id":"update_title","action":"update_cancel"}](#idupdate_titleactionupdate_cancel-1)
- [*("id":"xxx","action":"xxx")*](#idxxxactionxxx-1)

### {"id":"update_title","action":"update_cancel"}
*关闭更新弹窗* *(这里是详细说明，您应当使用“关闭”而不是“去除”，因为李跳跳并没有去除弹窗，只是帮助用户点击了跳过按钮)*

*(可选) 以下说明文字是可选的，您可以添加更多说明文字，只要您愿意*

*(可选，通常是由于 App 经过混淆，控件 id 无意义的情况) ⚠ 仅测试 8.0.50.08195 版本，其他版本可用性未知*

*(可选) ⚡ 需要手动触发*

![]() *添加截图 (可选) (⚠ 注意保护个人隐私)*

### *("id":"xxx","action":"xxx")*
*(xxx)*

![]() *添加截图 (可选) (⚠ 注意保护个人隐私)*