package com.jankin.study.popupwindowcompat;

import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jankin.popupwindowcompat.lib.PopupWindowCompat;
import com.jankin.study.popupwindowcompact.R;

public class MainActivity extends AppCompatActivity {

    Button btn_match;
    Button btn_wrap;
    Button btn_fix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_match = findViewById(R.id.btn_match);
        btn_wrap = findViewById(R.id.btn_wrap);
        btn_fix = findViewById(R.id.btn_fix);

        btn_match.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMatchPopupwindow();
            }
        });

        btn_wrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showWrapPopupwindow();
            }
        });

        btn_fix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showFixPopupwindow();
            }
        });
    }


    private void showMatchPopupwindow(){
        PopupWindowCompat popupWindow = new PopupWindowCompat(this);
        View contentView = LayoutInflater.from(this).inflate(R.layout.ppw_layout, null);
        popupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        popupWindow.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
        popupWindow.setContentView(contentView);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.showAsDropDown(btn_match);
    }

    private void showWrapPopupwindow(){
        PopupWindowCompat popupWindow = new PopupWindowCompat(this);
        View contentView = LayoutInflater.from(this).inflate(R.layout.ppw_layout, null);
        popupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        popupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow.setContentView(contentView);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.showAsDropDown(btn_wrap);
    }

    private void showFixPopupwindow(){
        PopupWindowCompat popupWindow = new PopupWindowCompat(this);
        View contentView = LayoutInflater.from(this).inflate(R.layout.ppw_layout, null);
        popupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        popupWindow.setHeight(300);
        popupWindow.setContentView(contentView);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.showAsDropDown(btn_fix);
    }
}
