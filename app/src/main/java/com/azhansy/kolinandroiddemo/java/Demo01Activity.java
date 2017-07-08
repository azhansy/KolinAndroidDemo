package com.azhansy.kolinandroiddemo.java;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.azhansy.kolinandroiddemo.R;

/**
 * Created by zhanshuyong on 2017/7/7.
 */
public class Demo01Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void launch(Context context) {
        context.startActivity(new Intent(context, Demo01Activity.class));
    }
}
