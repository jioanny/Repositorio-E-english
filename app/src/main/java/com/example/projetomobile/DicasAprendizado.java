package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DicasAprendizado extends AppCompatActivity {
    Button btnProx, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas_aprendizado);
        btnProx = findViewById(R.id.btnProx);
        btnVoltar = findViewById(R.id.btnVoltar);

        btnProx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DicasAprendizado.this, DicasAprendizado2.class));
            }
        });
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DicasAprendizado.this, HelloActivity.class));
            }
        });
    }
}
