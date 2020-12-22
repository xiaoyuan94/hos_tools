package com.xxyuan.hostools.ui.js;

import ohos.aafwk.content.Intent;
import ohos.ace.ability.AceAbility;

public class JSAbility extends AceAbility {

    @Override
    public void onStart(Intent intent) {
        setInstanceName("JSAbility");  // config.json配置文件中ability.js.name的标签值。
        super.onStart(intent);
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
