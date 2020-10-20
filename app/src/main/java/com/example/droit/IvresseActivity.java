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
                Bundle allInforesult = new Bundle();
                allInforesult.putString("info1","Tu n'es pas concerné(e)");
                allInforesult.putString("info2","none");
                allInforesult.putString("info3","none");
                allInforesult.putString("info4","none");
                allInforesult.putString("info5","none");
                result_page.putExtra("infoResult",allInforesult);
                startActivity(result_page);
            }
        });

    }





}