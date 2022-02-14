package com.example.myapplicationjava;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnValidate;

    private EditText ETnom;
    private EditText ETprenom;
    private EditText ETage;
    private EditText ETskill;
    private EditText ETnum;

    public static  String NOM;
    public static  String PRENOM;
    public static  String AGE;
    public static  String SKILL;
    public static  String NUM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ETnom = (EditText) findViewById(R.id.editTextLastName);
        ETprenom = (EditText) findViewById(R.id.editTextFirstName);
        ETage = (EditText) findViewById(R.id.editTextAge);
        ETskill = (EditText) findViewById(R.id.editTextSkill);
        ETnum = (EditText) findViewById(R.id.editTextNum);

        btnValidate = (Button)findViewById(R.id.btnValidate);
        btnValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Validation");
                alertDialog.setMessage("Etes-vous sure de vouloir valider ?");
                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Annuler", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Valider", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //dialogInterface.dismiss();
                        NOM = ETnom.getText().toString();
                        PRENOM = ETprenom.getText().toString();
                        AGE = ETage.getText().toString();
                        SKILL = ETskill.getText().toString();
                        NUM = ETnum.getText().toString();

                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                    }
                });

                alertDialog.show();
            }
        });
    }
}