package com.aijiao.draw_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.aijiao.view.DrawView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.activity_main);
        final DrawView drawView = new DrawView(this);
        drawView.setMinimumHeight(800);
        drawView.setMinimumWidth(500);
        //通知view组件重新绘制界面
        drawView.invalidate();
        //添加view到根布局
        relativeLayout.addView(drawView);
    }

}
