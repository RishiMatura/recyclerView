package com.example.recyclerviewapp;

import static com.example.recyclerviewapp.R.id.recyclerView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String [] arr = {"Item 1", "Item 2", "Item 3" ,"Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c =new CustomAdapter(arr);
        recyclerView.setAdapter(c);
    }
}