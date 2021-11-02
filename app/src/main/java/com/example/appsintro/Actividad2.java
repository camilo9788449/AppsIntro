package com.example.appsintro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
    }

    public void acuadrado(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        Float lado = Float.parseFloat(editText.getText().toString());
        Float area = lado *lado ;
        Float perim = lado * 4;

        textView2.setText(String.valueOf("El area del cuadrado es " + area + " cm^2" + "\n" + "El perimetro del cuadrado es " + perim + " cm" ));

    }
}