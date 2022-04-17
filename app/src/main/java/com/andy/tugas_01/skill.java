package com.andy.tugas_01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class skill extends AppCompatActivity {

    Button profil2, lain2;
    Intent p_profil2, p_lain2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        profil2 = (Button) findViewById(R.id.profil_2);
        lain2 = (Button) findViewById(R.id.lain_2);

        profil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p_profil2 = new Intent(skill.this, MainActivity.class);
                startActivity(p_profil2);
                finish();
            }
        });

        lain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p_lain2 = new Intent(skill.this, lain.class);
                startActivity(p_lain2);
                finish();
            }
        });
    }
}