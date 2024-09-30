package suleimanov.design.patterns.abstractFactory.banking;

import suleimanov.design.patterns.abstractFactory.AbsractDevelop;

public class BankingDev implements AbsractDevelop {
    @Override
    public void writeCode() {
        System.out.println("Developer Java write code");
    }
}
