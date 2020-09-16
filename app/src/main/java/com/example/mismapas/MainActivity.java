package com.example.mismapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView ivCarnaval, ivLajas, ivLaguna, ivMorro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivCarnaval = (ImageView) findViewById(R.id.ivCarnaval);
        ivLajas = (ImageView) findViewById(R.id.ivLajas);
        ivLaguna = (ImageView) findViewById(R.id.ivLaguna);
        ivMorro = (ImageView) findViewById(R.id.ivMorro);

        ivCarnaval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MapsActivity.class);

                i.putExtra(getResources().getString(R.string.latitud), 1.210557149638243);
                i.putExtra(getResources().getString(R.string.longitud), -77.27654725313188);
                i.putExtra(getResources().getString(R.string.etiqueta), "Carnaval de Negros y Blancos");

                startActivity(i);
            }
        });

        ivLajas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MapsActivity.class);

                i.putExtra(getResources().getString(R.string.latitud), 0.8055588434009985);
                i.putExtra(getResources().getString(R.string.longitud), -77.5860419869423);
                i.putExtra(getResources().getString(R.string.etiqueta), "Santuario de Las Lajas");

                startActivity(i);
            }
        });

        ivLaguna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MapsActivity.class);

                i.putExtra(getResources().getString(R.string.latitud), 1.1287721910265163);
                i.putExtra(getResources().getString(R.string.longitud), -77.14994430541994);
                i.putExtra(getResources().getString(R.string.etiqueta), "Laguna de la Cocha");

                startActivity(i);
            }
        });

        ivMorro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MapsActivity.class);

                i.putExtra(getResources().getString(R.string.latitud), 1.832558909451623);
                i.putExtra(getResources().getString(R.string.longitud), -78.73273730278015);
                i.putExtra(getResources().getString(R.string.etiqueta), "El Morro");

                startActivity(i);
            }
        });
    }
}