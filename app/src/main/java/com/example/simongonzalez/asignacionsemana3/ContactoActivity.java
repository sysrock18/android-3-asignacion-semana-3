package com.example.simongonzalez.asignacionsemana3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactoActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText nombre;
    private EditText correo;
    private EditText mensaje;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        nombre = (EditText) findViewById(R.id.input_nombre);
        correo = (EditText) findViewById(R.id.input_correo);
        mensaje = (EditText) findViewById(R.id.input_mensaje);
        enviar = (Button) findViewById(R.id.btn_enviar);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        if(toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setTitle(getResources().getString(R.string.contacto));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txNombre = nombre.getText().toString();
                String txCorreo = correo.getText().toString();
                String txMensaje = mensaje.getText().toString();

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{ txCorreo });
                i.putExtra(Intent.EXTRA_SUBJECT, txNombre);
                i.putExtra(Intent.EXTRA_TEXT   , txMensaje);
                try {
                    startActivity(Intent.createChooser(i, "Enviar correo..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(ContactoActivity.this, "No hay clientes de correo instalados.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
