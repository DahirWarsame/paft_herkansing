package com.company;

public class AndRegelWoorden extends Expression {

    private Expression expression1;
    private Expression expression2;

    public AndRegelWoorden(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    public String interpret(String context) {
        if (!expression1.interpret(context).equals("false") && !expression2.interpret(context).equals("false")) {
            return expression1.interpret(context) + expression2.interpret(context);
        } else {
            return "false";
        }
    }
}