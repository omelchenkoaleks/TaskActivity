package com.omelchenkoaleks.taskactivity;

import android.content.Intent;
import android.view.View;

public class ActivityC extends MainActivity {

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, ActivityD.class));
    }
}
