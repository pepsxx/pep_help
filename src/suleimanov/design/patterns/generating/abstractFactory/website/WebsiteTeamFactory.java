package suleimanov.design.patterns.generating.abstractFactory.website;

import suleimanov.design.patterns.generating.abstractFactory.AbsractDevelop;
import suleimanov.design.patterns.generating.abstractFactory.AbstractFabric;
import suleimanov.design.patterns.generating.abstractFactory.AbstractProMen;
import suleimanov.design.patterns.generating.abstractFactory.AbstarctTester;

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
