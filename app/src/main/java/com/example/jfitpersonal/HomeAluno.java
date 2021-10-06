package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;

public class HomeAluno extends AppCompatActivity {

    private CheckedTextView cliqueAquiSenha;
    private Button anamneseAlunoBt;
    private Button avaliacoesAlunoBt;
    private Button arquivosAlunoBt;
    private Button atividadesCasaAlunoBt;
    private Button metasAlunoBt;
    private Button treinosAlunoBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_aluno);

        cliqueAquiSenha = (CheckedTextView) findViewById(R.id.cliqueAquiNovaSenha);

        cliqueAquiSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clique_AquiSenhaActivity();
            }
        });


        anamneseAlunoBt = (Button) findViewById(R.id.anamneseAluno);

        anamneseAlunoBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { anamnese_AlunoBtActivity(); }
        });

        avaliacoesAlunoBt = (Button) findViewById(R.id.avaliacoesAluno);

        avaliacoesAlunoBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { avaliacoes_AlunoBtActivity(); }
        });

        arquivosAlunoBt = (Button) findViewById(R.id.arquivosAluno);

        arquivosAlunoBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { arquivos_AlunoBtActivity(); }
        });

        atividadesCasaAlunoBt = (Button) findViewById(R.id.atividadesCasaAluno);

        atividadesCasaAlunoBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { atividadesCasa_AlunoBtActivity(); }
        });

        metasAlunoBt = (Button) findViewById(R.id.metasAluno);

        metasAlunoBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { metas_AlunoBtActivity(); }
        });

        treinosAlunoBt = (Button) findViewById(R.id.treinosAluno);

        treinosAlunoBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { treinos_AlunoBtActivity(); }
        });

    }

    private void clique_AquiSenhaActivity() {
        startActivity(new Intent(HomeAluno.this, AlterarSenhaAluno.class));
    }

    private void anamnese_AlunoBtActivity() {
        startActivity(new Intent(HomeAluno.this, AnamneseAluno.class));
    }

    private void avaliacoes_AlunoBtActivity(){
        startActivity(new Intent(HomeAluno.this, AvaliacoesAlunoTela.class));
    }

    private void arquivos_AlunoBtActivity(){
        startActivity(new Intent(HomeAluno.this, ArquivosAlunoTela.class));
    }

    private void atividadesCasa_AlunoBtActivity(){
        startActivity(new Intent(HomeAluno.this, AtividadesCasaTelaAluno.class));
    }

    private void metas_AlunoBtActivity(){
        startActivity(new Intent(HomeAluno.this, MetasTelaAluno.class));
    }

    private void treinos_AlunoBtActivity(){
        startActivity(new Intent(HomeAluno.this, TreinosTelaAluno.class));
    }

}