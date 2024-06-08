package com.example.a10242_assignment1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private final Context context;
    private ArrayList<Item> items;
    private Callback_Item callback_item;

    public ItemAdapter(Context context, ArrayList<Item> items) {
        this.context = context;
        this.items = items;
    }

    public void setCallbackItem(Callback_Item callback_item) {
        this.callback_item = callback_item;
    }


    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = getItem(position);
        holder.name.setText(item.getName());

//        if(item.getImageUrl() != null) {
//            Glide.with(context).load(item.getImageUrl()).into(holder.image);
//        }
//        else {
        holder.image.setImageResource(R.drawable.temporary_img);
//        }

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
                if (callback_item != null) {
                    callback_item.itemClicked(items.get(getAdapterPosition()), getAdapterPosition());
                }
            });
        }
    }
}
