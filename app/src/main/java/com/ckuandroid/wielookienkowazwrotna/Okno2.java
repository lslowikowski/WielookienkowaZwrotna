package com.ckuandroid.wielookienkowazwrotna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Okno2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okno2);
        Intent intentOkno2 = getIntent();
        String komunikatStr = intentOkno2.getStringExtra("wiadomoscZGlownego");
        int wiek = intentOkno2.getIntExtra("wiek", 0);
        boolean czyKobieta = intentOkno2.getBooleanExtra("Czy kobieta", true);
        TextView komunikat = (TextView) findViewById(R.id.komunikat);
        if(czyKobieta && wiek<20) {
            komunikatStr = komunikatStr +". Witamy Panienkę";
        }else if(czyKobieta && wiek>20){
            komunikatStr = komunikatStr +". Witamy Panią";
        }else if(!czyKobieta && wiek<20) {
            komunikatStr = komunikatStr +". Witamy Kawalera";
        }else if(!czyKobieta && wiek>20){
            komunikatStr = komunikatStr +". Witamy Pana";
        }
        komunikat.setText(komunikatStr);
        komunikat.setText(komunikatStr);
    }

    public void powrot(View view) {
        EditText doZwrotu = (EditText) findViewById(R.id.do_zwrotu);
        String doZwrotuStr = doZwrotu.getText().toString();
        Intent intentGlowne = new Intent();
        intentGlowne.putExtra("wiadomoscZ2", doZwrotuStr);
        intentGlowne.putExtra("zapytanie", "A ty kim jesteś?");
        setResult(2, intentGlowne);
        finish();
    }
}