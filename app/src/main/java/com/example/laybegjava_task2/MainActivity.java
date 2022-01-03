package com.example.laybegjava_task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.laybegjava_task2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bin = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bin.getRoot());

        initView();
    }
    public void initView() {
        bin.btnOpen.setOnClickListener(v -> {
            User user = new User("Samandar",18);
            openDetailActivity(user);
        });
    }
    public void openDetailActivity(User user) {
        Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
        intent.putExtra("key",user);
        startActivity(intent);
    }
}