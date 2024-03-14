package com.protcase.monk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final boolean[] remval = {false};
        Button loginButton = findViewById(R.id.loginBtn);
        TextView userId = findViewById(R.id.editTextText2);
        TextView userPass = findViewById(R.id.editTextTextPassword);
        CheckBox rememberme = findViewById(R.id.checkBox2);

        rememberme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                remval[0] = !remval[0];
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(remval[0]){
                    Toast.makeText(getBaseContext(),"here",Toast.LENGTH_SHORT).show();
                }
                if((userId.getText().toString().equals("Ankur")) && (userPass.getText().toString().equals("Rukna@321"))){
                    startActivity(new Intent(getBaseContext(), gameScreen.class));
                }else {
                    Toast.makeText(getBaseContext(), "Please Check Your Id and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}