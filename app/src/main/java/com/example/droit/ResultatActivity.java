package com.example.droit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultatActivity extends AppCompatActivity {

    private TextView info1;
    private TextView info2;
    private TextView info3;
    private TextView info4;
    private TextView info5;
    private ImageView buttonRecommencer;

    public static String StringInfo1;
    public static String StringInfo2;
    public static String StringInfo3;
    public static String StringInfo4;
    public static String StringInfo5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);

        info1 = (TextView)findViewById(R.id.information1) ;
        info2 = (TextView)findViewById(R.id.information2) ;
        info3 = (TextView)findViewById(R.id.information3) ;
        info4 = (TextView)findViewById(R.id.information4) ;
        info5 = (TextView)findViewById(R.id.information5) ;
        buttonRecommencer = (ImageView) findViewById(R.id.buttonRecommencer);

        buttonRecommencer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);
            }
        });


        Log.w("infos", StringInfo1);
        Log.w("infos", StringInfo2);
        Log.w("infos", StringInfo3);
        Log.w("infos", StringInfo4);
        Log.w("infos", StringInfo5);

        if(StringInfo1.matches("")){
            info1.setVisibility(View.GONE);
        }else{
            info1.setVisibility(View.VISIBLE);
            info1.setText(StringInfo1);
        }

        if(StringInfo2.matches("")){
            info2.setVisibility(View.GONE);
        }else{
            info2.setVisibility(View.VISIBLE);
            info2.setText(StringInfo2);
        }

        if(StringInfo3.matches("")){
            info3.setVisibility(View.GONE);
        }else{
            info3.setVisibility(View.VISIBLE);
            info3.setText(StringInfo3);
        }

        if(StringInfo4.matches("")){
            info4.setVisibility(View.GONE);
        }else{
            info4.setVisibility(View.VISIBLE);
            info4.setText(StringInfo4);
        }

        if(StringInfo5.matches("")){
            info5.setVisibility(View.GONE);
        }else{
            info5.setVisibility(View.VISIBLE);
            info5.setText(StringInfo5);
        }




    }
}