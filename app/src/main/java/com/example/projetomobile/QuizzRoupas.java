package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizzRoupas extends AppCompatActivity {
    public RadioButton certo1;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_roupas);
        certo1 = findViewById(R.id.certo1);
        btnVoltar = findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizzRoupas.this, TelaQuizzes.class));
            }
        });
    }
    public void responder(View view){
        if(certo1.isChecked()){
            Toast.makeText(getApplicationContext(),"Resposta Correta",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"Resposta Incorreta",Toast.LENGTH_LONG).show();
        }
    }
}
