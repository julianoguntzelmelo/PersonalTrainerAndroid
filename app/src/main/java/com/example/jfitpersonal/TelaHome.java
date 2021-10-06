package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaHome extends AppCompatActivity {

    private Button sair;
    private Button adicionarAluno;
    private Button criarAnamnese;
    private Button criarAvaliacao;
    private Button adicionarTreino;
    private Button btnListarAlunos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_home);

        sair = (Button) findViewById(R.id.sair);
        adicionarAluno = (Button) findViewById(R.id.adicionarAluno);
        criarAnamnese = (Button) findViewById(R.id.criarAnamnese);
        adicionarTreino = (Button) findViewById(R.id.adicionarTreino);
        criarAvaliacao = (Button) findViewById(R.id.criarAvaliacao);
        btnListarAlunos = (Button) findViewById(R.id.btnAlunos);

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {sairActivity(); }
        });

        adicionarAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {adicionarAlunoActivity(); }
        });

        criarAnamnese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {criarAnamneseActivity(); }
        });

        adicionarTreino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {adicionarTreinoActivity(); }
        });

        criarAvaliacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {criarAvaliacaoActivity(); }
        });

        btnListarAlunos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {btnListarAlunosActivity(); }
        });

    }

    private void sairActivity() { startActivity(new Intent(TelaHome.this, TelaLogin.class)); }
    private void btnListarAlunosActivity() {
        Intent intent = new Intent(TelaHome.this, ListAlunosActivity.class);
        intent.putExtra("nome", "Juliano");
        TelaHome.this.startActivity(intent);}
    private void adicionarAlunoActivity() {
        startActivity(new Intent(TelaHome.this, CadastrarAluno.class)); }
    private void criarAnamneseActivity() {
        startActivity(new Intent(TelaHome.this, CriarAnamnese.class)); }
    private void adicionarTreinoActivity() {
        startActivity(new Intent(TelaHome.this, AdicionarTreino.class)); }
    private void criarAvaliacaoActivity() {
        startActivity(new Intent(TelaHome.this, CriarAvaliacao.class)); }

}