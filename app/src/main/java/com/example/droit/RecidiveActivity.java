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
                Bundle allInforesult = new Bundle();
                allInforesult.putString("info1","Retrait de 6 points donc suspension ou annulation du permis");
                allInforesult.putString("info2","Amende de 9 000€ maximum");
                allInforesult.putString("info3","Immobilisation du véhicule");
                allInforesult.putString("info4","Obligation de suivre un stage de sensibilisation");
                allInforesult.putString("info5","Peine de prison de 4 ans maximum");
                validate_result_page.putExtra("infoResult",allInforesult);

                startActivity(validate_result_page);
            }
        });

        refuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle allInforesult = new Bundle();
                allInforesult.putString("info1","Retrait de 6 points donc suspension ou annulation du permis");
                allInforesult.putString("info2","Amende de 4 500€ maximum");
                allInforesult.putString("info3","Immobilisation du véhicule");
                allInforesult.putString("info4","Obligation de suivre un stage de sensibilisation");
                allInforesult.putString("info5","Peine de prison de 2 ans maximum");
                refuse_result_page.putExtra("infoResult",allInforesult);
                startActivity(refuse_result_page);
            }
        });
    }
}