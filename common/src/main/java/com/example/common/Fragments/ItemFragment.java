package com.example.common.Fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.common.Interfaces.Callback_Item;
import com.example.common.Models.Item;
import com.example.common.R;

public class ItemFragment extends Fragment {

    private Item item;
    private AppCompatButton goBackButton;
    private AppCompatButton button_buy;
    private AppCompatImageView itemImage;
    private AppCompatTextView itemName;
    private AppCompatTextView itemDescription;
    private AppCompatTextView itemLocation;
    private AppCompatTextView itemPrice;
    private Callback_Item callback_item;

    public void setItem(Item item) {
        this.item = item;
    }

    public void setCallbackItem(Callback_Item callback_item) {
        this.callback_item = callback_item;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(com.example.common.R.layout.fragment_item, container, false);

        initViews(view);

        return view;
    }

    private void initViews(View view) {
        goBackButton = view.findViewById(com.example.common.R.id.button_go_back);
        button_buy = view.findViewById(com.example.common.R.id.button_buy);
        itemImage = view.findViewById(com.example.common.R.id.item_image);
        itemName = view.findViewById(com.example.common.R.id.item_name);
        itemDescription = view.findViewById(com.example.common.R.id.item_description);
        itemLocation = view.findViewById(com.example.common.R.id.item_location);
        itemPrice = view.findViewById(com.example.common.R.id.item_price);

        setItemDetails();
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private void setItemDetails() {
        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback_item.goBack();
            }
        });

        button_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback_item.buy();
            }
        });

        Glide.with(requireContext()).load(item.getImage()).into(itemImage).onLoadFailed(requireContext().getDrawable(R.drawable.temporary_img));
        itemName.setText(item.getName());
        itemDescription.setText(item.getDescription());
        itemLocation.setText(item.getLocation());
        itemPrice.setText(item.getPrice());
    }


}