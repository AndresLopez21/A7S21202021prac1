package mx.edu.tesoem.isc.ala.a7s21202021prac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ParametroActivity extends AppCompatActivity {
    TextView lblsaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametro);
        lblsaludo = findViewById(R.id.lblsaludo);
        Bundle parametro = getIntent().getExtras();
        lblsaludo.setText("Bienvenido" + parametro.getString("Nombre"));


    }
}