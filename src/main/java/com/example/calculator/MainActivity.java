package com.example.calculator;

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
    float number1, number2;
    float ans;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bPlus = (Button) findViewById(R.id.BPlus);
        Button bMinus = (Button) findViewById(R.id.BMinus);
        Button bMulti = (Button) findViewById(R.id.BMulti);
        Button bDivision = (Button) findViewById(R.id.BDivision);
        tv1 = findViewById(R.id.tv1);

        bPlus.setOnClickListener(this::plus);
        bMinus.setOnClickListener(this::minus);
        bMulti.setOnClickListener(this::multi);
        bDivision.setOnClickListener(this::division);
    }

    void getValues (){
        EditText editText1 = findViewById(R.id.eText1);
        EditText editText2 = findViewById(R.id.eText2);
        String num1 = editText1.getText().toString();
        String num2 = editText2.getText().toString();
        number1 = Integer.parseInt(num1);
        number2 = Integer.parseInt(num2);
        }
    void setValues() {
        TextView textView = findViewById(R.id.tv2);
        String s = ans+"";
        textView.setText(s);
    }

    void plus(View view){
        getValues();
        ans = (number1 + number2);
        setValues();
        tv1.setText("Addition");
    }

    void minus(View view){
        getValues();
        ans = (number1 - number2);
        setValues();
        tv1.setText("Subtraction");
    }

    void multi(View view){
        getValues();
        ans = (number1 * number2);
        setValues();
        tv1.setText("Maultiplication");
    }
    void division(View view){
        getValues();
        ans = (number1/number2);
        setValues();
        tv1.setText("Division");
    }
}