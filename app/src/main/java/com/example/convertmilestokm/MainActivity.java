package com.example.convertmilestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1,button2;
        final EditText editText1,editText2;
        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double miles=Double.valueOf(editText1.getText().toString());
                double km = miles/0.62137;
                DecimalFormat formatva=new DecimalFormat("##.##");
                editText2.setText(formatva.format(km));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double km=Double.valueOf(editText2.getText().toString());
                double miles = km*0.62137;
                DecimalFormat formatva=new DecimalFormat("##.##");
                editText1.setText(formatva.format(miles));
            }
        });

    }
}