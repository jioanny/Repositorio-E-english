package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Biblioteca extends AppCompatActivity {
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biblioteca);
        btnVoltar = findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Biblioteca.this, HelloActivity.class));
            }
        });
    }
    public void doc1 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.arpi.net.br/downloads/curso-ingles.pdf"));
        startActivity(browserIntent);
    }
    public void doc2 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://englishlive.ef.com/dam/englishtown/master/salespages/pdf-downloads/br/fc/br-guia-ef-englishlive-numeros-em-ingles.pdf"));
        startActivity(browserIntent);
    }
    public void doc3 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.englishexperts.com.br/wp-content/uploads/downloads/as-palavras-mais-comuns-da-lingua-inglesa.pdf"));
        startActivity(browserIntent);
    }
    public void doc4 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://englishlive.ef.com/dam/englishtown/master/salespages/pdf-downloads/br/freecontent/br-guia-ef-englishtown-partes-casa.pdf"));
        startActivity(browserIntent);
    }
}
