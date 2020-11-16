package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TelaQuizzes extends AppCompatActivity {
    ImageButton animais, btnComidas, btnNumeros, btnRoupas, btnFamilia;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_quizzes);
        animais = findViewById(R.id.btnAnimais);
        btnVoltar = findViewById(R.id.btnVoltar);
        btnComidas = findViewById(R.id.btnComidas);
        btnNumeros = findViewById(R.id.btnNumeros);
        btnRoupas = findViewById(R.id.btnRoupas);
        btnFamilia = findViewById(R.id.btnFamilia);

        animais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaQuizzes.this, QuizzActivity.class));
            }
        });
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaQuizzes.this, HelloActivity.class));
            }
        });
        btnComidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaQuizzes.this, QuizzComidas.class));
            }
        });
        btnNumeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaQuizzes.this, QuizzNumeros.class));
            }
        });
        btnRoupas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaQuizzes.this, QuizzRoupas.class));
            }
        });
        btnFamilia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaQuizzes.this, QuizzFamilia.class));
            }
        });
    }
}
