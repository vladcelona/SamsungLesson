package com.application.vladcelona.samsunglesson;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputText = findViewById(R.id.input_text);

        Button searchButton = findViewById(R.id.search_button);
        searchButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ShowImageActivity.class);
            intent.putExtra("url", inputText.getText().toString());
            startActivity(intent);
        });
    }
}