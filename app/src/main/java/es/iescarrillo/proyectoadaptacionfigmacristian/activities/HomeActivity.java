package es.iescarrillo.proyectoadaptacionfigmacristian.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.ui.AppBarConfiguration;

import es.iescarrillo.proyectoadaptacionfigmacristian.R;
import es.iescarrillo.proyectoadaptacionfigmacristian.fragment.HomeFragment;

public class HomeActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ImageButton btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawerLayout = findViewById(R.id.drawerLayout);
        btnMenu = findViewById(R.id.btnMenu);

        // Abrir el menú al pulsar las tres rayas
        btnMenu.setOnClickListener(v -> drawerLayout.openDrawer(findViewById(R.id.navView)));

        // Cargar el fragmento inicial (si no lo has hecho ya)
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, new HomeFragment())
                    .commit();
        }
    }
}