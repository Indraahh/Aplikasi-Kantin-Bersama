package com.kelompok1.gotinproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class halamanawal extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halamanawal);

        button = (Button) findViewById(R.id.btn_loginawal1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhalamanlogin();
            }
        });

        button = (Button) findViewById(R.id.btn_registerawal1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhalamanregister();
            }
        });
    }

    public void openhalamanlogin(){
        Intent intent = new Intent(this, halamanlogin.class);
        startActivity(intent);
    }
    public void openhalamanregister(){
        Intent intent = new Intent(this, halamanregister.class);
        startActivity(intent);
    }
}