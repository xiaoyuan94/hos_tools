package com.xxyuan.hostools.base;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;

public abstract class BaseAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(getUIContentId());
        initView();
        initData();
        initEvent();
    }

    /**
     * 获取布局id
     */
    public abstract int getUIContentId();

    /**
     * 初始化View
     */
    public abstract void initView();

    /**
     * 初始化Data
     */
    public abstract void initData();

    /**
     * 初始化Event
     */
    public abstract void initEvent();

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
