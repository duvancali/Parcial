package com.example.duvan.trabajo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SearchViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class informacion1 extends AppCompatActivity {

    Button sgte;
    EditText nomText;
    EditText apetext;
    EditText dirtext;
    EditText emaText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion1);

        sgte = (Button)findViewById(R.id.enviar);
        nomText= (EditText) findViewById(R.id.nomtext);
        apetext= (EditText) findViewById(R.id.apetext);
        dirtext= (EditText) findViewById(R.id.dirtext);
        emaText= (EditText) findViewById(R.id.ematext);

        sgte.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(informacion1.this, informacion2.class);
                intent.putExtra("info",nomText.getText().toString());
                intent.putExtra("info",apetext.getText().toString());
                intent.putExtra("info",dirtext.getText().toString());
                intent.putExtra("info",emaText.getText().toString());
                startActivity(intent);
            }

      }};
  }
}

