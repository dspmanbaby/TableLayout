package com.example.tablelayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView display;
    private SimpleExpression operatorCalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operatorCalc = new SimpleExpression();
        display = findViewById(R.id.TextView);
    }
    public void goOperand(View v) {
        String digit = (String)v.getContentDescription();
        String value = (String)display.getText();
        if(value.charAt(0) == ('0')){
            display.setText(digit);
        }
        else {
            String nval = (display.getText() + digit);
            display.setText(nval);
        }
    }
    public void allClear(View v){
        display.setText("0.0");
        operatorCalc.clearOperands();
    }
    public void goOperator(View v) {
        String operator = (String)v.getContentDescription();
        String value = (String)display.getText();
        Double operand = Double.parseDouble(value);
        this.operatorCalc.setOperand1(operand);
        this.operatorCalc.setOperator(operator);
        display.setText("0");
    }
    public void goCompute(View v){
        String value = (String)display.getText();
        Double operand2 = Double.parseDouble(value);
        this.operatorCalc.setOperand2(operand2);
        display.setText(operatorCalc.getValue().toString());
    }
}