package com.lattez.networktype;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by weish on 2016/5/12.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Intent changeNetwork = new Intent();
            changeNetwork.setClassName("com.android.settings", "com.android.settings.RadioInfo");
            startActivity(changeNetwork);
            finish();
        } catch (java.lang.Exception e) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("您的手机不支持打开网络设置，请卸载软件");
            builder.setTitle("提示");
            builder.setNeutralButton("关闭", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.show();
        }
    }
}
