package com.azhansy.kolinandroiddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.azhansy.kolinandroiddemo.kotlin.Kotlin01Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickKotlin(View view) {
        Kotlin01Activity.Companion.launch(this);
    }
}
