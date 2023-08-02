package com.example.androidappdevelopment_i;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Home extends AppCompatActivity implements View.OnClickListener {


    private String inputValueNum1, inputValueNum2;

    public void gettingValue(){
        EditText num1 = findViewById(R.id.editNum1);
        inputValueNum1 = num1.getText().toString();
        EditText num2 =  findViewById(R.id.editNum2);
        inputValueNum2 = num2.getText().toString();
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnAdd:
               gettingValue();
               int add = Integer.parseInt(inputValueNum1) + Integer.parseInt(inputValueNum2);
               String resultsAdd = String.valueOf(add);
               TextView textView1 = findViewById(R.id.txtOut);
               textView1.setText(resultsAdd);
                break;

            case R.id.btnSub:
                gettingValue();
                int sub = Integer.parseInt(inputValueNum1) - Integer.parseInt(inputValueNum2);
                String resultsSub = String.valueOf(sub);
                TextView textView2 = findViewById(R.id.txtOut);
                textView2.setText(resultsSub);
                break;

            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);

        Button btnSub = findViewById(R.id.btnSub);
        btnSub.setOnClickListener(this);


    }


}