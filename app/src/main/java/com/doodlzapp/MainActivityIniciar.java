package com.doodlzapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityIniciar extends AppCompatActivity {
private Button buttonSiguiente;
private EditText editTextUsuario;
    static final String STATE_USER = "user";
private String mUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_iniciar);
        buttonSiguiente= findViewById(R.id.buttonIngresar);
        editTextUsuario= findViewById(R.id.editTextUsuario);


    }
    public void onClickValidarUsuario(View view){
        String nombre = editTextUsuario.getText().toString();
        if(nombre.equals("bruno")){
            Intent intent = new Intent(MainActivityIniciar.this, MainActivity.class);
            intent.putExtra("bruno", nombre);
            startActivity(intent);

        }else if(nombre.equals("rodrigo")){
            Intent intent = new Intent(MainActivityIniciar.this, MainActivity.class);

            startActivity(intent);
        }
    }


}