package com.mgarcia.localimageselection;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.thumbnail_grid)
    GridView gridView;
    @BindView(R.id.main_frame_layout)
    FrameLayout mainFrameLayout;

    ThumbnailGridAdapter thumbnailGridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        thumbnailGridAdapter = new ThumbnailGridAdapter(getApplicationContext());
        gridView.setAdapter(thumbnailGridAdapter);

    }


}
