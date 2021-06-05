package com.example.calculator;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;

        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button btnAdd,btnSub,btnMul,btnDiv,btnEqual,btnDot,btnClear;
    EditText display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);

        btnAdd =(Button)findViewById(R.id.btnAdd);
        btnSub =(Button)findViewById(R.id.btnSub);
        btnMul =(Button)findViewById(R.id.btnMul);
        btnDiv =(Button)findViewById(R.id.btnDiv);

        btnDot =(Button)findViewById(R.id.btnDot);
        btnEqual =(Button)findViewById(R.id.btnEqual);

        btnClear =(Button)findViewById(R.id.btnClear);

        display =(EditText)findViewById(R.id.display);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("4");
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("5");
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("0");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("+");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("-");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("x");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("/");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append(".");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = display.getText().toString();



                if(data.contains("-")){
                    String operands[] = data.split("-");

                    double op1 = Double.parseDouble(operands[0]);
                    double op2 = Double.parseDouble(operands[1]);

                    double res = op1-op2;

                    display.setText(String.valueOf(res));

                }


                if(data.contains("x")){

                    String operands[] = data.split("x");
                    double op1 = Double.parseDouble(operands[0]);
                    double op2 = Double.parseDouble(operands[1]);

                    double res = op1*op2;
                    display.setText(String.valueOf(res));
                }


                if(data.contains("/")){

                    String operands[] = data.split("/");

                    double op1 = Double.parseDouble(operands[0]);
                    double op2 = Double.parseDouble(operands[1]);

                    if(op2==0){
                        Toast.makeText(MainActivity.this, "Divide by zero is not possible", Toast.LENGTH_SHORT).show();
                    }


                    double res = op1/op2;
                    display.setText(String.valueOf(res));

                }

                if(data.contains("+")){

                    String operands[] = data.split(Pattern.quote("+"));

                    double op1 = Double.parseDouble(operands[0]);
                    double op2 = Double.parseDouble(operands[1]);

                    double res = op1+op2;
                    display.setText(String.valueOf(res));

                }

            }

        });

    }

}