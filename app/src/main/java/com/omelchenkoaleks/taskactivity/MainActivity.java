package com.omelchenkoaleks.taskactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.os.Bundle;
import android.view.View;

import java.util.List;

public abstract class MainActivity extends AppCompatActivity {
    private static final String TAG = "Base";
    private List<ActivityManager.RunningTaskInfo> mList;
    private ActivityManager mActivityManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
    }

    public void onInfoClick(View view) {
    }
}
