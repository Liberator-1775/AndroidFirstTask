package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button buttonConfirm;
    private EditText inputField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        inputField = findViewById(R.id.plain_text_input);
        buttonConfirm = findViewById(R.id.button_id);
        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = inputField.getText().toString();
                returnBack(str);
            }
        });
    }

    private void returnBack(String str) {
        Intent intent  = new Intent();
        intent.putExtra("result", str);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}