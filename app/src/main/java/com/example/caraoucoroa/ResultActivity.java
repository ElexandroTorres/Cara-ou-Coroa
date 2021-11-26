package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView tvResult;
    private ImageView ivResult;
    private ImageButton ibVoltar;

    private int coinResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvResult = findViewById(R.id.tvResult);
        ivResult = findViewById(R.id.ivResult);
        ibVoltar = findViewById(R.id.ibVoltar);

        Intent intent = getIntent();
        coinResult = intent.getExtras().getInt("result");

        showResult();

        ibVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void showResult() {
        //Considerarei zero cara e 1 coroa.
        if(coinResult == 0) {
            ivResult.setImageResource(R.drawable.moeda_cara);
            tvResult.setText("CARA");
        }
        else {
            ivResult.setImageResource(R.drawable.moeda_coroa);
            tvResult.setText("COROA");
        }
    }
}