package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlterarSenhaAluno extends AppCompatActivity {

    private Button salvarSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_senha_aluno);

        salvarSenha = (Button) findViewById(R.id.salvarSenhaNova);

        salvarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { salvarSenhaActivity(); }
        });

    }

    private void salvarSenhaActivity(){
        startActivity(new Intent(AlterarSenhaAluno.this, HomeAluno.class));
    }

}