package com.example.common.Activities;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.common.Fragments.ItemFragment;
import com.example.common.Fragments.ItemListFragment;
import com.example.common.Interfaces.Callback_Item;
import com.example.common.Interfaces.Callback_ItemsListFragment;
import com.example.common.Models.Item;
import com.example.common.R;
import com.example.common.Utils.DataManagerBase;


public class MainActivityBase extends AppCompatActivity {

    private ItemListFragment itemListFragment;
    private ItemFragment itemFragment;
    protected DataManagerBase dataManagerBase;

    Callback_ItemsListFragment callback_itemsListFragment = new Callback_ItemsListFragment() {
        @Override
        public void goToItemPage(Item item) {
            itemFragment.setItem(item);
            getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_container, itemFragment).addToBackStack(null).commit();
        }
    };

    Callback_Item callback_item = new Callback_Item() {
        @Override
        public void goBack() {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_container, itemListFragment).addToBackStack(null).commit();
        }

        @Override
        public void buy() {
            Toast.makeText(MainActivityBase.this, "Coming Soon", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemListFragment = new ItemListFragment();
        itemListFragment.setCallbackItemsListFragment(callback_itemsListFragment);
        itemListFragment.setDataManagerBase(dataManagerBase);
        itemFragment = new ItemFragment();
        itemFragment.setCallbackItem(callback_item);

        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_container, itemListFragment).commit();

    }
}