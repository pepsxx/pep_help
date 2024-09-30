package suleimanov.design.patterns.abstractFactory.banking;

import suleimanov.design.patterns.abstractFactory.AbstractProMen;

public class BankingProMen implements AbstractProMen {
    @Override
    public void managementProject() {
        System.out.println("Management bank Project");
    }
}
