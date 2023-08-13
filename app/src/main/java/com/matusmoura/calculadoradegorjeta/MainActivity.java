package com.matusmoura.calculadoradegorjeta;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editValue;
    private TextView valueTip;
    private TextView textPercentage;
    private TextView textTotal;
    private SeekBar seekBarTip;

    private double percentage = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValue       = findViewById(R.id.ImputValue);
        valueTip        = findViewById(R.id.valueTip);
        textPercentage  = findViewById(R.id.idPercentage);
        textTotal       = findViewById(R.id.textTotal);
        seekBarTip      = findViewById(R.id.seekBarTip);


        //Manipulando SeekBar

        seekBarTip.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                percentage = progress;
                textPercentage.setText(Math.round(percentage) + " %");
                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        }
        public void calcular(){
         String valuePrimary = editValue.getText().toString();
         if (valuePrimary == null || valuePrimary.equals(" ")){
             Toast.makeText(getApplicationContext(),"Digite um valor!",Toast.LENGTH_LONG).show();
         }else{

             double valueImput = Double.parseDouble(valuePrimary);

             double tip = valueImput * (percentage/100);

             valueTip.setText("R$ "+Math.round(tip));
         }
        }
    }
