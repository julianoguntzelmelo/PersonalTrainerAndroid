package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AtividadesCasaTelaAluno extends AppCompatActivity {

    private Button atividadesCasaVotarHome;
    private Button atividadesCasaHistoricobt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividades_casa_tela_aluno);

        atividadesCasaVotarHome = (Button) findViewById(R.id.atividadesCasaVoltar);

        atividadesCasaVotarHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { atividadesCasa_VotarHomeActivity(); }
        });

        atividadesCasaHistoricobt = (Button) findViewById(R.id.atividadesCasaHistorico);

        atividadesCasaHistoricobt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { atividades_CasaHistoricoActivity(); }
        });

    }

    private void atividadesCasa_VotarHomeActivity(){
        startActivity(new Intent(AtividadesCasaTelaAluno.this, HomeAluno.class));
    }

    private void atividades_CasaHistoricoActivity(){
        startActivity(new Intent(AtividadesCasaTelaAluno.this, HistoricoAtividadesCasaTelaAluno.class));
    }

}