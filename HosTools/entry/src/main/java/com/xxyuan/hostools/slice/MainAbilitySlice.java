package com.xxyuan.hostools.slice;

import com.xxyuan.hostools.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Text;

public class MainAbilitySlice extends AbilitySlice {

    private Text t_click_js,t_click_c_plus,t_click_toast;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        initView();
        initEvent();
    }

    private void initView() {
        t_click_js = (Text) findComponentById(ResourceTable.Id_t_click_js);
        t_click_toast = (Text) findComponentById(ResourceTable.Id_t_click_toast);
        t_click_c_plus = (Text) findComponentById(ResourceTable.Id_t_click_c_plus);
    }

    private void initEvent() {
        t_click_js.setClickedListener(component -> {
            //跳转到另外一个JS界面
            Intent secondIntent = new Intent();
            // 指定待启动FA的bundleName和abilityName
            Operation operation = new Intent.OperationBuilder()
                    .withDeviceId("")
                    .withBundleName("com.xxyuan.hostools")
                    .withAbilityName("com.xxyuan.hostools.ui.js.JSAbility")
                    .build();
            secondIntent.setOperation(operation);
            startAbility(secondIntent); // 通过AbilitySlice的startAbility接口实现启动另一个页面
        });

        t_click_toast.setClickedListener(component -> {
            //跳转到另外一个JS界面
            Intent secondIntent = new Intent();
            // 指定待启动FA的bundleName和abilityName
            Operation operation = new Intent.OperationBuilder()
                    .withDeviceId("")
                    .withBundleName("com.xxyuan.hostools")
                    .withAbilityName("com.xxyuan.hostools.ui.toast.ToastDialogAbility")
                    .build();
            secondIntent.setOperation(operation);
            startAbility(secondIntent); // 通过AbilitySlice的startAbility接口实现启动另一个页面
        });

        t_click_c_plus.setClickedListener(component -> {
            //跳转到另外一个JS界面
            Intent secondIntent = new Intent();
            // 指定待启动FA的bundleName和abilityName
            Operation operation = new Intent.OperationBuilder()
                    .withDeviceId("")
                    .withBundleName("com.xxyuan.hostools")
                    .withAbilityName("com.xxyuan.hostools.ui.cplus.CPlusAbility")
                    .build();
            secondIntent.setOperation(operation);
            startAbility(secondIntent); // 通过AbilitySlice的startAbility接口实现启动另一个页面
        });
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
