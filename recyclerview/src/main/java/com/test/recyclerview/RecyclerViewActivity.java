package com.test.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class RecyclerViewActivity extends AppCompatActivity implements OnItemClickListener {

  private RecyclerView recyclerView;
  private ItemAdapter itemAdapter;
  private List<Item> items;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_recycler_view);
    setupRecyclerView();
    setupItems();
  }

  private void setupItems(){
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Item item;
    for (int i = 0; i < 40; i++){
      item = new Item(
          "http://my.marketeer.co/static/img/user-default.png",
          "user".concat(String.valueOf(items.size())),
          dateFormat.format(new Date()),
          String.valueOf(new Random().nextInt(3))
      );
      items.add(item);
    }
    itemAdapter.notifyDataSetChanged();
  }

  private void setupRecyclerView(){
    items = new ArrayList<>();
    recyclerView = findViewById(R.id.recyclerView);
    itemAdapter = new ItemAdapter(items, this);
    recyclerView.setAdapter(itemAdapter);
    final LinearLayoutManager layoutManager =
        new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
    recyclerView.setLayoutManager(layoutManager);

    recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
      private int visibleThreshold = 2;
      private int lastVisibleItem, totalItemCount;
      @Override
      public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);

        totalItemCount = layoutManager.getItemCount();
        lastVisibleItem = layoutManager.findLastVisibleItemPosition();
        if (totalItemCount <= (lastVisibleItem + visibleThreshold)) {
          //setupItems();
        }
      }
    });
  }


  @Override
  public void onItemClicked(Item item) {
    Toast.makeText(this, item.getName().concat(" was deleted"), Toast.LENGTH_SHORT).show();
    itemAdapter.notifyItemRemoved(items.indexOf(item));
    items.remove(item);
  }
}
