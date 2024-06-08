package com.example.a10242_assignment1.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.a10242_assignment1.Interfaces.Callback_ItemsListFragment;
import com.example.a10242_assignment1.Models.Item;
import com.example.a10242_assignment1.R;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private final Context context;
    private ArrayList<Item> items;
    private Callback_ItemsListFragment callback_itemsListFragment;

    public ItemAdapter(Context context, ArrayList<Item> items) {
        this.context = context;
        this.items = items;
    }

    public void setCallbackItemsListFragment(Callback_ItemsListFragment callback_itemsListFragment) {
        this.callback_itemsListFragment = callback_itemsListFragment;
    }


    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item_card, parent, false);
        return new ItemViewHolder(view);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = getItem(position);
        holder.name.setText(item.getName());

        Glide.with(context).load(item.getImage()).into(holder.image).onLoadFailed(context.getDrawable(R.drawable.temporary_img));
    }

    public int getItemCount() {
        return items == null ? 0 : items.size();
    }

    private Item getItem(int position) {
        return items.get(position);
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        private final ShapeableImageView image;
        private final MaterialTextView name;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.item_IMG_image);
            name = itemView.findViewById(R.id.item_LBL_name);

            itemView.setOnClickListener(v -> {
                if (callback_itemsListFragment != null) {
                    callback_itemsListFragment.goToItemPage(items.get(getAdapterPosition()));
                }
            });
        }
    }
}
