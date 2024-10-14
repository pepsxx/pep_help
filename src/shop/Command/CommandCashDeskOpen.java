package shop.Command;

import shop.FiscalRegistrars.FiscalRegistrars;

public class CommandCashDeskOpen implements Command {

    FiscalRegistrars fiscalRegistrars;

    public CommandCashDeskOpen(FiscalRegistrars fiscalRegistrars) {
        this.fiscalRegistrars = fiscalRegistrars;
    }

    @Override
    public void execute() {
        fiscalRegistrars.cashDeskOpen();
    }
}
