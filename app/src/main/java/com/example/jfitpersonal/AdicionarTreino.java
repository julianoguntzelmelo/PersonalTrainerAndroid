package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdicionarTreino extends AppCompatActivity {

    private Button salvarTreino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_treino);

        salvarTreino = (Button) findViewById(R.id.salvarTreino);
        salvarTreino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {salvarTreinoActivity(); }
        });

    }

    private void salvarTreinoActivity() {
        startActivity(new Intent(AdicionarTreino.this, TelaHome.class)); }

}