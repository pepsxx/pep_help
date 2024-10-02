package suleimanov.design.patterns.behavioral.interpreter;

public class ExpressionOr implements Expression {
    private Expression expression1;
    private Expression expression2;

    public ExpressionOr(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean Interpret(String context) {
        return expression1.Interpret(context) || expression2.Interpret(context);
    }
}
