package com.example.stop_tirame_la_letra;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void entrarSesion(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, HomeActivity.class);
        EditText usuario = (EditText) findViewById(R.id.usuario);
        EditText pass = (EditText) findViewById(R.id.password);
        String message = usuario.getText().toString() + " " + pass.getText().toString();
        intent.putExtra("EXTRA_MESSAGE", message);
        startActivity(intent);

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
