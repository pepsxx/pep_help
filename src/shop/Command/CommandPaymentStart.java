package shop.Command;

import shop.FiscalRegistrars.FiscalRegistrars;

public class CommandPaymentStart implements Command {

    FiscalRegistrars fiscalRegistrars;

    public CommandPaymentStart(FiscalRegistrars fiscalRegistrars) {
        this.fiscalRegistrars = fiscalRegistrars;
    }

    @Override
    public void execute() {
        fiscalRegistrars.paymentStart();
    }
}
