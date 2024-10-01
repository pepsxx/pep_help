package suleimanov.design.patterns.structural.bridge;

public class ProgramBankSystem extends Program {

    public ProgramBankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("BankSystem");
        developer.writeCode();
    }
}
