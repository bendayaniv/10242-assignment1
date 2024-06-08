package com.example.concerts.Utils;


import com.example.common.Models.Item;
import com.example.common.Utils.DataManagerBase;
import com.example.concerts.R;

import java.util.ArrayList;

public class DataManager extends DataManagerBase {
    @Override
    public ArrayList<Item> getItems()  {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Name 1", R.drawable.img_1, "Description 1", "Location 1", "Price 1"));
        items.add(new Item("Name 2", R.drawable.img_2, "Description 2", "Location 2", "Price 2"));
        items.add(new Item("Name 3", R.drawable.img_3, "Description 3", "Location 3", "Price 3"));
        items.add(new Item("Name 4", R.drawable.img_4, "Description 4", "Location 4", "Price 4"));
        items.add(new Item("Name 5", R.drawable.img_5, "Description 5", "Location 5", "Price 5"));
        items.add(new Item("Name 6", R.drawable.img_6, "Description 6", "Location 6", "Price 6"));
        items.add(new Item("Name 7", R.drawable.img_7, "Description 7", "Location 7", "Price 7"));
        items.add(new Item("Name 8", R.drawable.img_8, "Description 8", "Location 8", "Price 8"));
        items.add(new Item("Name 9", R.drawable.img_9, "Description 9", "Location 9", "Price 9"));
        items.add(new Item("Name 10", R.drawable.img_10, "Description 10", "Location 10", "Price 10"));
        return items;
    }
}
