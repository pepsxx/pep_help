package shop.Command;

import shop.FiscalRegistrars.FiscalRegistrars;

public class CommandPaymentCancel implements Command {

    FiscalRegistrars fiscalRegistrars;

    public CommandPaymentCancel(FiscalRegistrars fiscalRegistrars) {
        this.fiscalRegistrars = fiscalRegistrars;
    }

    @Override
    public void execute() {
        fiscalRegistrars.paymentCancel();
    }
}
