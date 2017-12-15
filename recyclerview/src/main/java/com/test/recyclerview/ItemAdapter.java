package com.test.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import java.util.List;

/**
 * Created by dnlaus on 13/12/17.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder>{
  private List<Item> items;
  private OnItemClickListener itemClickListener;
  private int lastPosition = -1;

  public ItemAdapter(List<Item> items, OnItemClickListener itemClickListener){
    this.items = items;
    this.itemClickListener = itemClickListener;
  }

  @Override
  public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View v = LayoutInflater
        .from(parent.getContext())
        .inflate(R.layout.recycler_view_item, parent, false);
    return new ItemViewHolder(v, itemClickListener);
  }

  @Override
  public void onBindViewHolder(ItemViewHolder holder, int position) {
    holder.setItem(items.get(position));
    holder.animate();
  }

  @Override
  public int getItemCount() {
    return items.size();
  }
}
