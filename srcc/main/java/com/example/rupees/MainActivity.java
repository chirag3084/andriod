package com.example.rupees;

import android.annotation.SuppressLint;
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

            private EditText editText;

            private TextView textView;

            @SuppressLint("MissingInflatedId")
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                EdgeToEdge.enable(this);
                setContentView(R.layout.activity_main);
                editText = findViewById(R.id.e1);
                Button button = findViewById(R.id.b1);
                textView = findViewById(R.id.t1);

                button.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onClick(View v) {
                        String s1 = editText.getText().toString();
                        int a = Integer.parseInt(s1);
                        int result = a * 87;
                        textView.setText("answer : "+result);

                    }
                });


            }


        }