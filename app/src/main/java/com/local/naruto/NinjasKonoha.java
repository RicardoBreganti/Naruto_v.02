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

public class NinjasKonoha extends AppCompatActivity {

    ListView lista_konoha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ninjas_konoha);

        lista_konoha = findViewById(R.id.konoha);

        Adaptador adaptador = new Adaptador();

        lista_konoha.setAdapter(adaptador);

        lista_konoha.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent konoha = new Intent(getApplicationContext(), PersonagensKonoha.class);
                konoha.putExtra("konoha", NomePersonagens.Konoha.konoha[position]);
                konoha.putExtra("desckonoha", Description.konoha.desckonoha[position]);
                konoha.putExtra("imgkonoha", ImagemPersonagens.Konoha.imgkonoha[position]);

                startActivity(konoha);
            }
        });
    }

    public class Adaptador extends BaseAdapter {
        @Override
        public int getCount() {
            return ImagemPersonagens.Konoha.imgkonoha.length;
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
            TextView ninjaskonoha;
            ImageView imgkonoha;

            View mostrar = getLayoutInflater().inflate(R.layout.konoha, null);

            ninjaskonoha = mostrar.findViewById(R.id.ninjaskonoha);
            imgkonoha = mostrar.findViewById(R.id.imgkonoha);

            ninjaskonoha.setText(NomePersonagens.Konoha.konoha[position]);
            imgkonoha.setImageResource(ImagemPersonagens.Konoha.imgkonoha[position]);
            return mostrar;
        }
    }
}