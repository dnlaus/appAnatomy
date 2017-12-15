package com.test.appanatomy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.test.basiccomponents.BasicComponentsActivity;
import com.test.layouts.LayoutActivity;
import com.test.menus.MenuActivity;
import com.test.recyclerview.RecyclerViewActivity;
import com.test.toolbar.ToolbarActivity;
import com.test.viewpager.ViewPagerActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void openActivity(View v){
    Class activityClass = null;

    switch (v.getId()){
      case R.id.layouts:
        activityClass = LayoutActivity.class;
        break;
      case R.id.basic_components:
        activityClass = BasicComponentsActivity.class;
        break;
      case R.id.viewPager:
        activityClass = ViewPagerActivity.class;
        break;
      case R.id.toolBar:
        activityClass = ToolbarActivity.class;
        break;
      case R.id.menus:
        activityClass = MenuActivity.class;
        break;
      case R.id.recyclerView:
        activityClass = RecyclerViewActivity.class;
        break;
      default:
        return;
    }

    Intent intent = new Intent(this, activityClass);
    startActivity(intent);
  }
}
