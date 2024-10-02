package suleimanov.design.patterns.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression isJava = getExpressionJava();
        Expression isPython = getExpressionPython();

        System.out.println("Java:   " + isJava.Interpret("Java Core"));
        System.out.println("Python: " + isPython.Interpret("Python Core"));
    }

    public static Expression getExpressionJava() {
        Expression java = new ExpressionTerminal("Java");
        Expression javaCore = new ExpressionTerminal("Java Core");
        return new ExpressionOr(java, javaCore);
    }

    public static Expression getExpressionPython() {
        Expression python = new ExpressionTerminal("Python");
        Expression pythonCore = new ExpressionTerminal("Core");
        return new ExpressionAnd(python, pythonCore);
    }

}
