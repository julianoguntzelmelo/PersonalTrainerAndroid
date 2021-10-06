package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaResistencia extends AppCompatActivity {

    private Button salvarResistencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_resistencia);

        salvarResistencia = (Button) findViewById(R.id.salvarResistencia);

        salvarResistencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {salvarResistenciaActivity(); }
        });

    }

    private void salvarResistenciaActivity() {
        startActivity(new Intent(TelaResistencia.this, TelaHome.class));
    }

}