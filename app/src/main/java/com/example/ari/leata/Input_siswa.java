package com.example.ari.leata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Input_siswa extends AppCompatActivity {
public  static EditText txtNiss, txtNamas;
    Button btn_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_siswa);
        txtNiss = (EditText) findViewById(R.id.txtNis);
        txtNamas = (EditText) findViewById(R.id.txtNama);
        btn_next = (Button) findViewById(R.id.btn_next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Input_siswa.this, InputPelanggaran.class);
                startActivity(intent);
            }
        });
    }
}
