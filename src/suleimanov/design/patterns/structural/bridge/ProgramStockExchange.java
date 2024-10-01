package suleimanov.design.patterns.structural.bridge;

public class ProgramStockExchange extends Program {

    public ProgramStockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("StockExchange");
        developer.writeCode();
    }
}
