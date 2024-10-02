package suleimanov.design.patterns.behavioral.interpreter;

public class ExpressionTerminal implements Expression {

    private String data;

    public ExpressionTerminal(String data) {
        this.data = data;
    }

    @Override
    public boolean Interpret(String context) {
        return context.contains(data);
    }
}
