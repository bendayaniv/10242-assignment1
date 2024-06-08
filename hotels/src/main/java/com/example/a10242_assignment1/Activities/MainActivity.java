package com.example.a10242_assignment1.Activities;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a10242_assignment1.Fragments.ItemFragment;
import com.example.a10242_assignment1.Interfaces.Callback_Item;
import com.example.a10242_assignment1.Interfaces.Callback_ItemsListFragment;
import com.example.a10242_assignment1.Models.Item;
import com.example.a10242_assignment1.Fragments.ItemListFragment;
import com.example.a10242_assignment1.R;

public class MainActivity extends AppCompatActivity {

    private ItemListFragment itemListFragment;
    private ItemFragment itemFragment;

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
            Toast.makeText(MainActivity.this, "Coming Soon", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemListFragment = new ItemListFragment();
        itemListFragment.setCallbackItemsListFragment(callback_itemsListFragment);
        itemFragment = new ItemFragment();
        itemFragment.setCallbackItem(callback_item);

        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_container, itemListFragment).commit();

    }
}