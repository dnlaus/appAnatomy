package com.test.layouts;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CoordinatorLayoutActivity extends AppCompatActivity {

  private Button mShowSnackbarButton;
  private CoordinatorLayout mCoordinatorLayout;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_coordinator_layout);

    mCoordinatorLayout = findViewById(R.id.mainCoordinatorLayout);

    mShowSnackbarButton = findViewById(R.id.showSnackbarButton);
    mShowSnackbarButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Snackbar.make(mCoordinatorLayout,
            "Mensajito emoxitho0o0", Snackbar.LENGTH_LONG)
            .setAction("Cerrar", new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                // Custom action
              }
            }).show();
      }
    });
  }
}
