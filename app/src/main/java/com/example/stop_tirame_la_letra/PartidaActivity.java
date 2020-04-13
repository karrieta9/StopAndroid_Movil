package com.example.stop_tirame_la_letra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class PartidaActivity extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partida);


        configurarToolBar();
        cambiarInfoUserToolBar();
    }

    public void calificarPartida(View view){
        Intent intent = new Intent(this, CalificarActivity.class );
        startActivity(intent);
    }

    public void configurarToolBar (){
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void  cambiarInfoUserToolBar(){
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            TextView tviewnombre = toolbar.findViewById(R.id.toolbar_user);
            TextView tviewnivel = toolbar.findViewById(R.id.toolbar_level);
            CircleImageView imgfoto = toolbar.findViewById(R.id.toolbar_profile_icon);
            //Aqui traer nombre de usuario
            tviewnombre.setText("Yizuz_elpro123");
            tviewnivel.setText("Level 10");
            imgfoto.setImageResource(R.drawable.modelo);
        }
    }
}
