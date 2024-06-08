package com.example.a10242_assignment1.Activities;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a10242_assignment1.Utils.DataManager;
import com.example.common.Activities.MainActivityBase;
import com.example.common.Fragments.ItemFragment;
import com.example.common.Interfaces.Callback_Item;
import com.example.common.Interfaces.Callback_ItemsListFragment;
import com.example.common.Models.Item;
import com.example.common.Fragments.ItemListFragment;

public class MainActivity extends MainActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dataManagerBase = new DataManager();

        super.onCreate(savedInstanceState);
    }
}