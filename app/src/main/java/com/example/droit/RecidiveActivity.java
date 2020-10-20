package com.example.droit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecidiveActivity extends AppCompatActivity {


    private Button validate;
    private Button refuse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recidive);

        validate = (Button)findViewById(R.id.recidive_yes_button);
        refuse = (Button)findViewById(R.id.recidive_no_button);
        Intent validate_result_page = new Intent(this, ResultatActivity.class);
        Intent refuse_result_page = new Intent(this, ResultatActivity.class);

        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultatActivity.StringInfo1 = "Retrait de 6 points donc suspension du permis ou annulation du permis";
                ResultatActivity.StringInfo2 = "Amende de 9 000€ maximum";
                ResultatActivity.StringInfo3 = "Immobilisation du véhicule";
                ResultatActivity.StringInfo4 = "Obligation de suivre un stage de sensibilisation";
                ResultatActivity.StringInfo5 = "Peine de prison de 4 ans maximum";

                startActivity(validate_result_page);
            }
        });

        refuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultatActivity.StringInfo1 = "Retrait de 6 points donc suspension du permis ou annulation du permis";
                ResultatActivity.StringInfo2 = "Amende de 4 500€ maximum";
                ResultatActivity.StringInfo3 = "Immobilisation du véhicule";
                ResultatActivity.StringInfo4 = "Obligation de suivre un stage de sensibilisation";
                ResultatActivity.StringInfo5 = "Peine de prison de 2 ans maximum";
                startActivity(refuse_result_page);
            }
        });
    }
}