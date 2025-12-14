package es.iescarrillo.proyectoadaptacionfigmacristian.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import es.iescarrillo.proyectoadaptacionfigmacristian.R;
import es.iescarrillo.proyectoadaptacionfigmacristian.activities.HomeActivity;

public class LoginFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        // Botones
        Button btnIniciar = view.findViewById(R.id.btnIniciarSesionToggle);
        Button btnRegistrar = view.findViewById(R.id.btnRegistrarToggle);
        Button btnMain = view.findViewById(R.id.btnMainAction);
        TextView tvForgot = view.findViewById(R.id.tvForgotPassword);

        // Botones de redes sociales
        Button btnFacebook = view.findViewById(R.id.btnFacebook);
        Button btnGoogle = view.findViewById(R.id.btnGoogle);

        // colores ARGB
        int rojo = 0xFFFF3B30;   // Rojo
        int gris = 0xFF707070;   // Gris

        btnIniciar.setBackgroundColor(rojo);
        btnRegistrar.setBackgroundColor(gris);
        btnMain.setText("Iniciar Sesión");
        btnMain.setBackgroundColor(rojo);

        btnFacebook.setText("Continuar con Facebook");
        btnFacebook.setBackgroundColor(Color.parseColor("#3b5998"));
        btnFacebook.setTextColor(Color.WHITE);
        btnFacebook.setCompoundDrawablesWithIntrinsicBounds(R.drawable.facebook, 0, 0, 0);
        btnFacebook.setPadding(32, btnFacebook.getPaddingTop(), btnFacebook.getPaddingRight(), btnFacebook.getPaddingBottom());

        btnGoogle.setText("Continuar con Google");
        btnGoogle.setBackgroundColor(Color.WHITE);
        btnGoogle.setTextColor(Color.BLACK);
        btnGoogle.setCompoundDrawablesWithIntrinsicBounds(R.drawable.google, 0, 0, 0);
        btnGoogle.setPadding(32, btnGoogle.getPaddingTop(), btnGoogle.getPaddingRight(), btnGoogle.getPaddingBottom());

        btnIniciar.setOnClickListener(v -> {
            btnIniciar.setBackgroundColor(rojo);
            btnRegistrar.setBackgroundColor(gris);
            btnMain.setText("Iniciar Sesión");
        });

        btnRegistrar.setOnClickListener(v -> {
            btnRegistrar.setBackgroundColor(rojo);
            btnIniciar.setBackgroundColor(gris);
            btnMain.setText("Registrar");
        });

        btnMain.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), HomeActivity.class);
            startActivity(intent);
        });

        return view;
    }
}