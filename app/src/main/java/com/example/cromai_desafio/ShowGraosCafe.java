package com.example.cromai_desafio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShowGraosCafe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_graos_cafe);

        //Getting list in activity
        ListView List = findViewById(R.id.listCafe);
        //Getting extrar
        Intent intent=getIntent();
        String[] valueOfKey = intent.getStringArrayExtra("cafeArray");
        //Show array
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, valueOfKey);//Set the adapter on my list
        List.setAdapter(adapter);
    }
}