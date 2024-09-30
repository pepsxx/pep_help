package suleimanov.design.patterns.abstractFactory.website;

import suleimanov.design.patterns.abstractFactory.AbsractDevelop;
import suleimanov.design.patterns.abstractFactory.AbstractFabric;
import suleimanov.design.patterns.abstractFactory.AbstractProMen;
import suleimanov.design.patterns.abstractFactory.AbstarctTester;

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
