package com.example.saiko.meditasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.saiko.R;
import com.example.saiko.meditasi_sesi1;
import com.example.saiko.meditasi_sesi2;
import com.example.saiko.meditasi_sesi3;
import com.example.saiko.meditasi_sesi4;
import com.example.saiko.meditasi_sesi5;

public class SesiMeditasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesi_meditasi);
    }

    public void sesi1(View view) {
        Intent intent = new Intent(SesiMeditasiActivity.this, meditasi_sesi1.class);
        startActivity(intent);
    }

    public void sesi2(View view) {
        Intent intent = new Intent(SesiMeditasiActivity.this, meditasi_sesi2.class);
        startActivity(intent);
    }

    public void sesi3(View view) {
        Intent intent = new Intent(SesiMeditasiActivity.this, meditasi_sesi3.class);
        startActivity(intent);
    }

    public void sesi4(View view) {
        Intent intent = new Intent(SesiMeditasiActivity.this, meditasi_sesi4.class);
        startActivity(intent);
    }

    public void sesi5(View view) {
        Intent intent = new Intent(SesiMeditasiActivity.this, meditasi_sesi5.class);
        startActivity(intent);
    }
}
