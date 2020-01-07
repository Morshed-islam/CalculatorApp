package com.demo.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnOne, btnTwo, btnThree, btnFour, btnfive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnEqual, btnClear;
    private Button btnAdd, btnSub, btnMul, btnDiv;
    private TextView info, result;

    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQUAL = 0;

    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "1");

            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "4");
            }
        });

        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "9");

            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "0");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                info =>  val1  = 1
                // result = 1+
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1) + "+");
                info.setText(null);


            }
        });


        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                info =>  val1  = 1
                // result = 1+
                compute();
                ACTION = SUBTRACTION;
                result.setText(String.valueOf(val1) + "-");
                info.setText(null);


            }
        });


        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                info =>  val1  = 1
                // result = 1+
                compute();
                ACTION = MULTIPLICATION;
                result.setText(String.valueOf(val1) + "*");
                info.setText(null);


            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                info =>  val1  = 1
                // result = 1+
                compute();
                ACTION = DIVISION;
                result.setText(String.valueOf(val1) + "/");
                info.setText(null);

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                compute();
                ACTION = EQUAL;

//                val1 + result = total
                result.setText(result.getText().toString() + String.valueOf(val2) + " = " + String.valueOf(val1));
                info.setText(null);


            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                122324
                if (info.getText().length() > 0) {

                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length() - 1));

                } else {
                    info.setText(null);
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    result.setText(null);
                }

            }
        });


    }


    private void initViews() {

        btnOne = findViewById(R.id.button1);
        btnTwo = findViewById(R.id.button2);
        btnThree = findViewById(R.id.button3);
        btnFour = findViewById(R.id.button4);
        btnfive = findViewById(R.id.button5);
        btnSix = findViewById(R.id.button6);
        btnSeven = findViewById(R.id.button7);
        btnEight = findViewById(R.id.button8);
        btnNine = findViewById(R.id.button9);
        btnZero = findViewById(R.id.button0);
        btnClear = findViewById(R.id.buttonClear);

        btnAdd = findViewById(R.id.buttonSum);
        btnSub = findViewById(R.id.buttonMinus);
        btnMul = findViewById(R.id.buttonTimes);
        btnDiv = findViewById(R.id.buttonDiv);
        btnEqual = findViewById(R.id.buttonEq);

        info = findViewById(R.id.tv_info);
        result = findViewById(R.id.tv_result);

    }

    // val1 = 10
    // val2 = 20
    //val1 = 30

    private void compute() {

        if (!Double.isNaN(val1)) {

            val2 = Double.parseDouble(info.getText().toString());

            switch (ACTION) {

                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case EQUAL:
                    break;

            }
        } else {
            val1 = Double.parseDouble(info.getText().toString());
        }

    }


}
