package com.wangju.fbdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.fab1)
    FloatingActionButton mFab1;
    @BindView(R.id.fab2)
    FloatingActionButton mFab2;
    @BindView(R.id.fab3)
    FloatingActionButton mFab3;
    @BindView(R.id.fab4)
    FloatingActionButton mFab4;
    @BindView(R.id.fab5)
    FloatingActionButton mFab5;
    @BindView(R.id.menu_red)
    FloatingActionMenu mMenuRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.fab1, R.id.fab2, R.id.fab3, R.id.fab4, R.id.fab5, R.id.menu_red})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fab1:
            case R.id.fab2:
            case R.id.fab3:
            case R.id.fab4:
            case R.id.fab5:
                Toast.makeText(MainActivity.this,"我被点击了",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_red:
                break;
        }
    }
}
