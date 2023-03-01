package com.application.vladcelona.samsunglesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class ShowImageActivity extends AppCompatActivity {

    private final String TAG = "ShowImageActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);

        Log.i(TAG, "ShowImageActivity created");
        String url = getIntent().getStringExtra("url");
        ImageView imageView = findViewById(R.id.test_image);

        new DownloadImage(imageView).execute(url);
    }
}