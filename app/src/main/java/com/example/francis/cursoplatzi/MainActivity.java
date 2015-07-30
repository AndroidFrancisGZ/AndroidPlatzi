package com.example.francis.cursoplatzi;

import android.content.Intent;
import android.graphics.Outline;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        /*int size = getResources().getDimensionPixelSize(R.dimen.fab_size);
        Outline outline = new Outline();
        outline.setOval(0,0,size,size);*/
        ImageButton imageButton = (ImageButton) findViewById(R.id.fab_1);
      //  imageButton.setOutline(outline);


    }


    public void onClick(View v){


        Toast.makeText(this,"Hola estoy escuchando",Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this,MyMusic.class);
        startActivity(intent);

    }




}
