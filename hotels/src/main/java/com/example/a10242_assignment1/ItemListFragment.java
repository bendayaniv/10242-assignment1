package com.example.a10242_assignment1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ItemListFragment extends Fragment {

    ArrayList<Item> items;
    private RecyclerView fragmentItemsRV;
    private ItemAdapter itemAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);

        items = new ArrayList<>();

        findViews(view);

        return view;
    }

    private void findViews(View view) {
        hardCodedItems();

        itemAdapter = new ItemAdapter(getContext(), items);

        fragmentItemsRV = view.findViewById(R.id.fragmentItemsRV);
        fragmentItemsRV.setLayoutManager(new LinearLayoutManager(getContext()));
        fragmentItemsRV.setAdapter(itemAdapter);

    }

    private void hardCodedItems() {
        items.add(new Item("Name 1", "ImageUrl 1", "Description 1", "Location 1", "Price 1"));
        items.add(new Item("Name 2", "ImageUrl 2", "Description 2", "Location 2", "Price 2"));
        items.add(new Item("Name 3", "ImageUrl 3", "Description 3", "Location 3", "Price 3"));
        items.add(new Item("Name 4", "ImageUrl 4", "Description 4", "Location 4", "Price 4"));
        items.add(new Item("Name 5", "ImageUrl 5", "Description 5", "Location 5", "Price 5"));
        items.add(new Item("Name 6", "ImageUrl 6", "Description 6", "Location 6", "Price 6"));
        items.add(new Item("Name 7", "ImageUrl 7", "Description 7", "Location 7", "Price 7"));
        items.add(new Item("Name 8", "ImageUrl 8", "Description 8", "Location 8", "Price 8"));
        items.add(new Item("Name 9", "ImageUrl 9", "Description 9", "Location 9", "Price 9"));
        items.add(new Item("Name 10", "ImageUrl 10", "Description 10", "Location 10", "Price 10"));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

}