package com.example.firstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText campo1,campo2;
    TextView label_result;
    int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campo1=findViewById(R.id.campo1);
        campo2=findViewById(R.id.campo2);
        label_result=findViewById(R.id.label_result);



    }

    public void onClick(View view) {
        num1 = Integer.parseInt(campo1.getText().toString());
        num2 = Integer.parseInt(campo2.getText().toString());

        if (view.getId() == R.id.btn_sum) {
            sumar();
        } else if (view.getId() == R.id.btn_res) {
            resta();
        } else if (view.getId() == R.id.btn_mul) {
            multiplicar();
        } else if (view.getId() == R.id.btn_div) {
            dividir();
        }
    }

    private void resta() {
    int resta=num1-num2;
    label_result.setText("El resultado de la resta es :  "+resta);
    }

    private void sumar() {
        int suma=num1+num2;
        label_result.setText("El resultado de la suma es :  "+suma);
    }
    private void multiplicar() {
        int multiplicacion=num1*num2;
        label_result.setText("El resultado de la multiplicacion es :  "+multiplicacion);
    }
    private void dividir() {
        if(num2>0){
            float division=num1/num2;
            label_result.setText("El resultado de la division es  :  "+division);
        }
        else{
            Toast.makeText(this, "¡advertencia!", Toast.LENGTH_LONG).show();
            label_result.setText("El numero 2 no puede ser cero!");
        }


    }


}