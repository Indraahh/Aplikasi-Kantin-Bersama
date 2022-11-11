package com.kelompok1.gotinproject;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class halamanlogin extends AppCompatActivity {

    EditText username, password;
    Button login;
    Button register1;
    String keyname, keypass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halamanlogin);

        username=findViewById(R.id.input_emaillogin1);
        password=findViewById(R.id.input_passwordlogin1);
        login = findViewById(R.id.btn_halamanlogin1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                keyname = username.getText().toString();
                keypass = username.getText().toString();
                if (keyname.equals("123") && keypass.equals("123")) {
                    Toast.makeText(getApplication(), "SUCCEED", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(halamanlogin.this, halamanawal.class);
                    halamanawal.this.startActivity(intent);
                    finish();
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(halamanlogin.this);
                    builder.setMessage("USERNAME DAN PASSWORD ANDA SALAH");
                    builder.setNegativeButton("SILAHLAN COBA LAGI", null).create().show();
                }
            }
        });

        register1 = findViewById(R.id.btn_register1);

        register1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(halamanlogin.this, halamanregistera.class));

            }
        });
    }
}