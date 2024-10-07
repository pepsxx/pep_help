package suleimanov.design.patterns.generating.factoryAbstract.banking;

import suleimanov.design.patterns.generating.factoryAbstract.AbsractDevelop;
import suleimanov.design.patterns.generating.factoryAbstract.AbstractFabric;
import suleimanov.design.patterns.generating.factoryAbstract.AbstractProMen;
import suleimanov.design.patterns.generating.factoryAbstract.AbstarctTester;

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
