package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HistoricoAtividadesCasaTelaAluno extends AppCompatActivity {

    private Button historicoAtividadesVotarHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico_atividades_casa_tela_aluno);

        historicoAtividadesVotarHome = (Button) findViewById(R.id.historicoAtividadesVoltar);

        historicoAtividadesVotarHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { historicoAtividades_VotarHomeActivity(); }
        });

    }

    private void historicoAtividades_VotarHomeActivity(){
        startActivity(new Intent(HistoricoAtividadesCasaTelaAluno.this, HomeAluno.class));
    }

}