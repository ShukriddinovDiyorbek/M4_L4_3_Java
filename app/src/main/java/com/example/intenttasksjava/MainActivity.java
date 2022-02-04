package com.example.intenttasksjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.intenttasksjava.model.User;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);

        Button button = findViewById(R.id.send_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().length()==0 || age.getText().length()==0){
                    Toast.makeText(getApplicationContext(),"To'liq to'ldiring",Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    User user = new User(name.getText().toString(),age.getText().toString());
                    intent.putExtra("user", user);
                    startActivity(intent);
                }
            }
        });
    }
}