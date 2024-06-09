package com.example.a10242_assignment1.Utils;

import com.example.a10242_assignment1.R;
import com.example.common.Models.Item;
import com.example.common.Utils.DataManagerBase;

import java.util.ArrayList;

public class DataManager extends DataManagerBase {
    @Override
    public ArrayList<Item> getItems()  {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Hotel Name 1", R.drawable.img_1, "Hotel Description 1", "Hotel Location 1", "Hotel Price 1"));
        items.add(new Item("Hotel Name 2", R.drawable.img_2, "Hotel Description 2", "Hotel Location 2", "Hotel Price 2"));
        items.add(new Item("Hotel Name 3", R.drawable.img_3, "Hotel Description 3", "Hotel Location 3", "Hotel Price 3"));
        items.add(new Item("Hotel Name 4", R.drawable.img_4, "Hotel Description 4", "Hotel Location 4", "Hotel Price 4"));
        items.add(new Item("Hotel Name 5", R.drawable.img_5, "Hotel Description 5", "Hotel Location 5", "Hotel Price 5"));
        items.add(new Item("Hotel Name 6", R.drawable.img_6, "Hotel Description 6", "Hotel Location 6", "Hotel Price 6"));
        items.add(new Item("Hotel Name 7", R.drawable.img_7, "Hotel Description 7", "Hotel Location 7", "Hotel Price 7"));
        items.add(new Item("Hotel Name 8", R.drawable.img_8, "Hotel Description 8", "Hotel Location 8", "Hotel Price 8"));
        items.add(new Item("Hotel Name 9", R.drawable.img_9, "Hotel Description 9", "Hotel Location 9", "Hotel Price 9"));
        items.add(new Item("Hotel Name 10", R.drawable.img_10, "Hotel Description 10", "Hotel Location 10", "Hotel Price 10"));
        return items;
    }
}
