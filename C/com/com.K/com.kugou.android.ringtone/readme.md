# com.kugou.android.ringtone（酷狗铃声）

## 普通规则

快速复制:
```
{"popup_rules":
    [
        {"id":"iv_image","action":"close"},
        {"id":"iv_listitem_image","action":"iv_list_item_dislike"},
        {"id":"不感兴趣&无法关闭&举报广告","action":"不感兴趣"}
    ]
}
```
详细说明：
- [{"id":"iv_image","action":"close"}](#idiv_imageactionclose)
- [{"id":"iv_listitem_image","action":"iv_list_item_dislike"} - {"id":"不感兴趣&无法关闭&举报广告","action":"不感兴趣"}](#idiv_listitem_imageactioniv_list_item_dislike---id不感兴趣无法关闭举报广告action不感兴趣)

### {"id":"iv_image","action":"close"}
关闭播放界面广告

![](./assets/播放界面广告.jpg)

### {"id":"iv_listitem_image","action":"iv_list_item_dislike"} - {"id":"不感兴趣&无法关闭&举报广告","action":"不感兴趣"}
**联合规则**：关闭搜索界面广告

![](./assets/搜索界面广告.jpg)

## 增强规则
