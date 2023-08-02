package com.example.androidappdevelopment_i;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText fname,email,cnum,pwd;
/*
*The onClick method in the MainActivity class handles the click events for the buttons and TextViews.
* It is implemented from the View.OnClickListener interface, which allows us to define a single onClick
* method to handle clicks for multiple views.
* */
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSubmit:
                /*This is data getting
                String name = fname.getText().toString();
                String emailId = email.getText().toString();
                String contact = cnum.getText().toString();
                Toast.makeText(this, "Name is : " +name + "\n" +"Email id : " + emailId, Toast.LENGTH_SHORT).show();
               */
                Intent intent = new Intent(this,Home.class);
                startActivity(intent);
                break;
            case R.id.textView1:
                Toast.makeText(this, "This is Forgot Password Link", Toast.LENGTH_SHORT).show();
                break;
            case R.id.textView2:
                Toast.makeText(this, "This is SignIn Link", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sayHello = findViewById(R.id.btnSubmit);
        sayHello.setOnClickListener(this);

        TextView pwdForget = findViewById(R.id.textView1);
        pwdForget.setOnClickListener(this);

        TextView signIn = findViewById(R.id.textView2);
        signIn.setOnClickListener(this);

        fname =findViewById(R.id.editTextName);
        email =findViewById(R.id.editEmail);

        cnum=findViewById(R.id.editCnum);
        pwd=findViewById(R.id.editPwd);

    }

}