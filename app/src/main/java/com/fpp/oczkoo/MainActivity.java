package com.fpp.oczkoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private Button nastepnaKarta, koniecGry;
    private ImageView losowaKarta;
    private TextView dane;

    private listyKart wszystkieKarty = new listyKart();
    private int[][] listaKart = wszystkieKarty.getKartyRodzaje();
    //private int[] listaPunktow = wszystkieKarty.getKartyPunkty();
    private Random random1= new Random();
    private Random random2= new Random();

    private static int[] punktyLista = {
            2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 4, 11
    };


    ArrayList<Pair<Integer, Integer>> wylosowane;
    int[] mojeKarty = new int[10];
    int punkty = 0;
    int ileKart = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nastepnaKarta = findViewById(R.id.nastepnaKrata);
        koniecGry = findViewById(R.id.koniecGry);
        losowaKarta = findViewById(R.id.losowaKarta);
        dane = findViewById(R.id.dane);



        nastepnaKarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                losujKarte();
            }
        });

        koniecGry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dane.setText("Twoje punkty: " + punkty);
                nastepnaKarta.setEnabled(false);
            }
        });


    }

    public void losujKarte(){
        int numer, rodzaj;

        do{
            numer = random1.nextInt(13);
            rodzaj = random2.nextInt(4);
        }while (wylosowane.contains(Pair.create(numer, rodzaj)));
        wylosowane.add(Pair.create(numer, rodzaj));

        losowaKarta.setImageResource(listaKart[numer][rodzaj]);

        mojeKarty[ileKart] = punktyLista[numer];

        punkty += punktyLista[numer];
        dane.setText(punkty+"");
        ileKart++;
        if(punkty < 21){

            dane.setText(punkty + "");
        }else if(punkty == 21){
            dane.setText("WYGRANA" + " twoje punkty: " + punkty);
            nastepnaKarta.setEnabled(false);
        }else if(punkty > 21){
            if(punkty == 22){
                if(mojeKarty.length == 2){
                    dane.setText("WYGRANA" + " Pawie oczko");
                }else{
                    dane.setText("PRZEGRANA   " + punkty);
                    nastepnaKarta.setEnabled(false);
                }
            }else{
                dane.setText("PRZEGRANA   " + punkty);
                nastepnaKarta.setEnabled(false);
            }
        }

    }

    public void nowaGra(){
        listaKart = wszystkieKarty.getKartyRodzaje();
        mojeKarty = new int[10];
        punkty = 0;
        dane.setText("");

    }

}




/*
Karty 2 do 10 mają wartość równą wartości karty
walet – 2 pkt.
dama – 3 pkt.
król – 4 pkt.
As – 11 pkt.
 */