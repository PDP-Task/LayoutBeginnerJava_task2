package com.example.laybegjava_task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        initView();

    }

    public void initView() {
        TextView textView = findViewById(R.id.textView);
        User user = (User) getIntent().getSerializableExtra("key");
        textView.setText(user.toString());
    }
}