package com.example.stop_tirame_la_letra;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


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
}
