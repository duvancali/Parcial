package com.example.duvan.trabajo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;




public class informacion2 extends AppCompatActivity {

    Bundle info;

    String nomtext2;
    String apetext2;
    String dirtext2;
    String ematext2;

    TextView nombre;
    TextView apellido;
    TextView direccion;
    TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion2);

   info = getIntent().getExtras();

        nombre = (TextView)findViewById(R.id.nomtext);
        info = getIntent().getExtras();
        nomtext2 = info.getString("nomtext");
        nombre.setText(nomtext2);

        apellido = (TextView)findViewById(R.id.apetext);
        info = getIntent().getExtras();
        nomtext2 = info.getString("apetext");
        nombre.setText(apetext2);

        direccion = (TextView)findViewById(R.id.dirtext);
      info = getIntent().getExtras();
        nomtext2 =info.getString("dirtext");
        nombre.setText(dirtext2);

        email = (TextView)findViewById(R.id.ematext);
        info = getIntent().getExtras();
        nomtext2 = info.getString("ematext");
        nombre.setText(ematext2);

    }
}
