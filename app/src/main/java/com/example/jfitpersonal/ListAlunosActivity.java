package com.example.jfitpersonal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ListAlunosActivity extends AppCompatActivity {
    // Essa é a tela que vai mostrar a lista de alunos cadastrados no banco de dados.
    // Essa tela vai ser chamada depois que clicar no botão ALUNOS(id btnAlunos) da TelaHome.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_alunos);

        Bundle extras = getIntent().getExtras();

        RecyclerView recyclerView = findViewById(R.id.recycler_view_list);

        String nome = extras.getString("nome");
        List<Register> registers = SqlHelper.getInstance(this).getRegistersBy(nome);

        ListCalcAdapter adapter = new ListCalcAdapter(registers);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }


    private class ListCalcAdapter extends RecyclerView.Adapter<ListCalcViewHolder> {

        private final List<Register> datas;

        public ListCalcAdapter(List<Register> datas) {
            this.datas = datas;
        }

        @NonNull
        public ListCalcViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ListCalcViewHolder(getLayoutInflater().inflate(android.R.layout.simple_list_item_1, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ListCalcViewHolder holder, int position) {
            Register data = datas.get(position);
        }

        @Override
        public int getItemCount() {
            return datas.size();
        }

    }

    private class ListCalcViewHolder extends RecyclerView.ViewHolder {

        ListCalcViewHolder(@NonNull View itemView) {
            super(itemView);
        }

       /* void bind(Register data, final OnAdapterItemClickListener onItemClickListener) {
            String formatted = "";
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", new Locale("pt", "BR"));
                Date dateSaved = sdf.parse(data.createdDate);
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", new Locale("pt", "BR"));
                formatted = dateFormat.format(dateSaved);
            } catch (ParseException e) {
            }



            ((TextView) itemView).setText(
                    "Nome: {data.nomeAluno}"
            );

            // listener para ouvir evento de click (ABRIR EDIÇAO)
            itemView.setOnClickListener(view -> {
                onItemClickListener.onClick(data.id, data.type);
            });

            // listener para ouvir evento de long-click (segurar touch - EXCLUIR)
            itemView.setOnLongClickListener(view -> {
                onItemClickListener.onLongClick(getAdapterPosition(), data.type, data.id);
                return false;
            });

           */
    }

}

