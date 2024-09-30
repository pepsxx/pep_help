package suleimanov.design.patterns.abstractFactory.website;

import suleimanov.design.patterns.abstractFactory.AbsractDevelop;

public class WebsiteDev implements AbsractDevelop {
    @Override
    public void writeCode() {
        System.out.println("Developer PHP write code");
    }
}
