package com.test.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LayoutActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_layout);
  }

  public void openActivity(View v){
    Class activityClass;

    int i = v.getId();
    if (i == R.id.relativeLayout) {
      activityClass = RelativeLayoutActivity.class;

    } else if (i == R.id.linearLayout) {
      activityClass = LinearLayoutActivity.class;
    } else if (i == R.id.frameLayout) {
      activityClass = FrameLayoutActivity.class;
    }else if (i == R.id.coordinatorLayout) {
      activityClass = CoordinatorLayoutActivity.class;
    } else if (i == R.id.drawerLayout) {
      activityClass = DrawerLayoutActivity.class;
    }  else {
      return;
    }

    Intent intent = new Intent(this, activityClass);
    startActivity(intent);
  }
}
