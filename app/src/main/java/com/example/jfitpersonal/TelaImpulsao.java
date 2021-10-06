package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaImpulsao extends AppCompatActivity {

    private Button salvarImpulsao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_impulsao);

        salvarImpulsao = (Button) findViewById(R.id.salvarImpulsao);

        salvarImpulsao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {salvarImpulsaoActivity(); }
        });
    }

    private void salvarImpulsaoActivity() {
        startActivity(new Intent(TelaImpulsao.this, TelaHome.class));
    }
}