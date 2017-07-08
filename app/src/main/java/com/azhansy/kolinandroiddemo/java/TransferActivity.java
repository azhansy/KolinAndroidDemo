package com.azhansy.kolinandroiddemo.java;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.azhansy.kolinandroiddemo.R;

/**
 * Created by zhanshuyong on 2017/7/7.
 */
public class TransferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        for (int i = 0; i < 5; i++) {
            Log.d("azhansy", "this is ：" + i);
            if (i == 3) {
                return;
            }
        }
    }
}
