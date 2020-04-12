package com.example.stop_tirame_la_letra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;


public class HomeActivity extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        configurarToolBar();
        cambiarInfoUserToolBar();

        /*Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.mensaje);
        textView.setText(message);
*/
        /*Bundle bundle = getIntent().getExtras();
        String msg = bundle.getString("EXTRA_MESSAGE");
        TextView textView = findViewById(R.id.mensaje);
        textView.setText(msg);*/

    }

    public void crearNuevaPartida(View view) {
        Intent intent = new Intent(this, PartidaActivity.class );
        startActivity(intent);
    }

    private void configurarToolBar (){
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void  cambiarInfoUserToolBar(){
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            TextView tviewnombre = toolbar.findViewById(R.id.toolbar_user);
            TextView tviewnivel = toolbar.findViewById(R.id.toolbar_level);
            CircleImageView imgfoto = toolbar.findViewById(R.id.toolbar_profile_icon);
            //Aqui traer nombre de usuario
            tviewnombre.setText("Yizuz");
            tviewnivel.setText("Level 10");
            imgfoto.setImageResource(R.drawable.modelo);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profile_user:
                Intent intent = new Intent(this, PerfilActivity.class );
                startActivity(intent);
                break;

            case R.id.logout_user:
                Intent intent2 = new Intent(this, MainActivity.class );
                startActivity(intent2);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
