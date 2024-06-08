package com.example.a10242_assignment1.Fragments;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a10242_assignment1.Interfaces.Callback_Item;
import com.example.a10242_assignment1.Models.Item;
import com.example.a10242_assignment1.R;

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
        View view = inflater.inflate(R.layout.fragment_item, container, false);

        initViews(view);

        return view;
    }

    private void initViews(View view) {
        goBackButton = view.findViewById(R.id.button_go_back);
        button_buy = view.findViewById(R.id.button_buy);
        itemImage = view.findViewById(R.id.item_image);
        itemName = view.findViewById(R.id.item_name);
        itemDescription = view.findViewById(R.id.item_description);
        itemLocation = view.findViewById(R.id.item_location);
        itemPrice = view.findViewById(R.id.item_price);

        setItemDetails();
    }

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

//        Glide.with(getContext()).load(item.getImageUrl()).into(itemImage);
//        Glide.with(requireContext()).load(item.getImageUrl()).into(itemImage);
        itemImage.setImageResource(R.drawable.temporary_img);
        itemName.setText(item.getName());
        itemDescription.setText(item.getDescription());
        itemLocation.setText(item.getLocation());
        itemPrice.setText(item.getPrice());
    }


}