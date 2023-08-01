package com.example.androidappdevelopment_i;
import androidx.appcompat.app.AppCompatActivity;

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
        Button sayHello = findViewById(R.id.btnSayHello);

        TextView textView = findViewById(R.id.textView1);

        //method for onclick the submit button is clicked
        sayHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //EditText textName = findViewById(R.id.editTextName);
                //String name = textName.getText().toString();
                //int a = 25, b=25, c;
                //c = a+b;
                //Toast.makeText(MainActivity.this, "Entered Name is :  " + name, Toast.LENGTH_SHORT).show();





            }
        });


    }



}