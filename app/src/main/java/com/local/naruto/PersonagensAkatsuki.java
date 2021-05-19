package com.local.naruto;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PersonagensAkatsuki extends AppCompatActivity {

    TextView ninjasakatsuki;
    TextView descakatsuki;
    ImageView imgakatsuki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personagens_akatsuki);

        ninjasakatsuki = findViewById(R.id.ninjasakatsuki);
        imgakatsuki = findViewById(R.id.imgakatsuki);
        descakatsuki = findViewById(R.id.descakatsuki);

        Intent akatsuki = getIntent();

        String ninjas_akatsuki = akatsuki.getStringExtra("akatsuki");
        String desc_akatsuki = akatsuki.getStringExtra("descakatsuki");
        int img_akatsuki = akatsuki.getIntExtra("imgakatsuki", 0);

        ninjasakatsuki.setText(ninjas_akatsuki);
        descakatsuki.setText(desc_akatsuki);
        imgakatsuki.setImageResource(img_akatsuki);
    }
}