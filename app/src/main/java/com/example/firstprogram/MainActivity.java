package com.example.firstprogram;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText txtX, txtY;
    TextView txtResult;
    Button btnPlus,btnMinus,btnMultiphy,btnDivide,btnMod;

    private void initControl() {
        txtX = findViewById(R.id.txtX);
        txtY = findViewById(R.id.txtY);
        txtResult = findViewById(R.id.txtResult);
        btnPlus = findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x+y;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnMinus = findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x-y;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnMultiphy = findViewById(R.id.btnMultiphy);
        btnMultiphy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x*y;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnDivide = findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x/y;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnMod = findViewById(R.id.btnMod);
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x%y;
                txtResult.setText(String.valueOf(result));
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControl();
    }
}