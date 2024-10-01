package suleimanov.design.patterns.generating.abstractFactory.website;

import suleimanov.design.patterns.generating.abstractFactory.AbstractProMen;

public class WebsiteProMen implements AbstractProMen {
    @Override
    public void managementProject() {
        System.out.println("Management WEB Project");
    }
}
