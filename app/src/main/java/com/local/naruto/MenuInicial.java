package com.local.naruto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_inicial);
    }

    public void konoha(View view)
    {
        Intent konoha = new Intent(getApplicationContext(), NinjasKonoha.class);
        startActivity(konoha);
    }

    public void akatsuki(View view)
    {
        Intent akatsuki = new Intent(getApplicationContext(), NinjasAkatsuki.class);
        startActivity(akatsuki);
    }
}