package com.example.appcalculodeimc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txttitulo;
    EditText massa;
    EditText altura;
    TextView txtmassa;
    TextView txtaltura;
    Button botao;
    TextView txtcalculo;
    TextView um;
    TextView dois;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            loadComponents();
            botaoconfig();




    }
    protected void loadComponents(){

        txttitulo = findViewById(R.id.txttitulo);
        massa = findViewById(R.id.massa);
        altura = findViewById(R.id.altura);
        txtmassa = findViewById(R.id.txtmassa);
        txtaltura = findViewById(R.id.txtaltura);
        botao = findViewById(R.id.botao);
        txtcalculo = findViewById(R.id.txtcalculo);

        dois = findViewById(R.id.dois);

    }
    protected void calculoimc(){
        double massa1 = Double.parseDouble(massa.getText().toString());
        double altura1 = Double.parseDouble(altura.getText().toString());

        double txtcalculo = massa1 / (altura1 * altura1);

        Log.d("resultado", String.valueOf(txtcalculo));

        if(txtcalculo < 16) dois.setText("Magreza grave. "+ " " + "Seu imc é: " + txtcalculo);
        else if(txtcalculo > 16 && txtcalculo < 17) dois.setText("Magreza moderada. "+ " " + "Seu imc é: " + txtcalculo);
        else if(txtcalculo > 17 && txtcalculo < 18.5) dois.setText("Magreza leve. "+ " " + "Seu imc é: " + txtcalculo);
        else if(txtcalculo > 18.5 && txtcalculo < 25) dois.setText("Saudável. "+ " " + "Seu imc é: " + txtcalculo);
        else if(txtcalculo > 25 && txtcalculo < 30) dois.setText("Sobrepeso. "+ " " + "Seu imc é: " + txtcalculo);
        else if(txtcalculo > 30 && txtcalculo < 35) dois.setText("Obesidade grau I. "+ " " + "Seu imc é: " + txtcalculo);
        else if(txtcalculo > 35 && txtcalculo < 40) dois.setText("Obesidade grau II. "+ " " + "Seu imc é: " + txtcalculo);
        else if(txtcalculo >= 40) dois.setText("Obesidade grau III (Mórbida). "+ " " + "Seu imc é: " + txtcalculo);
    }

    protected void botaoconfig(){
        botao.setOnClickListener(view -> {
            calculoimc();
        });
    }
}