package com.protcase.monk;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class gameScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        Button market = findViewById(R.id.marketBtn);
        market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View dialogView = inflater.inflate(R.layout.seed_buy_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(gameScreen.this);
                builder.setView(dialogView);


                TextView textView = findViewById(R.id.textView);

                Button buySeedBtn = dialogView.findViewById(R.id.buySeedBtn);
                buySeedBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(gameScreen.this,"something",Toast.LENGTH_SHORT).show();
                    }
                });


                // Create the AlertDialog object and show it.
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

    }
}