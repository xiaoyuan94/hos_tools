package com.xxyuan.hostools.ui.cplus;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class CPlusAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(CPlusAbilitySlice.class.getName());
    }
}
