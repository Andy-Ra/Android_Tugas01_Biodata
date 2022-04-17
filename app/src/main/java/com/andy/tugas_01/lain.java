package com.andy.tugas_01;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import java.time.LocalDate;
import java.time.Period;

public class lain extends AppCompatActivity {

    Button profil3, skill3, pesan3, simpan3, kluar3;
    Intent p_profil3, p_skill3;
    LocalDate tgl_lahir, tgl_skrg;
    String nama, jk;
    int umur;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lain);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        profil3 = (Button) findViewById(R.id.profil_3);
        skill3 = (Button) findViewById(R.id.skill_3);
        pesan3 = (Button) findViewById(R.id.btn_pesan);
        simpan3 = (Button) findViewById(R.id.btn_simpan);
        kluar3 = (Button) findViewById(R.id.btn_kluar);

        nama = "Ivan Andy Ramadhan";
        jk = getString(R.string.L);
        tgl_lahir = LocalDate.of(2001, 12, 07);
        tgl_skrg = LocalDate.now();
        umur = Period.between(tgl_lahir, tgl_skrg).getYears();

        profil3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p_profil3 = new Intent(lain.this, MainActivity.class);
                startActivity(p_profil3);
                finish();
            }
        });

        skill3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p_skill3 = new Intent(lain.this, skill.class);
                startActivity(p_skill3);
                finish();
            }
        });

        pesan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder a_pesan = new AlertDialog.Builder(lain.this);
                a_pesan.setTitle("Biodata Detail");
                a_pesan.setMessage("Nama \t\t\t\t\t\t\t\t: " +nama+
                        "\nJenis Kelamin \t: " + jk +
                        "\nUsia \t\t\t\t\t\t\t\t\t: " +umur+" thn");
                a_pesan.setNeutralButton("Oke", null);
                AlertDialog d_pesan = a_pesan.create();
                d_pesan.show();
            }
        });

        simpan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder a_simpan = new AlertDialog.Builder(lain.this);
                a_simpan.setTitle("Biodata Detail");
                a_simpan.setMessage("Nama \t\t: " +nama+
                                    "\nAlamat \t: JL Laksda Adi Sucipto VIII/25 Malang");
                a_simpan.setNeutralButton("Oke", null);
                AlertDialog d_simpan = a_simpan.create();
                d_simpan.show();
            }
        });

        kluar3.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View view){
                AlertDialog.Builder a_keluar = new AlertDialog.Builder(lain.this);
                a_keluar.setMessage("Anda ingin Keluar Aplikasi ?");

                a_keluar.setPositiveButton("Ya",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                lain.this.finish();
                            }
                        }
                );
                a_keluar.setNegativeButton("Tidak", null);
                AlertDialog d_kluar = a_keluar.create();
                d_kluar.show();

            }
        });
    }
}