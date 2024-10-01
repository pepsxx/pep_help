package suleimanov.design.patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {

        Program[] programs = {
                new ProgramBankSystem(new DeveloperJava()),
                new ProgramStockExchange(new DeveloperCpp())
        };

        for (Program program : programs) {
            program.developProgram();
        }

    }
}
