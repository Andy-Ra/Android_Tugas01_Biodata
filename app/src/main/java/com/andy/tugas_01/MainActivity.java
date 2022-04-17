package com.andy.tugas_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button skill1, lain1;
    Intent p_skill1,p_lain1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        skill1 = (Button) findViewById(R.id.skill_1);
        lain1 = (Button) findViewById(R.id.lain_1);

        skill1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p_skill1 = new Intent(MainActivity.this, skill.class);
                startActivity(p_skill1);
                finish();
            }
        });

        lain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p_lain1 = new Intent(MainActivity.this, lain.class);
                startActivity(p_lain1);
                finish();
            }
        });
    }
}