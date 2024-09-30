package suleimanov.design.patterns.abstractFactory.banking;

import suleimanov.design.patterns.abstractFactory.AbsractDevelop;
import suleimanov.design.patterns.abstractFactory.AbstractFabric;
import suleimanov.design.patterns.abstractFactory.AbstractProMen;
import suleimanov.design.patterns.abstractFactory.AbstarctTester;

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
