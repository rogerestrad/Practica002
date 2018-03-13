package com.rogerestrad.practica002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numero1,numero2;
    TextView resultado;
    float a,b,x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        numero1= (EditText)findViewById(R.id.editText1);
        numero2=(EditText)findViewById(R.id.editText2);
        resultado=(TextView)findViewById(R.id.txtresultdo);
    }
    public void sumar (View v){

        a = Float.parseFloat(numero1.getText().toString());
        b = Float.parseFloat(numero2.getText().toString());
        x=a+b;
        resultado.setText(Float.toString(x));
    }
    public void restar (View v){

        a = Float.parseFloat(numero1.getText().toString());
        b = Float.parseFloat(numero2.getText().toString());
        x=a-b;
        resultado.setText(Float.toString(x));
    }
    public void multi (View v){

        a = Float.parseFloat(numero1.getText().toString());
        b = Float.parseFloat(numero2.getText().toString());
        x=a*b;
        resultado.setText(Float.toString(x));
    }
    public void divi (View v){

        a = Float.parseFloat(numero1.getText().toString());
        b = Float.parseFloat(numero2.getText().toString());
        x=a/b;
        resultado.setText(Float.toString(x));
    }
}
