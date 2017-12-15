package com.test.viewpager;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewPagerActivity extends AppCompatActivity {
  FragmentPagerAdapter pagesAdapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_view_pager);

    ViewPager viewPager = findViewById(R.id.view_pager);
    pagesAdapter = new PagesAdapter(getSupportFragmentManager());
    viewPager.setAdapter(pagesAdapter);
  }
}
