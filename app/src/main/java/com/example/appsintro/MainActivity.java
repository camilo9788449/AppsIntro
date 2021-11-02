package com.example.appsintro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        switch (view.getId()) {
            case R.id.button1:
                Intent intent = new Intent(this, Actividad2.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent1 = new Intent(this, Actividad3.class);
                startActivity(intent1);
                break;
            case R.id.button3:
                Intent intent2 = new Intent(this, Actividad4.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}