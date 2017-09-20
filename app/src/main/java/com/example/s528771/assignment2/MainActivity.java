package com.example.s528771.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fetch1(View v){
        Button b1 = (Button) findViewById(R.id.button1);
        EditText E1 = (EditText) findViewById(R.id.editText);
        String s1 = E1.getText().toString()+"H";
        E1.setText(s1);
e1.set();

    }
    public void fetch2(View v){
        Button b2 = (Button) findViewById(R.id.button2);
        EditText E2 = (EditText) findViewById(R.id.editText);
        String s1 = E2.getText().toString()+"O";
        E2.setText(s1);

    }
    public void fetch3(View v){
        Button b3 = (Button) findViewById(R.id.button3);
        EditText E3 = (EditText) findViewById(R.id.editText);
        String s3 = E3.getText().toString()+"Na";
        E3.setText(s3);

    }
    public void fetch4(View v){
        Button b4 = (Button) findViewById(R.id.button4);
        EditText E4 = (EditText) findViewById(R.id.editText);
        String s4 = E4.getText().toString()+"Cl";
        E4.setText(s4);

    }
    public void fetch5(View v){
        Button b5 = (Button) findViewById(R.id.button5);
        EditText E5 = (EditText) findViewById(R.id.editText);
        String s5 = E5.getText().toString()+"K";
        E5.setText(s5);

    }
    public void fetch6(View v){
        Button b6 = (Button) findViewById(R.id.button1);
        EditText E6 = (EditText) findViewById(R.id.editText);
        String s6 = E6.getText().toString()+"He";
        E6.setText(s6);

    }
    public void fetch7(View v){
        Button b7 = (Button) findViewById(R.id.button7);
        EditText E7 = (EditText) findViewById(R.id.editText);
        String s7 = E7.getText().toString()+"C";
        E7.setText(s7);

    }
    public void fetch8(View v){
        Button b8= (Button) findViewById(R.id.button8);
        EditText E8 = (EditText) findViewById(R.id.editText);
        String s8 = E8.getText().toString()+"Se";
        E8.setText(s8);

    }
    public void fetch9(View v){
        Button b9 = (Button) findViewById(R.id.button9);
        EditText E9 = (EditText) findViewById(R.id.editText);
        String s9 = E9.getText().toString()+"Po";
        E9.setText(s9);

    }
    public void clear(View v) {
        Button b9 = (Button) findViewById(R.id.button10);
        EditText E9 = (EditText) findViewById(R.id.editText);
        TextView textView=(TextView) findViewById(R.id.textView3);
        E9.setText("");
        textView.setText("");
    }

    public void FormulaForming(View V)
    {
        EditText E10 = (EditText) findViewById(R.id.editText);
        TextView textView=(TextView) findViewById(R.id.textView3);
        String value=E10.getText().toString();
        String[] values1 = value.split("(?=[A-Z])");
        StringBuilder sb = new StringBuilder();
        String element = null;
        int number = 1;

        for (String chemicalElement : values1) {
            if (!chemicalElement.equals(element)) {
                if (element != null) {
                    sb.append(element);
                    if(number > 1) sb.append(number);
                }

                element = chemicalElement;
                number = 1;
            } else {
                number++;
            }
        }
        sb.append(element);
        if (number > 1) sb.append(number);
        textView.setText(sb);
    }
}
