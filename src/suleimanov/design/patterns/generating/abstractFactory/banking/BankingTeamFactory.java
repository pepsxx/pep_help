package suleimanov.design.patterns.generating.abstractFactory.banking;

import suleimanov.design.patterns.generating.abstractFactory.AbsractDevelop;
import suleimanov.design.patterns.generating.abstractFactory.AbstractFabric;
import suleimanov.design.patterns.generating.abstractFactory.AbstractProMen;
import suleimanov.design.patterns.generating.abstractFactory.AbstarctTester;

public class BankingTeamFactory implements AbstractFabric {
    @Override
    public AbstarctTester getTester() {
        return new BankingTester();
    }

    @Override
    public AbsractDevelop getDevLop() {
        return new BankingDev();
    }

    @Override
    public AbstractProMen getProjMn() {
        return new BankingProMen();
    }
}
