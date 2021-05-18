package com.example.webviewm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //enlazar la parte logica y diseño
        et1 = (EditText) findViewById(R.id.txtWeb);

    }

    public void navegar(View view ){
        Intent i = new Intent(this,ActivityWeb.class);
        i.putExtra("Sitio web",et1.getText().toString());
        startActivity(i);
    }
}