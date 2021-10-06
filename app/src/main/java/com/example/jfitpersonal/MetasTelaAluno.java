package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MetasTelaAluno extends AppCompatActivity {

    private Button metasAlunoVotarHome;
    private Button metasConcluidasAlunobt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metas_tela_aluno);

        metasAlunoVotarHome = (Button) findViewById(R.id.metasAlunoVoltar);

        metasAlunoVotarHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { metasAluno_VotarHomeActivity(); }
        });

        metasConcluidasAlunobt = (Button) findViewById(R.id.metasConcluidasAluno);

        metasConcluidasAlunobt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { metasConcluidas_VotarHomeActivity(); }
        });

    }

    private void metasAluno_VotarHomeActivity(){
        startActivity(new Intent(MetasTelaAluno.this, HomeAluno.class));
    }

    private void metasConcluidas_VotarHomeActivity(){
        startActivity(new Intent(MetasTelaAluno.this, MetasConcluidasTelaAluno.class));
    }

}