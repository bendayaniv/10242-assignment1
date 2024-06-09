package com.example.concerts.Utils;


import com.example.common.Models.Item;
import com.example.common.Utils.DataManagerBase;
import com.example.concerts.R;

import java.util.ArrayList;

public class DataManager extends DataManagerBase {
    @Override
    public ArrayList<Item> getItems()  {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Concert Name 1", R.drawable.img_1, "Description 1", "Location 1", "Concert Price 1"));
        items.add(new Item("Concert Name 2", R.drawable.img_2, "Concert Description 2", "Concert Location 2", "Concert Price 2"));
        items.add(new Item("Concert Name 3", R.drawable.img_3, "Concert Description 3", "Concert Location 3", "Concert Price 3"));
        items.add(new Item("Concert Name 4", R.drawable.img_4, "Concert Description 4", "Concert Location 4", "Concert Price 4"));
        items.add(new Item("Concert Name 5", R.drawable.img_5, "Concert Description 5", "Concert Location 5", "Concert Price 5"));
        items.add(new Item("Concert Name 6", R.drawable.img_6, "Concert Description 6", "Concert Location 6", "Concert Price 6"));
        items.add(new Item("Concert Name 7", R.drawable.img_7, "Concert Description 7", "Concert Location 7", "Concert Price 7"));
        items.add(new Item("Concert Name 8", R.drawable.img_8, "Concert Description 8", "Concert Location 8", "Concert Price 8"));
        items.add(new Item("Concert Name 9", R.drawable.img_9, "Concert Description 9", "Concert Location 9", "Concert Price 9"));
        items.add(new Item("Concert Name 10", R.drawable.img_10, "Concert Description 10", "Concert Location 10", "Concert Price 10"));
        return items;
    }
}
