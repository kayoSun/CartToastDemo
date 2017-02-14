package com.kayo.carttoastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kayo.cartoontoast.KartoonBuilder;
import com.kayo.cartoontoast.KartoonToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * CartoonToast 这个库有多种实现的方法
      * 下面就使用方法做演示
      * 每个Toast演示一种使用方法
     */

    public void showDefaultToast(View v) {
        KartoonToast.toast(this, "default_toast", KartoonToast.DEFAULT,
                KartoonToast.LENGTH_LONG);
        //如果 只用短时 展示的话 可以少最后一个参数，如下
        KartoonToast.toast(this, "default_toast", KartoonToast.DEFAULT);
    }

    public void showErrorToast(View v) {
        KartoonToast.toastError(this, "error_toast");
    }

    public void showInfoToast(View v) {
        KartoonBuilder.builder()
                .context(this)
                .type(KartoonToast.INFO)
                .message("info_toast")
                .show();
    }

    public void showSuccessToast(View v) {
        KartoonToast.toast(this, "success_toast", KartoonToast.SUCCESS);
    }

    public void showWarningToast(View v) {
        KartoonBuilder builder = KartoonBuilder.builder();
        builder.context(this);
        builder.type(KartoonToast.WARNING);
        builder.duration(KartoonToast.LENGTH_SHORT);
        builder.message("warning_toast");
        builder.show();
    }
}
