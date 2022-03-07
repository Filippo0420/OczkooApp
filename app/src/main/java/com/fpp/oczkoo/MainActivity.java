package com.fpp.oczkoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button nastepnaKarta, koniecGry;

    private ArrayList<Integer> obrazy, mojeKarty;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        obrazy = new int[]{R.drawable.karty_karo, R.drawable.karty_kier};

        nastepnaKarta = findViewById(R.id.nastepnaKrata);
        koniecGry = findViewById(R.id.koniecGry);

        nastepnaKarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        koniecGry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}




/*
Karty 2 do 10 mają wartość równą wartości karty
walet – 2 pkt.
dama – 3 pkt.
król – 4 pkt.
As – 11 pkt.
 */