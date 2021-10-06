package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MetasConcluidasTelaAluno extends AppCompatActivity {

    private Button metasHistoricoAlunoVotarHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metas_concluidas_tela_aluno);

        metasHistoricoAlunoVotarHome = (Button) findViewById(R.id.historicoMetasVoltar);

        metasHistoricoAlunoVotarHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { metasHistoricoAluno_VotarHomeActivity(); }
        });

    }

    private void metasHistoricoAluno_VotarHomeActivity(){
        startActivity(new Intent(MetasConcluidasTelaAluno.this, HomeAluno.class));
    }

}