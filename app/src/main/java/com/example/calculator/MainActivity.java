
package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText num1,num2;
    private Button add,sub,mul,div;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.button);
        sub = findViewById(R.id.button2);
        mul = findViewById(R.id.button3);
        div = findViewById(R.id.button4);
        num1 = findViewById(R.id.editTextText);
        num2 = findViewById(R.id.editTextText2);
        tv = findViewById(R.id.textView);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();
                if ((num1.length() > 0) && (num2.length() > 0)) {
                    int n1 = Integer.parseInt(s1);
                    int n2 = Integer.parseInt(s2);
                    int sum = n1 + n2;
                    tv.setText(Integer.toString(sum));
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Please enter the fields ", Toast.LENGTH_SHORT);
                    toast.show();

                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();
                if ((num1.length() > 0) && (num2.length() > 0)) {

                    int n1 = Integer.parseInt(s1);
                    int n2 = Integer.parseInt(s2);
                    int sub = n1 - n2;
                    tv.setText(Integer.toString(sub));
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Please enter the fields ", Toast.LENGTH_SHORT);
                    toast.show();

                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();
                if ((num1.length() > 0) && (num2.length() > 0)) {
                    int n1 = Integer.parseInt(s1);
                    int n2 = Integer.parseInt(s2);
                    int mul = n1 * n2;
                    tv.setText(Integer.toString(mul));
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Please enter the fields ", Toast.LENGTH_SHORT);
                    toast.show();

                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();
                if ((num1.length() > 0) && (num2.length() > 0)) {
                    int n1 = Integer.parseInt(s1);
                    int n2 = Integer.parseInt(s2);
                    int div = n1 / n2;
                    tv.setText(Integer.toString(div));
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Please enter the fields ", Toast.LENGTH_SHORT);
                    toast.show();

                }
            }
        });


    }
}











