package suleimanov.design.patterns.generating.factoryAbstract.website;

import suleimanov.design.patterns.generating.factoryAbstract.AbsractDevelop;

public class WebsiteDev implements AbsractDevelop {
    @Override
    public void writeCode() {
        System.out.println("Developer PHP write code");
    }
}
