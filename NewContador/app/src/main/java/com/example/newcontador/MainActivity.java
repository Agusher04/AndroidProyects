package com.example.newcontador;

//import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

//import com.example.newcontador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //Button V;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void setButton(View V){
        EditText source = findViewById(R.id.source);
        String texto = source.getText().toString();

        TextView t = findViewById(R.id.textToModify);
        t.setText(texto);

        Log.d("info","texto en la app:" + texto);
    }
    public void enable(View V){
        Button b = findViewById(R.id.button11_b);
        b.setEnabled(true);
        b.setText("HABILITADO");
    }
    public void disable(View V){
        findViewById(R.id.button11_b).setEnabled(false);
        ((Button)findViewById(R.id.button11_b)).setText("DESABILITADO");
    }
}