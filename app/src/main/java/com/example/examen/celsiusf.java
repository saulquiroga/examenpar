package com.example.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class celsiusf extends AppCompatActivity {

    public EditText pant;
    public EditText val;
    double res=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsiusf);
        this.setTitle(R.string.bt1);
        pant =(EditText) findViewById(R.id.pantalla1);
        val =(EditText) findViewById(R.id.valor1);

        Button cal=findViewById(R.id.calcular1);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double cap=Double.parseDouble(val.getText().toString());
                    res=((9*cap)/5)+32;
                    pant.setText(res+" °F");
                }catch (Exception ex){
                    Toast.makeText(celsiusf.this, "coloque datos validos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
