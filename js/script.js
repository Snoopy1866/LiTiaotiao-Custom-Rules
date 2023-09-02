function loadJSON(type) {
    console.log(`
    ███████╗██╗    ██╗██████╗ ███████╗ ██████╗ ██████╗ ██████╗ 
    ██╔════╝██║    ██║╚════██╗╚════██║██╔════╝ ╚════██╗╚════██╗
    █████╗  ██║ █╗ ██║ █████╔╝    ██╔╝███████╗  █████╔╝ █████╔╝
    ██╔══╝  ██║███╗██║██╔═══╝    ██╔╝ ██╔═══██╗██╔═══╝  ╚═══██╗
    ██║     ╚███╔███╔╝███████╗   ██║  ╚██████╔╝███████╗██████╔╝
    ╚═╝      ╚══╝╚══╝ ╚══════╝   ╚═╝   ╚═════╝ ╚══════╝╚═════╝ 
    Github:https://github.com/FW27623                                                           
    `);
    var urls = {
        'basic': 'https://cdn.jsdelivr.net/gh/Snoopy1866/LiTiaotiao-Custom-Rules@latest/BasicRules.json',
        'all': 'https://cdn.jsdelivr.net/gh/Snoopy1866/LiTiaotiao-Custom-Rules@latest/AllRules.json'
    };
    var url = urls[type];
    var ruleName = type === 'basic' ? '基础规则' : '全部规则';

    var ruleType = document.getElementById('rule-type');
    ruleType.innerHTML = `<b>当前选择的是<span class="highlight">${ruleName}</span></b>`;

    var cachedData = localStorage.getItem(url);
    var cacheTime = localStorage.getItem(url + '-time');
    var now = new Date().getTime();
    if (cachedData && cacheTime && (now - cacheTime < 10 * 60 * 1000)) {
        var diff = Math.round((now - cacheTime) / 1000);
        var size = Math.round(cachedData.length / 1024);
        console.log(`从缓存中加载数据：${ruleName}，已缓存时间：${diff}秒，大小：${size}KB`);
        document.getElementById('json-text').value = cachedData;
    } else {
        console.log(`请求数据：${ruleName}`);
        fetch(url)
            .then(response => {
                console.log(`响应状态码：${response.status}`);
                return response.text();
            })
            .then(data => {
                localStorage.setItem(url, data);
                localStorage.setItem(url + '-time', now);
                var size = Math.round(data.length / 1024);
                console.log(`缓存数据：${ruleName}，大小：${size}KB`);
                document.getElementById('json-text').value = data;
            });
    }
}

function copyText() {
    var text = document.getElementById('json-text');
    text.select();
    navigator.clipboard.writeText(text.value);

    var message = document.getElementById('copy-message');
    message.textContent = '文本已成功复制到剪贴板中！';

    setTimeout(function() {
        message.textContent = '';
    }, 8000);
}

window.addEventListener('beforeunload', function() {
    localStorage.clear();
});