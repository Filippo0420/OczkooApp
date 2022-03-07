package com.fpp.oczkoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button nastepnaKarta, koniecGry;
    private ImageView losowaKarta;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] cardsId ={R.drawable.karty_karo, R.drawable.karty_kier, R.drawable.karty_pik, R.drawable.karty_trefl};
        Random random= new Random();

        nastepnaKarta = findViewById(R.id.nastepnaKrata);
        koniecGry = findViewById(R.id.koniecGry);
        losowaKarta = findViewById(R.id.losowaKarta);

        nastepnaKarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int losowa = random.nextInt(cardsId.length-1);
                losowaKarta.setImageResource(cardsId[losowa]);
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