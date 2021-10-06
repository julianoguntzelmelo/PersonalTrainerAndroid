package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnviarSenha extends AppCompatActivity {

    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_senha);

        enviar = (Button) findViewById(R.id.enviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { enviarActivity(); }
        });

    }

    private void enviarActivity() {
        startActivity(new Intent(EnviarSenha.this, TelaLogin.class));
    }

}