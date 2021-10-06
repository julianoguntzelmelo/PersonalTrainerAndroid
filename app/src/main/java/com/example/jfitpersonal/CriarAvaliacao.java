package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CriarAvaliacao extends AppCompatActivity {

    private Button impulsao;
    private Button flexoes;
    private Button resistencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_avaliacao);

        impulsao = (Button) findViewById(R.id.impulsao);
        flexoes = (Button) findViewById(R.id.flexoes);
        resistencia = (Button) findViewById(R.id.resistencia);

        impulsao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {impulsaoActivity(); }
        });

        flexoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {flexoesActivity(); }
        });

        resistencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {resistenciaActivity(); }
        });

    }

    private void impulsaoActivity() {
        startActivity(new Intent(CriarAvaliacao.this, TelaImpulsao.class));
    }

    private void flexoesActivity() {
        startActivity(new Intent(CriarAvaliacao.this, TelaFlexoes.class));
    }

    private void resistenciaActivity() {
        startActivity(new Intent(CriarAvaliacao.this, TelaResistencia.class));
    }

}