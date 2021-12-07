package com.ckuandroid.wielookienkowazwrotna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Okno3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okno3);
    }

    public void powrotz3(View view) {
        finish();
    }
}