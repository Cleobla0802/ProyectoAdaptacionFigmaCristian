package es.iescarrillo.proyectoadaptacionfigmacristian;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton registro;

    private MaterialButton inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton registro = findViewById(R.id.btnRegistrar);
        MaterialButton inicio = findViewById(R.id.btnIniciarSesion);

        // Colores ARGB
        int rojo = 0xFFFF3B30; // rojo
        int gris = 0xFF707070; // gris

        inicio.setBackgroundColor(rojo);
        registro.setBackgroundColor(gris);

        inicio.setOnClickListener(v -> {
            inicio.setBackgroundColor(rojo);
            registro.setBackgroundColor(gris);
        });

        registro.setOnClickListener(v -> {
            registro.setBackgroundColor(rojo);
            inicio.setBackgroundColor(gris);
        });
    }
}