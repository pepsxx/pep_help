package suleimanov.design.patterns.generating.abstractFactory;

import suleimanov.design.patterns.generating.abstractFactory.banking.BankingTeamFactory;
import suleimanov.design.patterns.generating.abstractFactory.website.WebsiteTeamFactory;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                https://www.youtube.com/watch?v=cmyUI_ZezoU
                
                Шаблон: Абстрактная фабрика (Abstract Factory)
                =======================================================================================================
                Цель:
                
                Создание интерфейса, для создания множества взаимосвязанных или взаимозависимых объектов, без жёсткой
                привязке к конкретным классам.
                
                =======================================================================================================
                
                Для чего используется:
                
                Для создания множеств взаимосвязанных объектов.
                
                =======================================================================================================
                Пример использования:
                
                - система не должна зависеть от метода создания, компоновки и представления входящих в неё объектов;
                - входящие взаимосвязанные объекты должны использоваться вместе;
                - система должна конфигурироваться одним из множеств объектов, из которых она состоит;
                - нам необходимо предоставить множество объектов, раскрывая только их интерфейсы но не реализацию.
                
                =======================================================================================================""");

        AbstractFabric teamFactory = new Random().nextBoolean()
                ? new BankingTeamFactory()
                : new WebsiteTeamFactory();

        AbsractDevelop dev1 = teamFactory.getDevLop(); // Различные сотрудники, но одного проекта
        AbsractDevelop dev2 = teamFactory.getDevLop(); // Различные сотрудники, но одного проекта
        AbstractProMen proj = teamFactory.getProjMn(); // Различные сотрудники, но одного проекта
        AbstarctTester tstr = teamFactory.getTester(); // Различные сотрудники, но одного проекта

        dev1.writeCode();
        dev2.writeCode();
        tstr.testing();
        proj.managementProject();

    }
}
