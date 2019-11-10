package com.matheusestudos.gasosaoralcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editGasosa;
    private EditText editAlcool;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAlcool = findViewById(R.id.inputAlcool);
        editGasosa = findViewById(R.id.InputGasosa);
        txtResultado = findViewById(R.id.txtResultado);



    }

    public void calcular(View view){

        Double precoAlcool = Double.parseDouble(editAlcool.getText().toString());
        Double precoGasosa = Double.parseDouble(editGasosa.getText().toString());

        Double resultado = precoAlcool / precoGasosa;

        if( resultado >= 0.7){
            txtResultado.setText("Melhor ultilizar gasolina meu camarada!");
        }
        else{
            txtResultado.setText("Melhor ultilizar Álcool!!");
        }

        /* faz calculo (preço do alcool dividido pelo preço da gasolina )
        if o resultado >= 0.7 melhor ultilizar gasolina
        senão melhor usar alcool
         */

    }
}
