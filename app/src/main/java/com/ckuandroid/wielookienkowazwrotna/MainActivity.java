package com.ckuandroid.wielookienkowazwrotna;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wyslij(View view) {
        Intent intentOkno2 = new Intent(this, Okno2.class);
        EditText doWysylki = (EditText) findViewById(R.id.do_wysylki);
        String doWysylkiStr = doWysylki.getText().toString();
        intentOkno2.putExtra("wiadomoscZGlownego", doWysylkiStr);
        intentOkno2.putExtra("wiek", 18);
        intentOkno2.putExtra("Czy kobieta", false);
        //startActivity(intentOkno2);
        startActivityForResult(intentOkno2, 2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 2){
            String komunikatZwrotStr = data.getStringExtra("wiadomoscZ2");
            String zapytanie = data.getStringExtra("zapytanie");
            TextView komunikatZwrot = (TextView) findViewById(R.id.komunikat_zwrot);
            komunikatZwrot.setText(komunikatZwrotStr + zapytanie);
        }
    }

    public void wyslij3(View view) {
        Intent intentOkno3 = new Intent(this, Okno3.class);
        startActivity(intentOkno3);
    }
}