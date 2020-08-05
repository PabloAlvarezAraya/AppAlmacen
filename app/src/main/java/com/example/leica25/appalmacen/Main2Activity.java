package com.example.leica25.appalmacen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    private ListView listaBebidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listaBebidas = findViewById(R.id.listaBebidas);

        ArrayAdapter<Bebidas> adapter = new ArrayAdapter<Bebidas>(this,android.R.layout.simple_list_item_1,Bebidas.drinks);

        listaBebidas.setAdapter(adapter);

        listaBebidas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                intent.putExtra("posicion",String.valueOf(i));
                startActivity(intent);
            }
        });


    }
}
