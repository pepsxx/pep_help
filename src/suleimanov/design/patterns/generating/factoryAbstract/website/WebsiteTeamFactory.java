package suleimanov.design.patterns.generating.factoryAbstract.website;

import suleimanov.design.patterns.generating.factoryAbstract.AbsractDevelop;
import suleimanov.design.patterns.generating.factoryAbstract.AbstractFabric;
import suleimanov.design.patterns.generating.factoryAbstract.AbstractProMen;
import suleimanov.design.patterns.generating.factoryAbstract.AbstarctTester;

public class WebsiteTeamFactory implements AbstractFabric {
    @Override
    public AbstarctTester getTester() {
        return new WebsiteTester();
    }

    @Override
    public AbsractDevelop getDevLop() {
        return new WebsiteDev();
    }

    @Override
    public AbstractProMen getProjMn() {
        return new WebsiteProMen();
    }
}
