package com.company;

public class TerminalExpression extends Expression {

    private String literal;

    private String translation_eng;

    public TerminalExpression(String str, String translation_eng) {
        this.literal = str;
        this.translation_eng = translation_eng;
    }

    @Override
    public String interpret(String context) {
        if (context.contains(literal)) {
            return translation_eng;
        }
        return "false";
    }
}
