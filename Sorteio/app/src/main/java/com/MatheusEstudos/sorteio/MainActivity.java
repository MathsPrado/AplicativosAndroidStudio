package com.MatheusEstudos.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarBotao(View v){
        int b = new Random().nextInt(100);

        TextView txt = findViewById(R.id.txtTitle);
        txt.setText("O numero sorteado foi: " + b);

    }
}
