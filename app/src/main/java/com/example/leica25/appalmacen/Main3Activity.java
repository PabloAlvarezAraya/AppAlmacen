package com.example.leica25.appalmacen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    //declarar variables
    private TextView txtnombre, txtdetalle;
    private ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtnombre = findViewById(R.id.txtnombre);
        txtdetalle = findViewById(R.id.txtdetalle);
        image1 = findViewById(R.id.image1);

        //Obtenemos la posicion del activity 2
        String str = getIntent().getStringExtra("posicion");
        int pos = Integer.parseInt(str);

        //instanciar la clase

        Bebidas bebidas = Bebidas.drinks[pos];

        //completar controles para visualizar textos e imagenes
        txtnombre.setText(bebidas.getNombre());
        txtdetalle.setText(bebidas.getDescripcion());
        image1.setImageResource(bebidas.getImagenId());

    }


}
