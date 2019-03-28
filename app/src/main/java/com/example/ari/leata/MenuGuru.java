package com.example.ari.leata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MenuGuru extends AppCompatActivity {
ImageView lihats, about;
    Button btn_log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_guru);
        lihats =(ImageView) findViewById(R.id.lihat);
        about = (ImageView) findViewById(R.id.abouts);
        btn_log = (Button) findViewById(R.id.btn_log);

        lihats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuGuru.this, Input_siswa.class);
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuGuru.this, about_guru.class);
                startActivity(intent);
            }
        });

        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuGuru.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
