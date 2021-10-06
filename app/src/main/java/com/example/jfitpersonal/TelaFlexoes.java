package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaFlexoes extends AppCompatActivity {

    private Button salvarFlexao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_flexoes);

        salvarFlexao = (Button) findViewById(R.id.salvarFlexao);

        salvarFlexao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {salvarFlexaoActivity(); }
        });

    }

    private void salvarFlexaoActivity() {
        startActivity(new Intent(TelaFlexoes.this, TelaHome.class));
    }

}