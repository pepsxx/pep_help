package suleimanov.design.patterns.generating.abstractFactory.banking;

import suleimanov.design.patterns.generating.abstractFactory.AbsractDevelop;

public class BankingDev implements AbsractDevelop {
    @Override
    public void writeCode() {
        System.out.println("Developer Java write code");
    }
}
