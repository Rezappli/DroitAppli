package com.example.droit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultatActivity extends AppCompatActivity {

    private TextView info1;
    private TextView info2;
    private TextView info3;
    private TextView info4;
    private TextView info5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);

        info1 = (TextView)findViewById(R.id.information1) ;
        info2 = (TextView)findViewById(R.id.information2) ;
        info3 = (TextView)findViewById(R.id.information3) ;
        info4 = (TextView)findViewById(R.id.information4) ;
        info5 = (TextView)findViewById(R.id.information5) ;


        Bundle extraBundle = getIntent().getExtras();

        String StringInfo1 = extraBundle.getBundle("infoResult").getString("info1");
        String StringInfo2 = extraBundle.getBundle("infoResult").getString("info2");
        String StringInfo3 = extraBundle.getBundle("infoResult").getString("info3");
        String StringInfo4 = extraBundle.getBundle("infoResult").getString("info4");
        String StringInfo5 = extraBundle.getBundle("infoResult").getString("info5");




        if(StringInfo1 == "none"){
            info1.setVisibility(0);
        }else{
            info1.setVisibility(1);
            info1.setText(StringInfo1);
        }

        if(StringInfo2 == "none"){
            info2.setVisibility(0);
        }else{
            info2.setVisibility(1);
            info2.setText(StringInfo2);
        }

        if(StringInfo3 == "none"){
            info3.setVisibility(0);
        }else{
            info3.setVisibility(1);
            info3.setText(StringInfo3);
        }

        if(StringInfo4 == "none"){
            info4.setVisibility(0);
        }else{
            info4.setVisibility(1);
            info4.setText(StringInfo4);
        }

        if(StringInfo5 == "none"){
            info5.setVisibility(0);
        }else{
            info5.setVisibility(1);
            info5.setText(StringInfo5);
        }




    }
}