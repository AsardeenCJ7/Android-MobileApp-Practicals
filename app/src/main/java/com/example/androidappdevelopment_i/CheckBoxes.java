package com.example.androidappdevelopment_i;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CheckBoxes extends AppCompatActivity {

    private CheckBox check1,check2,check3;
    private RadioGroup rgMaritalStatus;
    private Button btnList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

     check1 = findViewById(R.id.checkbox1);
     check2=findViewById(R.id.checkbox2);
     check3 =findViewById(R.id.checkbox3);
btnList = findViewById(R.id.btnListView);
     rgMaritalStatus = findViewById(R.id.rgMaritalStatus);

     rgMaritalStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
         @Override
         public void onCheckedChanged(RadioGroup radioGroup, int i) {
             switch (i){
                 case R.id.rdoMarried:
                     Toast.makeText(CheckBoxes.this, "Married", Toast.LENGTH_SHORT).show();
                     break;
                 case R.id.rdoSingle:
                     Toast.makeText(CheckBoxes.this, "Single", Toast.LENGTH_SHORT).show();
                     break;

                 case R.id.rdoRelation:
                     Toast.makeText(CheckBoxes.this, "Relationship", Toast.LENGTH_SHORT).show();
                     break;

                 default:
                     break;

             }
         }
     });

     check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
         @Override
         public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
             if (isChecked){
                 Toast.makeText(CheckBoxes.this, "Harry Potter is Checked", Toast.LENGTH_SHORT).show();
             }
             else{
                 Toast.makeText(CheckBoxes.this, "HP is checked out", Toast.LENGTH_SHORT).show();
             }
         }
     });

        check2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(CheckBoxes.this, "Joker is Checked", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(CheckBoxes.this, "Joker is checked out", Toast.LENGTH_SHORT).show();
                }
            }
        });

        check3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(CheckBoxes.this, "NGU is Checked", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(CheckBoxes.this, "NGU is checked out", Toast.LENGTH_SHORT).show();
                }
            }
        });


        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listView = new Intent(CheckBoxes.this, ListViews.class);
                startActivity(listView);
            }
        });


    }

}