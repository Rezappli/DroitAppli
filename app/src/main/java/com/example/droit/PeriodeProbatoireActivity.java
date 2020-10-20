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


        validate = (Button)findViewById(R.id.ivresse_yes_button);
        refuse = (Button)findViewById(R.id.ivresse_no_button);
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
                Bundle allInforesult = new Bundle();
                allInforesult.putString("info1","Retrait de 6 points donc suspension ou annulation du permis");
                allInforesult.putString("info2","Amende de 750€ maximum");
                allInforesult.putString("info3","Immobilisation du véhicule");
                allInforesult.putString("info4","none");
                allInforesult.putString("info5","none");

                result_page.putExtra("infoResult",allInforesult);
                startActivity(result_page);
            }
        });
    }
}