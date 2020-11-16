package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TelaLivros extends AppCompatActivity {
 ImageButton btnAero, btnRestaurante, btnHello, btnHotel, btnSuper;
 Button  btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_livros);
        btnAero = findViewById(R.id.btnAero);
        btnRestaurante = findViewById(R.id.btnRestaurante);
        btnHello = findViewById(R.id.btnHello);
        btnHotel = findViewById(R.id.btnHotel);
        btnSuper = findViewById(R.id.btnSuper);
        btnVoltar = findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaLivros.this, HelloActivity.class));
            }
        });

        btnAero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaLivros.this, FrasesAeroporto.class));
            }
        });

        btnRestaurante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaLivros.this, FrasesRestaurante.class));
            }
        });
        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaLivros.this, FrasesSaudacao.class));
            }
        });
        btnHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaLivros.this, FrasesHotel.class));
            }
        });
        btnSuper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaLivros.this, FrasesSupermercado.class));
            }
        });
    }
}
