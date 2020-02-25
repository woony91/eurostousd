package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert (View view) {

        Log.i("Info", "Button Pressed");

        EditText etAmount = (EditText) findViewById(R.id.et_amount);

        String amountInEuros = etAmount.getText().toString();

        Double amountInEurosDouble = Double.parseDouble(amountInEuros);

        Double amountInDollarsDouble = amountInEurosDouble * 1.09;

        String amountInDollars = String.format("%.2f", amountInDollarsDouble);

        Log.i("Info", etAmount.getText().toString());

        Toast.makeText(this, amountInDollars, Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
