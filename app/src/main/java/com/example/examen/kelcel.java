package com.example.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class kelcel extends AppCompatActivity {

    public EditText pant;
    public EditText val;
    double res=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelcel);
        this.setTitle(R.string.bt4);
        pant =(EditText) findViewById(R.id.pantalla4);
        val =(EditText) findViewById(R.id.valor4);

        Button cal=findViewById(R.id.calcular4);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               try {
                   double cap=Double.parseDouble(val.getText().toString());
                   res=cap-273.15;
                   pant.setText(res+" °C");
               }catch (Exception ex){
                   Toast.makeText(kelcel.this, "coloque datos validos", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }
}
