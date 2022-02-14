package com.example.myapplicationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button ok;
    Button annuler;

    TextView TVnom;
    TextView TVprenom;
    TextView TVage;
    TextView TVskill;
    TextView TVnum;

    EditText ETnom;
    EditText ETprenom;
    EditText ETage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ok = (Button)findViewById(R.id.btnOk);
        annuler = (Button)findViewById(R.id.btnAnnuler);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        annuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        TVnom = (TextView) findViewById(R.id.textViewLastNamePrint);
        TVprenom = (TextView) findViewById(R.id.textViewFirstNamePrint);
        TVage = (TextView) findViewById(R.id.textViewAgePrint);
        TVskill = (TextView) findViewById(R.id.textViewSkillPrint);
        TVnum = (TextView) findViewById(R.id.textViewNumPrint);

        TVnom.setText(MainActivity.NOM);
        TVprenom.setText(MainActivity.PRENOM);
        TVage.setText(MainActivity.AGE);
        TVskill.setText(MainActivity.SKILL);
        TVnum.setText(MainActivity.NUM);

    }
}