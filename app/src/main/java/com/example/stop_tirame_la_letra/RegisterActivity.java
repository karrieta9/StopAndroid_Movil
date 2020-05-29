package com.example.stop_tirame_la_letra;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stop_tirame_la_letra.utilidades.Utilidades;

public class RegisterActivity extends AppCompatActivity {

    EditText nombre_usuario, pass_usuario, email_usuario;
    CheckBox terminos;
    String text_nombre, text_usuario, text_email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nombre_usuario = (EditText) findViewById(R.id.User);
        pass_usuario = (EditText) findViewById(R.id.Password);
        email_usuario = (EditText) findViewById(R.id.Email);
        terminos = (CheckBox) findViewById(R.id.terminos);

        //text_nombre = nombre_usuario.getText().toString();
        //text_usuario = pass_usuario.getText().toString();
        //text_email = email_usuario.getText().toString();
    }

    public void registrarUsuario(View view) {
        if((nombre_usuario.getText().toString().trim()).equals("") || (pass_usuario.getText().toString().trim()).equals("") || (email_usuario.getText().toString().trim()).equals("") ){
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
        }else if(!terminos.isChecked()){
            Toast.makeText(this, "Debe aceptar los terminos y condiciones", Toast.LENGTH_SHORT).show();
        }else {
            ConexSQLiteHelper conex = new ConexSQLiteHelper(this, "stop_db", null, 1);
            SQLiteDatabase db = conex.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put(Utilidades.campo_nombre, nombre_usuario.getText().toString().trim());
            values.put(Utilidades.campo_pass, pass_usuario.getText().toString().trim());
            values.put(Utilidades.campo_email, email_usuario.getText().toString().trim());
            values.put(Utilidades.campo_fecha, "15/28/289");

            Long res = db.insert(Utilidades.tabla, Utilidades.campo_nombre, values);
            Toast.makeText(getApplicationContext(), "id: " + res, Toast.LENGTH_SHORT).show();
            db.close();

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }

}
