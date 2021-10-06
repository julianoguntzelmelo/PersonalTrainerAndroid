package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnamneseAluno extends AppCompatActivity {

    private Button anamneseVotarHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anamnese_aluno);

        anamneseVotarHome = (Button) findViewById(R.id.anamneseVoltar);

        anamneseVotarHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { anamnese_VotarHomeActivity(); }
        });

    }

    private void anamnese_VotarHomeActivity(){
        startActivity(new Intent(AnamneseAluno.this, HomeAluno.class));
    }

}