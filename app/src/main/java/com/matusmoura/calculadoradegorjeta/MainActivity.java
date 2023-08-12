package com.matusmoura.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editValue;
    private TextView textTip;
    private TextView textPercentage;
    private TextView textTotal;
    private SeekBar seekBarTip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValue       = findViewById(R.id.ImputValue);
        textTip         = findViewById(R.id.textTip);
        textPercentage  = findViewById(R.id.idPercentage);
        textTotal       = findViewById(R.id.textTotal);
        seekBarTip      = findViewById(R.id.seekBarTip);
    }
}