package com.example.unconvertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView2;
    private EditText editTextNumberDecimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        editTextNumberDecimal = findViewById(R.id.editTextNumberDecimal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s= editTextNumberDecimal.getText().toString();
                double kg= Double.parseDouble(s);
                double pound= 2.20462 * kg;
                textView2.setText("The corresponding value in pound is "+ pound);
                Toast.makeText(MainActivity.this, "Thanks for using this app :)", Toast.LENGTH_SHORT).show();



            }
            });

    }
}