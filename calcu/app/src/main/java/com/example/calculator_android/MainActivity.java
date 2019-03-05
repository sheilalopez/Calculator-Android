package com.example.calculator_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button num0;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private Button equal;
    private Button clear;
    private Button sin;
    private Button cos;
    private Button tan;
    private Button decimal;
    private Switch grarad;
    private TextView result;

    private final char ADDITION = '+';
    private final char SUBTRACT = '-';
    private final char MULTIPLY = '*';
    private final char DIVIDE = '/';
    private final char EQUAL = '0';
    private final char SIN = 's';
    private final char COS = 'c';
    private final char TAN = 't';

    private char ACTION;

    private double val1 = Double.NaN;
    private double val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}