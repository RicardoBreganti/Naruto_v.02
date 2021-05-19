package com.local.naruto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class NinjasAkatsuki extends AppCompatActivity {

    ListView lista_akatsuki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ninjas_akatsuki);

        lista_akatsuki = findViewById(R.id.akatsuki);

        Adaptador adaptador = new Adaptador();

        lista_akatsuki.setAdapter(adaptador);

        lista_akatsuki.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent akatsuki = new Intent(getApplicationContext(), PersonagensAkatsuki.class);
                akatsuki.putExtra("akatsuki", NomePersonagens.Akatsuki.akatsuki[position]);
                akatsuki.putExtra("descakatsuki", Description.akatsuki.descakatsuki[position]);
                akatsuki.putExtra("imgakatsuki", ImagemPersonagens.Akatsuki.imgakatsuki[position]);

                startActivity(akatsuki);
            }
        });
    }

    public class Adaptador extends BaseAdapter {
        @Override
        public int getCount() {
            return ImagemPersonagens.Akatsuki.imgakatsuki.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView ninjasakatsuki;
            ImageView imgakatsuki;

            View mostrar = getLayoutInflater().inflate(R.layout.akatsuki, null);

            ninjasakatsuki = mostrar.findViewById(R.id.ninjasakatsuki);
            imgakatsuki = mostrar.findViewById(R.id.imgakatsuki);

            ninjasakatsuki.setText(NomePersonagens.Akatsuki.akatsuki[position]);
            imgakatsuki.setImageResource(ImagemPersonagens.Akatsuki.imgakatsuki[position]);
            return mostrar;
        }
    }
}