package com.example.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cak=findViewById(R.id.cak);
        cak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),celsiusk.class);
                startActivity(intent);
            }
        });

        Button caf=findViewById(R.id.caf);
        caf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),celsiusf.class);
                startActivity(intent);
            }
        });

        Button fac=findViewById(R.id.fac);
        fac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),farecel.class);
                startActivity(intent);
            }
        });

        Button kac=findViewById(R.id.kac);
        kac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),kelcel.class);
                startActivity(intent);
            }
        });
    }
}
