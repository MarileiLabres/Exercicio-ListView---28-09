package com.example.ex2809;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView LView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LView = findViewById(R.id.LView);
        ArrayList<Integer> ListaNumeros = new ArrayList<>();

        ListaNumeros.add(1);
        ListaNumeros.add(2);
        ListaNumeros.add(3);
        ListaNumeros.add(4);
        ListaNumeros.add(5);

        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, ListaNumeros
        );

        LView.setAdapter(adapter);
    }
}