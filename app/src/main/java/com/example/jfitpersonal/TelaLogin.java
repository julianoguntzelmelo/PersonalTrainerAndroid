package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;

public class TelaLogin extends AppCompatActivity {

    private CheckedTextView criar_Conta;
    private CheckedTextView enviar_Senha;
    private Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        criar_Conta = (CheckedTextView) findViewById(R.id.criarConta);
        enviar_Senha = (CheckedTextView) findViewById(R.id.enviarSenha);
        entrar = (Button) findViewById(R.id.login);

        criar_Conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                criar_ContaActivity();
            }
        });

        enviar_Senha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviar_SenhaActivity();
            }
        });

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrarActivity();
            }
        });

    }

    private void criar_ContaActivity() {
    startActivity(new Intent(TelaLogin.this, CriarConta.class));
    }

    private void enviar_SenhaActivity() {
        startActivity(new Intent(TelaLogin.this, EnviarSenha.class));
    }

    private void entrarActivity() {
        startActivity(new Intent(TelaLogin.this, TelaHome.class));
    }
}