package com.test.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagesAdapter extends FragmentPagerAdapter {
  private static int NUM_ITEMS = 3;

  public PagesAdapter(FragmentManager fm) {
    super(fm);
  }

  @Override
  public int getCount() {
    return NUM_ITEMS;
  }

  @Override
  public Fragment getItem(int position) {
    switch (position) {
      case 0:
        return PageFragment.newInstance(1);
      case 1:
        return PageFragment.newInstance(2);
      case 2:
        return PageFragment.newInstance(3);
      default:
        return null;
    }
  }

  // Returns the page title for the top indicator
  @Override
  public CharSequence getPageTitle(int position) {
    return "Page ".concat(String.valueOf((position+1)));
  }
}