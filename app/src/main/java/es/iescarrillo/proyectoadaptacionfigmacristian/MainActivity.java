package es.iescarrillo.proyectoadaptacionfigmacristian;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton btnLogin;
    private MaterialButton btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        // Estado inicial: Login activo
        activateLogin();

        // Listener para Iniciar Sesión
        btnLogin.setOnClickListener(v -> {
            activateLogin();
            replaceFragment(new LoginFragment());
        });

        // Listener para Registrar
        btnRegister.setOnClickListener(v -> {
            activateRegister();
            replaceFragment(new RegisterFragment());
        });
    }

    private void activateLogin() {
        btnLogin.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.red));
        btnRegister.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.light_grey));
    }

    private void activateRegister() {
        btnRegister.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.red));
        btnLogin.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.light_grey));
    }

    private void replaceFragment(androidx.fragment.app.Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.contenedorFragment, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}