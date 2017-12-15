package com.test.viewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PageFragment extends Fragment {
  private static final String POSITION_KEY = "position";

  private TextView fragmentPosition;
  private int position;

  public PageFragment() {}

  public static PageFragment newInstance(int position) {
    PageFragment pageFragment = new PageFragment();
    Bundle bundle = new Bundle();
    bundle.putInt(POSITION_KEY, position);
    pageFragment.setArguments(bundle);
    return pageFragment;
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    this.position = getArguments().getInt(POSITION_KEY);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_page, container, false);
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    fragmentPosition = view.findViewById(R.id.fragment_position);
    fragmentPosition.setText(String.format(getString(R.string.fragment_position), position));
  }
}
