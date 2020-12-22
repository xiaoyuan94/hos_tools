package com.xxyuan.hostools.ui.toast;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class ToastDialogAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(ToastDialogAbilitySlice.class.getName());
    }
}
