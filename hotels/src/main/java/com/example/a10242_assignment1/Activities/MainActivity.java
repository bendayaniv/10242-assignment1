package com.example.a10242_assignment1.Activities;

import android.os.Bundle;

import com.example.a10242_assignment1.Utils.DataManager;
import com.example.common.Activities.MainActivityBase;

public class MainActivity extends MainActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dataManagerBase = new DataManager();

        super.onCreate(savedInstanceState);
    }
}