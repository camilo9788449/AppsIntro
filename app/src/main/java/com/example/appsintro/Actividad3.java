package com.example.appsintro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
    }

    public void acirculo(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        Float radio = Float.parseFloat(editText.getText().toString());
        double area = 3.1416 * (radio * radio) ;
        double perim = 2 * 3.1416 * radio ;

        textView2.setText(String.valueOf("El area del circulo es " + area + " cm^2" + "\n" + "El perimetro del circulo es " + perim + " cm^" ));

    }
}