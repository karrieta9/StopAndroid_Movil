package com.example.stop_tirame_la_letra;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.mensaje);
        textView.setText(message);

        /*Bundle bundle = getIntent().getExtras();
        String msg = bundle.getString("EXTRA_MESSAGE");
        TextView textView = findViewById(R.id.mensaje);
        textView.setText(msg);*/

    }
}
