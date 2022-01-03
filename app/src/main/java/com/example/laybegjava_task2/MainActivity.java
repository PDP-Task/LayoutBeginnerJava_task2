package com.example.laybegjava_task2;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
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

    private void initView() {
        bin.btnMain.setOnClickListener(v -> {
            User user = new User("Samandar", 18);
            intentGo(user);
        });
    }

    private void intentGo(User user) {
        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra("user", user);
        responseSec.launch(intent);
    }

    ActivityResultLauncher<Intent> responseSec = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        assert data != null;
                        bin.textMain.setText(data.getParcelableExtra("respond").toString());
                    }
                }
            }
    );
}