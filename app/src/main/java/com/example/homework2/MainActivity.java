package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button zero, one, two, three, four, five, six, seven, eight, nine, addition, subtraction, multiplication, point, equally, division;
    TextView result;
    boolean first_input;
    boolean first_action;
    boolean val_1;
    double value1;
    double value2;
    String sign = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeReference();

        result.setText("0");
        first_input = true;
        first_action = true;



        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first_input) {
                    result.setText("0");
                    first_input = false;
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "0"));
                }
                first_action = true;

            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first_input) {
                    result.setText("1");
                    first_input = false;
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "1"));
                }
                first_action = true;

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first_input) {
                    result.setText("2");
                    first_input = false;
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "2"));
                }
                first_action = true;
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first_input) {
                    result.setText("3");
                    first_input = false;
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "33"));
                }
                first_action = true;
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first_input) {
                    result.setText("4");
                    first_input = false;
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "4"));
                }
                first_action = true;
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first_input) {
                    result.setText("5");
                    first_input = false;
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "5"));
                }
                first_action = true;
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first_input) {
                    result.setText("6");
                    first_input = false;
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "6"));
                }
                first_action = true;
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first_input) {result.setText("7");
                    first_input = false;
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "5"));
                }
                first_action = true;
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first_input) {
                    result.setText("8");
                    first_input = false;
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "8"));
                }
                first_action = true;
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first_input) {
                    result.setText("9");
                    first_input = false;
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "9"));
                }
                first_action = true;
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first_input) {
                    result.setText(".");
                    first_input = false;
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "."));
                }
                first_action = true;
            }
        });
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign="+";
                if (first_action) {
                    if (val_1) {
                        value1 = Double.valueOf(result.getText().toString());
                        val_1 = true;
                    } else {
                        value2 = Double.valueOf(result.getText().toString());
                    }
                    first_action = false;
                }
                result.setText("+");
                first_input=true;
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign="-";
                if (first_action) {
                    if (val_1) {
                        value1 = Double.valueOf(result.getText().toString());
                        val_1 = true;
                    } else {
                        value2 = Double.valueOf(result.getText().toString());
                    }
                    first_action = false;
                }
                result.setText("-");
                first_input=true;
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign="╳";
                if (first_action) {
                    if (val_1) {
                        value1 = Double.valueOf(result.getText().toString());
                        val_1 = true;
                    } else {
                        value2 = Double.valueOf(result.getText().toString());
                    }
                    first_action = false;
                }
                result.setText("╳");
                first_input=true;
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign="/";
                if (first_action) {
                    if (val_1) {
                        value1 = Double.valueOf(result.getText().toString());
                        val_1 = true;
                    } else {
                        value2 = Double.valueOf(result.getText().toString());
                    }
                    first_action = false;
                }
                result.setText("/");
                first_input=true;
            }
        });


        equally.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(first_action){
                    if(!val_1){
                        value1=Double.valueOf(result.getText().toString());
                        val_1=false;
                    }else {
                        value2=Double.valueOf(result.getText().toString());
                    }
                    if(sign.equals("+")){
                        double sum = value1+value2; result.setText(String.valueOf(sum));
                    }else {
                        result.setText(result.getText());
                    }
                    if(sign.equals("-")){
                        double residual = value2-value1; result.setText(String.valueOf(residual));
                    }else {
                        result.setText(result.getText());
                    }
                    if(sign.equals("╳")){
                        double residual = value1*value2; result.setText(String.valueOf(residual));
                    }else {
                        result.setText(result.getText());
                    }
                    if(sign.equals("/")){
                        double residual = value2/value1; result.setText(String.valueOf(residual));
                    }else {
                        result.setText(result.getText());
                    }

                }else{
                    result.setText("Error");
                }
                value1=0;
                value2=0;
                val_1=false;
                first_input=true;
                first_action=true;

            }
        });
    }

    private void initializeReference() {
        zero = findViewById(R.id.button_0);
        one = findViewById(R.id.button_1);
        two = findViewById(R.id.button_2);
        three = findViewById(R.id.button_3);
        four = findViewById(R.id.button_4);
        five = findViewById(R.id.button_5);
        six = findViewById(R.id.button_6);
        seven = findViewById(R.id.button_7);
        eight = findViewById(R.id.button_8);
        nine = findViewById(R.id.button_9);
        addition = findViewById(R.id.button_addition);
        subtraction = findViewById(R.id.button_subtraction);
        multiplication = findViewById(R.id.button_multiplication);
        point = findViewById(R.id.button_point);
        equally = findViewById(R.id.button_equally);
        division = findViewById(R.id.button_division);

        result = findViewById(R.id.result_text_view);
    }
}