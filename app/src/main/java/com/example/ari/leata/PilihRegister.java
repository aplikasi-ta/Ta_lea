package com.example.ari.leata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PilihRegister extends AppCompatActivity {
    String[] listArray={"Guru","Orang Tua"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_register);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.content_main,listArray);
        final ListView listview =(ListView) findViewById(R.id.array_list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                int itemPosition = position;

                String itemValue = (String) listview.getItemAtPosition(position);
                if(itemValue == "Guru"){
                    Intent intent = new Intent(PilihRegister.this, RegisterGuru.class);
                    startActivity(intent);
                } else if (itemValue == "Orang Tua") {
                    Intent intent = new Intent(PilihRegister.this, RegisterOrtuSiswa.class);
                    startActivity(intent);
                }
            }

        });
    }

}
