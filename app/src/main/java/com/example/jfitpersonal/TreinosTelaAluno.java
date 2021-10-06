package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TreinosTelaAluno extends AppCompatActivity {

    private Button treinosAlunoVoltarHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treinos_tela_aluno);

        treinosAlunoVoltarHome = (Button) findViewById(R.id.treinosAlunoVoltar);

        treinosAlunoVoltarHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { treinosAluno_VoltarHomeActivity(); }
        });

    }

    private void treinosAluno_VoltarHomeActivity(){
        startActivity(new Intent(TreinosTelaAluno.this, HomeAluno.class));
    }

}