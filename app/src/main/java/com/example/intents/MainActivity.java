package com.example.intents;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buttonNextPage;
    private TextView textView;
    final int requestCode = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, MainActivity2.class);
        buttonNextPage = findViewById(R.id.button_id);
        textView = findViewById(R.id.text_view);
        buttonNextPage.setOnClickListener(view -> startActivityForResult(intent, requestCode));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (this.requestCode == requestCode) {
            if (resultCode == Activity.RESULT_OK) {
                textView.setText(data.getStringExtra("result"));
            }
        }
    }
}