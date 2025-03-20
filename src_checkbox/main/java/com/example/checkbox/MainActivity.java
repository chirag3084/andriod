package com.example.checkbox;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBox1, checkBox2, checkBox3;
    private TextView textView;
    private Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        checkBox1 = findViewById(R.id.c1);
        checkBox2 = findViewById(R.id.c2);
        checkBox3 = findViewById(R.id.c3);
        button = findViewById(R.id.b1);
        textView = findViewById(R.id.t2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
                result.append("selected values are:");
                if (checkBox1.isChecked()) {
                    result.append("\n ENGLISH");
                }
                if (checkBox2.isChecked()) {
                    result.append("\n HINDI");
                }
                if (checkBox3.isChecked()) {
                    result.append("\n Gujrati");
                }
                textView.setText(result);
            }
        });
    }
}










