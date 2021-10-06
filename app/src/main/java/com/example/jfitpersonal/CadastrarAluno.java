package com.example.jfitpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastrarAluno extends AppCompatActivity {

    private Button salvar;
    private EditText nome;
    private EditText sobreNome;
    private EditText email;
    private EditText telefone;
    private EditText peso;
    private EditText altura;
    private EditText dataNascimento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_aluno);

        salvar = (Button) findViewById(R.id.salvar);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sNome = nome.getText().toString();
                String sSobreNome = sobreNome.getText().toString();
                String sEmail = email.getText().toString();
                String sTelefone = telefone.getText().toString();
                String sPeso = peso.getText().toString();
                String sAltura = altura.getText().toString();
                String sDataNascimento = dataNascimento.getText().toString();
                long alunoId = SqlHelper.getInstance(CadastrarAluno.this).addItem(sNome, sSobreNome, sEmail,
                        sTelefone, sPeso, sAltura, sDataNascimento);
                Toast.makeText(CadastrarAluno.this, R.string.saved, Toast.LENGTH_SHORT).show();
                salvarActivity();
            }
        });

        nome = findViewById(R.id.editTextNome);
        sobreNome = findViewById(R.id.editTextSobrenome);
        email = findViewById(R.id.editTextTextEmail);
        telefone = findViewById(R.id.editTextTelefone);
        peso = findViewById(R.id.editTextPeso);
        altura = findViewById(R.id.editTextAltura);
        dataNascimento = findViewById(R.id.editTextDataNascimento);


    }

    private void salvarActivity() {
        startActivity(new Intent(CadastrarAluno.this, TelaHome.class));
    }

}