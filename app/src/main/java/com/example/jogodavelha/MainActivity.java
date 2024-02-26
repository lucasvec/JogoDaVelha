package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.resultado);
    }

    boolean vezX = true;

    int cont = 0;

    public void selecionar(View view){

        if(cont == 8){
            resultado.setText("FIM!");
        }

        cont++;
        ImageView bt = (ImageView) view;


        if (vezX) {
            bt.setImageResource((R.drawable.x));
            bt.setContentDescription("x");
            vezX = false;
            bt.setClickable(false);

        } else {
            bt.setImageResource(R.drawable.o);
            bt.setContentDescription("o");
            vezX = true;
            bt.setClickable(false);
            }
        }

        public void resetarJogo(View view){
            recreate();
        }

    }

