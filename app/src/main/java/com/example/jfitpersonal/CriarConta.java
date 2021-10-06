package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;

public class CriarConta extends AppCompatActivity {

    private CheckedTextView fazerLogin;
    private Button criar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);

        fazerLogin = (CheckedTextView) findViewById(R.id.fazerLogin);
        criar = (Button) findViewById(R.id.criar);

        fazerLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { fazerLoginActivity(); }
        });

        criar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { fazerLoginActivity(); }
        });

    }

    private void fazerLoginActivity() {
        startActivity(new Intent(CriarConta.this, TelaLogin.class));
    }

}