package com.example.laybegjava_task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.laybegjava_task2.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    ActivityDetailsBinding bin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bin = ActivityDetailsBinding.inflate(getLayoutInflater());
        setContentView(bin.getRoot());

        initView();
        info();
    }

    private void initView() {
        bin.btnDetail.setOnClickListener(v -> {
            Member member = new Member("Kotlin");
            sendBack(member);
        });
    }

    private void info() {
        User user = (User) getIntent().getParcelableExtra("user");
        bin.textDetail.setText(user.toString());
    }

    private void sendBack(Member member) {
        Intent intent = new Intent();
        intent.putExtra("respond", member);
        setResult(RESULT_OK, intent);
        finish();
    }
}