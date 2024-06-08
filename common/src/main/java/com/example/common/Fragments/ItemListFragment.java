package com.example.common.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.common.Interfaces.Callback_ItemsListFragment;
import com.example.common.Models.Item;
import com.example.common.Adapters.ItemAdapter;
import com.example.common.R;
import com.example.common.Utils.DataManagerBase;

import java.util.ArrayList;

public class ItemListFragment extends Fragment {

    ArrayList<Item> items;
    private RecyclerView fragmentItemsRV;
    private ItemAdapter itemAdapter;
    private Callback_ItemsListFragment callback_itemsListFragment;
    private DataManagerBase dataManagerBase;

    public void setCallbackItemsListFragment(Callback_ItemsListFragment callback_itemsListFragment) {
        this.callback_itemsListFragment = callback_itemsListFragment;
    }

    public void setDataManagerBase(DataManagerBase dataManagerBase) {
        this.dataManagerBase = dataManagerBase;
    }


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
        items = dataManagerBase.getItems();

        itemAdapter = new ItemAdapter(getContext(), items);
        itemAdapter.setCallbackItemsListFragment(callback_itemsListFragment);

        fragmentItemsRV = view.findViewById(R.id.fragmentItemsRV);
        fragmentItemsRV.setLayoutManager(new LinearLayoutManager(getContext()));
        fragmentItemsRV.setAdapter(itemAdapter);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

}