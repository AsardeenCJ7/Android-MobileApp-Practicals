package com.example.androidappdevelopment_i;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViews extends AppCompatActivity {

    private ListView citiesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_views);

        citiesList =findViewById(R.id.citiesList);
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Oddamavadi");
        cities.add("Valaicheanai");
        cities.add("Meeravodai");
        cities.add("Mavadicheanai");
        cities.add("Kiran");
        cities.add("Eravur");
        cities.add("Vantharumoolai");
        cities.add("Oddamavadi");
        cities.add("Valaicheanai");
        cities.add("Meeravodai");
        cities.add("Mavadicheanai");
        cities.add("Kiran");
        cities.add("Eravur");
        cities.add("Vantharumoolai");
        cities.add("Oddamavadi");
        cities.add("Valaicheanai");
        cities.add("Meeravodai");
        cities.add("Mavadicheanai");
        cities.add("Kiran");
        cities.add("Eravur");
        cities.add("Vantharumoolai");
        cities.add("Oddamavadi");
        cities.add("Valaicheanai");
        cities.add("Meeravodai");
        cities.add("Mavadicheanai");
        cities.add("Kiran");
        cities.add("Eravur");
        cities.add("Vantharumoolai");


        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                cities
        );

        citiesList.setAdapter(citiesAdapter);
    }


}