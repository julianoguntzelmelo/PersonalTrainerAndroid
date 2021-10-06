package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArquivosAlunoTela extends AppCompatActivity {

    private Button arquivosVotarHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arquivos_aluno_tela);

        arquivosVotarHome = (Button) findViewById(R.id.arquivosVoltar);

        arquivosVotarHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { arquivos_VotarHomeActivity(); }
        });

    }

    private void arquivos_VotarHomeActivity(){
        startActivity(new Intent(ArquivosAlunoTela.this, HomeAluno.class));
    }

}