package com.example.concerts.Activites;

import android.os.Bundle;

import com.example.common.Activities.MainActivityBase;
import com.example.concerts.Utils.DataManager;

public class MainActivity extends MainActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dataManagerBase = new DataManager();

        super.onCreate(savedInstanceState);
    }
}