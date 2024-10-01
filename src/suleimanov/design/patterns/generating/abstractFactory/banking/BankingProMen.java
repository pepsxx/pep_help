package suleimanov.design.patterns.generating.abstractFactory.banking;

import suleimanov.design.patterns.generating.abstractFactory.AbstractProMen;

public class BankingProMen implements AbstractProMen {
    @Override
    public void managementProject() {
        System.out.println("Management bank Project");
    }
}
