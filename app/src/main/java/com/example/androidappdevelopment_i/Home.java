package com.example.androidappdevelopment_i;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Home extends AppCompatActivity {
//remove the implements
//remove the getting value method

    private EditText value1, value2;
    private Button add, sub;
    private TextView results;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
         //on create methods above default

        //finding id and initialize

        value1 = findViewById(R.id.editNum1);
        value2 = findViewById(R.id.editNum2);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        results= findViewById(R.id.txtOut);

        //add button when click
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    add();
            }
        });

        //sub button when click
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub();
            }
        });

    }


    private void add(){
        Double num1 = Double.parseDouble(value1.getText().toString());
        Double num2 = Double.parseDouble(value2.getText().toString());
        Double res = num1 + num2;
        results.setText("Sum of Two Values : " + String.valueOf(res));
    }

    private void sub(){
        Double num1 = Double.parseDouble(value1.getText().toString());
        Double num2 = Double.parseDouble(value2.getText().toString());
        Double res = num1 - num2;
        results.setText("Sub of Two Values : " + String.valueOf(res));
    }



}

