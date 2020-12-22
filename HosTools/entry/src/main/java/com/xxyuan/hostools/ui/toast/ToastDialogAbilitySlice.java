package com.xxyuan.hostools.ui.toast;

import com.xxyuan.hostools.ResourceTable;
import com.xxyuan.hostools.base.BaseAbilitySlice;
import ohos.agp.components.Text;
import ohos.agp.window.dialog.ToastDialog;

public class ToastDialogAbilitySlice extends BaseAbilitySlice {

    private Text text_click_dialog;
    private static final int TOAST_DURATION = 1000;
    private static final int TOAST_OFFSETX = 50;
    private static final int TOAST_OFFSETY = 200;

    @Override
    public int getUIContentId() {
        return ResourceTable.Layout_ability_toast_dialog;
    }

    @Override
    public void initView() {
        text_click_dialog = (Text) findComponentById(ResourceTable.Id_text_click_dialog);
    }

    @Override
    public void initData() {
    }

    @Override
    public void initEvent() {
        text_click_dialog.setClickedListener(component -> {
            ToastDialog toastDialog = new ToastDialog(this);
            toastDialog.setContentText("You clicked the first add button")
                    .setDuration(TOAST_DURATION)
                    .setOffset(TOAST_OFFSETX, TOAST_OFFSETY)
                    .show();
        });
    }
}
