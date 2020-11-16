package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HelloActivity extends AppCompatActivity {
    ImageButton btnLivro, btnQuizz, btnBiblioteca, btnDicas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        btnLivro = findViewById(R.id.btnLivro);
        btnQuizz = findViewById(R.id.btnQuizz);
        btnBiblioteca = findViewById(R.id.btnBiblioteca);
        btnDicas = findViewById(R.id.btnDicas);

        btnQuizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HelloActivity.this, TelaQuizzes.class));
            }
        });
        btnLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HelloActivity.this, TelaLivros.class));
            }
        });
        btnBiblioteca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HelloActivity.this, Biblioteca.class));
            }
        });
        btnDicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HelloActivity.this, DicasAprendizado.class));
            }
        });
    }
    public void tradutor (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=google+tradutor&rlz=1C1CHBD_pt-PTBR829BR829&oq=google+tradutor&aqs=chrome..69i57j0j0i433l5j0.3422j0j7&sourceid=chrome&ie=UTF-8"));
        startActivity(browserIntent);
    }
}
