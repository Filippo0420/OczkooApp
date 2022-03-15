package com.fpp.oczkoo;

import static java.lang.Math.abs;

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

    int[] wykorzystaneKarty = new int[20];
    int punktyGracz = 0;
    int punktyKrupier = 0;
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
                if(abs(punktyGracz - 21) < abs(punktyKrupier - 21)){
                    dane.setText("Wygrana punkty: " + punktyGracz + "\nPunkty krupiera: " + punktyKrupier);
                    nastepnaKarta.setEnabled(false);
                }else{
                    dane.setText("Przegrana punkty: " + punktyGracz + "\nPunkty krupiera: " + punktyKrupier);
                    nastepnaKarta.setEnabled(false);
                }
            }
        });


    }

    public void losujKarte(){
        // losowanie dla gracza
        int numer, rodzaj;

        do{
            numer = random1.nextInt(13);
            rodzaj = random2.nextInt(4);
        }while (listaKart[numer][rodzaj] == 0);

        losowaKarta.setImageResource(listaKart[numer][rodzaj]);
        listaKart[numer][rodzaj] = 0;
        wykorzystaneKarty[ileKart] = punktyLista[numer];

        punktyGracz += punktyLista[numer];
        dane.setText(punktyGracz+"");
        ileKart++;

        // losowanie dla krupiera
        if(punktyKrupier < 17){
            do{
                numer = random1.nextInt(13);
                rodzaj = random2.nextInt(4);
            }while (listaKart[numer][rodzaj] == 0);
            punktyKrupier += punktyLista[numer];
            listaKart[numer][rodzaj] = 0;
        }


        // --- --- ---

        if(punktyGracz < 21){

            dane.setText("gracz: " + punktyGracz + "\n" + "krupier: ???");
        }else if(punktyGracz == 21){
            if(abs(punktyGracz - 21) < abs(punktyKrupier - 21)){
                dane.setText("Wygrana punkty: " + punktyGracz + "\nPunkty krupiera: " + punktyKrupier);
                nastepnaKarta.setEnabled(false);
            }
        }else if(punktyGracz > 21){
            if(punktyGracz == 22){
                if(wykorzystaneKarty.length == 2){
                    dane.setText("WYGRANA" + " Pawie oczko");
                }else if(abs(punktyGracz - 21) < abs(punktyKrupier - 21)){
                    dane.setText("Wygrana punkty: " + punktyGracz + "\nPunkty krupiera: " + punktyKrupier);
                    nastepnaKarta.setEnabled(false);
                }else{
                    dane.setText("Przegrana punkty: " + punktyGracz + "\nPunkty krupiera: " + punktyKrupier);
                    nastepnaKarta.setEnabled(false);
                }
            }else{
                if(abs(punktyGracz - 21) < abs(punktyKrupier - 21)){
                    dane.setText("Wygrana punkty: " + punktyGracz + "\nPunkty krupiera: " + punktyKrupier);
                    nastepnaKarta.setEnabled(false);
                }else{
                    dane.setText("Przegrana punkty: " + punktyGracz + "\nPunkty krupiera: " + punktyKrupier);
                    nastepnaKarta.setEnabled(false);
                }
            }
        }

    }

    public void nowaGra(View view){
        listaKart = wszystkieKarty.getKartyRodzaje();
        wykorzystaneKarty = new int[10];
        punktyGracz = 0;
        punktyKrupier = 0;
        dane.setText("");
        ileKart = 0;
        losowaKarta.setImageResource(R.drawable.joker1);
        nastepnaKarta.setEnabled(true);

    }

}




/*
Karty 2 do 10 mają wartość równą wartości karty
walet – 2 pkt.
dama – 3 pkt.
król – 4 pkt.
As – 11 pkt.
 */