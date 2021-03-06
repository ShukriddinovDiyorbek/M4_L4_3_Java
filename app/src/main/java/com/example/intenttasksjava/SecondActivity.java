package com.example.intenttasksjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.intenttasksjava.model.User;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initViews();
    }

    private void initViews() {
        TextView getInfo = findViewById(R.id.getInfo);
        User user = (User) getIntent().getParcelableExtra("user");
        getInfo.setText(user.toString());
    }
}