package com.example.intenttasksjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        EditText info = findViewById(R.id.info);
        Button button = findViewById(R.id.send_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (info.getText().length()==0){
                    Toast.makeText(getApplicationContext(),"To'liq to'ldiring",Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    String str = info.getText().toString();
                    intent.putExtra("info", str);
                    startActivity(intent);
                }
            }
        });
    }
}