package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AvaliacoesAlunoTela extends AppCompatActivity {

    private Button avaliacoesVotarHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacoes_aluno_tela);

        avaliacoesVotarHome = (Button) findViewById(R.id.avaliacoesVoltar);

        avaliacoesVotarHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { avaliacoes_VotarHomeActivity(); }
        });

    }

    private void avaliacoes_VotarHomeActivity(){
        startActivity(new Intent(AvaliacoesAlunoTela.this, HomeAluno.class));
    }

}