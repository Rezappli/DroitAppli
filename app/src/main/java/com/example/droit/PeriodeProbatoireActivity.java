package com.example.droit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PeriodeProbatoireActivity extends AppCompatActivity {

    private Button validate;
    private Button refuse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periode_probatoire);

        validate = (Button)findViewById(R.id.periode_prob_yes_button);
        refuse = (Button)findViewById(R.id.periode_prob_no_button);
        Intent taux_page = new Intent(this, TauxActivity.class);
        Intent result_page = new Intent(this, ResultatActivity.class);

        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(taux_page);
            }
        });

        refuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultatActivity.StringInfo1 = "Retrait de 6 points donc suspension du permis ou annulation du permis";
                ResultatActivity.StringInfo2 = "Amende de 750€ maximum";
                ResultatActivity.StringInfo3 = "Immobilisation du véhicule";
                ResultatActivity.StringInfo4 = "";
                ResultatActivity.StringInfo5 = "";

                startActivity(result_page);
            }
        });
    }
}