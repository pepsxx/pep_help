package suleimanov.design.patterns.abstractFactory.website;

import suleimanov.design.patterns.abstractFactory.AbstractProMen;

public class WebsiteProMen implements AbstractProMen {
    @Override
    public void managementProject() {
        System.out.println("Management WEB Project");
    }
}
