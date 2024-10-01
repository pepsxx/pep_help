package suleimanov.design.patterns.generating.abstractFactory.website;

import suleimanov.design.patterns.generating.abstractFactory.AbsractDevelop;

public class WebsiteDev implements AbsractDevelop {
    @Override
    public void writeCode() {
        System.out.println("Developer PHP write code");
    }
}
