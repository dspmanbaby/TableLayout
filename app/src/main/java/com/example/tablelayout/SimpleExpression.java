package com.example.tablelayout;

public class SimpleExpression {
    private Double operand1;
    private Double operand2;
    private String operator;

    public SimpleExpression(){
        operand1 = 0.0;
        operand2 = 0.0;
        operator = "+";
    }

    public void setOperand1(Double operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(Double operand2) {
        this.operand2 = operand2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Double getValue(){
        Double value = 0.0;
        if(operator.contentEquals("+")) {
            value = operand1 + operand2;
        }
        else if(operator.contentEquals("-")){
        value = operand1 - operand2;
        }
        else if(operator.contentEquals("*")){
            value = operand1 * operand2;
        }
        else if(operator.contentEquals("/")){
            if(operand2 !=0) {
                value = operand1 / operand2;
            }
        }
        else {
            value = operand1 % operand2;
        }
        return value;
    }
    public void clearOperands() {
        operand1 = 0.0;
        operand2 = 0.0;
    }
}
