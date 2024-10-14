package shop.Command;

import shop.FiscalRegistrars.FiscalRegistrars;

public class CommandCashDeskClose implements Command {

    FiscalRegistrars fiscalRegistrars;

    public CommandCashDeskClose(FiscalRegistrars fiscalRegistrars) {
        this.fiscalRegistrars = fiscalRegistrars;
    }

    @Override
    public void execute() {
        fiscalRegistrars.cashDeskClose();
    }
}
