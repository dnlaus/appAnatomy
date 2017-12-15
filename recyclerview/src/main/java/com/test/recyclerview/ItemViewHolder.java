package com.test.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

/**
 * Created by dnlaus on 13/12/17.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

  private Item item;
  private TextView nameTextView;
  private ImageView imageView;
  private TextView dateView;
  private TextView typeView;
  private View v;
  private OnItemClickListener itemClickListener;

  public ItemViewHolder(View v, OnItemClickListener itemClickListener) {
    super(v);
    this.v = v;
    this.itemClickListener = itemClickListener;
    this.nameTextView = v.findViewById(R.id.name_view);
    this.imageView = v.findViewById(R.id.image_view);
    this.dateView = v.findViewById(R.id.date_view);
    this.typeView = v.findViewById(R.id.type_view);

    v.setOnClickListener(this);
  }

  public void setItem(Item item){
    this.item = item;
    setupViews();
  }

  private void setupViews(){
    nameTextView.setText(item.getName());
    dateView.setText(item.getDate());
    typeView.setText(item.getType());

    Glide
        .with(v.getContext())
        .load(item.getImageUrl())
        .centerCrop()
        .override(60,60)
        .error(v.getContext().getResources().getDrawable(android.R.drawable.stat_notify_error))
        .into(this.imageView);
  }

  public void animate(){
    Animation animation = AnimationUtils.loadAnimation(v.getContext(), android.R.anim.slide_in_left);
    v.startAnimation(animation);
  }

  @Override
  public void onClick(View view) {
    itemClickListener.onItemClicked(item);
  }
}
