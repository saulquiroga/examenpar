package com.example.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class farecel extends AppCompatActivity {

    public EditText pant;
    public EditText val;
    double res=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farecel);
        this.setTitle(R.string.bt3);
        pant =(EditText) findViewById(R.id.pantalla3);
        val =(EditText) findViewById(R.id.valor3);

        Button cal=findViewById(R.id.calcular3);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               try {
                   double cap=Double.parseDouble(val.getText().toString());
                   res=((cap-32)*5)/9;
                   pant.setText(res+" °C");
               }catch (Exception ex){
                   Toast.makeText(farecel.this, "coloque datos validos", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }
}
