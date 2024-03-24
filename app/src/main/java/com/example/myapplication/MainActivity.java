package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView result;
   EditText input1, input2;
    Button clear_text2;

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        input1 = findViewById(R.id.Operand1);
        input2 = findViewById(R.id.Operand2);




        Button myadd = findViewById(R.id.addbutton);
        Button mysubtract = findViewById(R.id.subtractbutton);
        Button mymultiply = findViewById(R.id.Multiplybutton);
        Button mydivide = findViewById(R.id.Dividebutton);
        clear_text2 = findViewById(R.id.clear_text2);
        myadd.setOnClickListener(this);
        mysubtract.setOnClickListener(this);
        mymultiply.setOnClickListener(this);
        mydivide.setOnClickListener(this);
        clear_text2.setOnClickListener(this);
    }


    public void onClick(View v){
        if (v.getId() == R.id.addbutton){
            double in1, in2;
            in1 = Double.parseDouble( input1.getText().toString() );
            in2 = Double.parseDouble( input2.getText().toString() );
            double out = in1 + in2;
            result.setText(String.valueOf(out) );

        }
        if (v.getId() == R.id.subtractbutton) {
            double in1, in2;
            in1 = Double.parseDouble(input1.getText().toString());
            in2 = Double.parseDouble(input2.getText().toString());
            double out = in1 - in2;
            result.setText(String.valueOf(out));
        }
        if (v.getId() == R.id.Multiplybutton) {
            double in1, in2;
            in1 = Double.parseDouble(input1.getText().toString());
            in2 = Double.parseDouble(input2.getText().toString());
            double out = in1 * in2;
            result.setText(String.valueOf(out));
        }
        if (v.getId() == R.id.Dividebutton) {
            double in1, in2;
            in1 = Double.parseDouble(input1.getText().toString());
            in2 = Double.parseDouble(input2.getText().toString());
            double out = in1 / in2;
            result.setText(String.valueOf(out));
        }


        else if(v.getId() == R.id.clear_text2){
            input1.setText("");
            input2.setText("");
        }}
}