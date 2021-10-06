package com.example.jfitpersonal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SqlHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "jfit_personal.db";
    private static final int DB_VERSION = 1;

    private static SqlHelper INSTANCE;

    static SqlHelper getInstance(Context context){
        if (INSTANCE == null)
            INSTANCE = new SqlHelper(context);
        return INSTANCE;
    }

    public SqlHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(
            "CREATE TABLE alunos (id INTEGER primary key, nomeAluno TEXT, sobrenomeAluno TEXT," +
                    "emailAluno TEXT, telefoneAluno INTEGER, pesoAluno DECIMAL," +
                    "alturaAluno DECIMAL, dataNascimentoAluno DATE)"
    );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    List<Register> getRegistersBy(String nome){
        List<Register> registers = new ArrayList<>();

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM alunos WHERE nomeAluno = ?", new String[]{nome});

        try{

            if (cursor.moveToFirst()){
                do {

                    Register register = new Register();

                    register.nome = cursor.getString(cursor.getColumnIndex("nomeAluno"));
                    register.sobrenome = cursor.getString(cursor.getColumnIndex("sobrenomeAluno"));
                    register.email = cursor.getString(cursor.getColumnIndex("emailAluno"));
                    register.telefone = cursor.getInt(cursor.getColumnIndex("telefoneAluno"));
                    register.peso = cursor.getDouble(cursor.getColumnIndex("pesoAluno"));
                    register.altura = cursor.getDouble(cursor.getColumnIndex("alturaAluno"));
                    register.dataNascimento = cursor.getString(cursor.getColumnIndex("dataNascimentoAluno"));
                    registers.add(register);
                } while (cursor.moveToNext());
            }

        } catch (Exception e){
            Log.e("SQLite", e.getMessage(), e);
        } finally {
            if (cursor != null && !cursor.isClosed())
                cursor.close();
        }
        return registers;
    }

    long addItem(String nome, String sobrenome, String email, String telefone, String peso,
                 String altura, String dataNascimento){
        SQLiteDatabase db = getWritableDatabase();

        long alunoId = 0;
        try{
            db.beginTransaction();

            ContentValues values = new ContentValues();
            values.put("nomeAluno", nome);
            values.put("sobrenomeAluno", sobrenome);
            values.put("emailAluno", email);
            values.put("telefoneAluno", telefone);
            values.put("pesoAluno", peso);
            values.put("alturaAluno", altura);
            values.put("dataNascimentoAluno", String.valueOf(dataNascimento));
            alunoId = db.insertOrThrow("alunos", "null", values);
            db.setTransactionSuccessful();
        } catch (Exception e){
        Log.e("SQLite", e.getMessage(), e);
        } finally {
            if (db.isOpen())
                db.endTransaction();
        }
        return alunoId;
    }

}
