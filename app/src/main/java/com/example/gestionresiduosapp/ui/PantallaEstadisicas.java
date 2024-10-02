package com.example.gestionresiduosapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.gestionresiduosapp.R;

public class PantallaEstadisicas extends AppCompatActivity {

    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_estadisticas);

        btnVolver = findViewById(R.id.boton_volver);
        btnVolver.setOnClickListener(v -> {
            startActivity(new Intent(PantallaEstadisicas.this, PantallaPrincipal.class));
        });
    }
}