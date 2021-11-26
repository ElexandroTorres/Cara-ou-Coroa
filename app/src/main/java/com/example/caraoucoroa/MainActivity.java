package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageButton ibJogar;
    private int valueLimit = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibJogar = findViewById(R.id.ibJogar);

        ibJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);

                intent.putExtra("result", coinResult());

                startActivity(intent);
            }
        });
    }

    private int coinResult() {
        Random randomValue = new Random();

        return randomValue.nextInt(valueLimit);
    }
}