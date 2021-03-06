package com.cip.javier.ut03_act01;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
    //noinspection SimplifiableIfStatement
        String mensaje;
        switch (id) {
            case R.id.action_buscar:
                mensaje = "Elemento buscar seleccionado" ;
                Toast.makeText( this , mensaje, Toast.LENGTH_LONG).show();
                return true ;
            case R.id.action_nuevo:
                mensaje = "Elemento nuevo seleccionado" ;
                Toast.makeText( this , mensaje, Toast.LENGTH_LONG).show();
                return true ;
            case R.id.action_settings:
                mensaje = "Elemento configurar seleccionado" ;
                Toast.makeText( this , mensaje, Toast.LENGTH_LONG).show();
                return true ;
            case R.id.action_salir:
                mensaje = "Elemento salir seleccionado" ;
                Toast.makeText( this , mensaje, Toast.LENGTH_LONG).show();
                finish();
                return true ;
        }
        return super .onOptionsItemSelected(item);
    }
}

