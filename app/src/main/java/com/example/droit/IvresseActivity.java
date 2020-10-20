package com.example.droit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IvresseActivity extends AppCompatActivity {

    private Button validate;
    private Button refuse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivresse);

        validate = (Button)findViewById(R.id.ivresse_yes_button);
        refuse = (Button)findViewById(R.id.ivresse_no_button);
        Intent periode_prob_page = new Intent(this.getApplicationContext(), PeriodeProbatoireActivity.class);
        Intent result_page = new Intent(this.getApplicationContext(), ResultatActivity.class);

        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(periode_prob_page);
            }
        });

        refuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultatActivity.StringInfo1 = "Tu n'es pas concerné :)";
                ResultatActivity.StringInfo2 = "";
                ResultatActivity.StringInfo3 = "";
                ResultatActivity.StringInfo4 = "";
                ResultatActivity.StringInfo5 = "";
                startActivity(result_page);
            }
        });

    }





}