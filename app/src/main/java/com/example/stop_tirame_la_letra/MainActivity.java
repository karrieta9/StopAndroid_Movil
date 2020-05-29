/* Aplicacion: Stop Tirame La Letra
   Estudiantes: Keiner Arrieta, Yeferson Escobar, Jesus Saravia */
package com.example.stop_tirame_la_letra;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.stop_tirame_la_letra.utilidades.Utilidades;

import java.sql.Array;
import java.sql.SQLException;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void entrarSesion(View view) {
        EditText usuario = (EditText) findViewById(R.id.usuario);
        EditText pass = (EditText) findViewById(R.id.password);

        if((usuario.getText().toString().trim()).equals("") || (pass.getText().toString().trim()).equals("")){
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
        }else{
            String[] columnas = {Utilidades.campo_id, Utilidades.campo_nombre, Utilidades.campo_pass, Utilidades.campo_email, Utilidades.campo_fecha};
            String selection = Utilidades.campo_nombre+"= ? AND "+Utilidades.campo_pass+"= ?";
            String[] selectionArgs = {usuario.getText().toString(), pass.getText().toString()};

            ConexSQLiteHelper conex = new ConexSQLiteHelper(this, "stop_db", null, 1);
            SQLiteDatabase db = conex.getWritableDatabase();

            Cursor cursor = db.query(Utilidades.tabla, columnas, selection, selectionArgs, null, null, null);

            if(cursor.getCount() > 0){
                Intent intent = new Intent(this, HomeActivity.class);
                startActivity(intent);
            }else{
                Toast.makeText(this, "Credenciales Incorrectas.", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void sesionFacebook(View view) {
        // Aqui va el codigo para el inicio de sesion por facebook
        Toast.makeText(this, "Iniciando sesion por Facebook", Toast.LENGTH_SHORT).show();
    }

    public void sesionGoogle(View view) {
        // Aqui va el codigo para el inicio de sesion por google
        Toast.makeText(this, "Iniciando sesion por Google", Toast.LENGTH_SHORT).show();
    }

    public void recordarPassword(View view) {
        Intent intent = new Intent(this, RestablecerActivity.class );
        startActivity(intent);
    }

    public void enviarAregistro(View view) {
        Intent intent = new Intent(this, RegisterActivity.class );
        startActivity(intent);
    }
}
