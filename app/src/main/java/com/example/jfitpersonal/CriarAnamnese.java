package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CriarAnamnese extends AppCompatActivity {

    private Button vSalvarAnamnese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_anamnese);

        vSalvarAnamnese = (Button) findViewById(R.id.salvarAnamnese);

        vSalvarAnamnese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvarActivity();
            }
        });

    }

    private void salvarActivity() {
        startActivity(new Intent(CriarAnamnese.this, TelaHome.class));
    }

}