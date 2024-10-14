package shop;

import shop.Command.*;
import shop.FiscalRegistrars.FiscalRegistrars;
import shop.FiscalRegistrars.iml.Atol50F;
import shop.FiscalRegistrars.iml.Poscenter02F;
import shop.FiscalRegistrars.iml.Riteil02F;

import java.util.HashMap;

public class TestService {

    private static volatile TestService testService;

    private TestService() {
    }

    HashMap<String, FiscalRegistrars> mapFiscalRegistrars = new HashMap<>();
    HashMap<String, Command> mapCommandsByFiscalRegistrars = new HashMap<>();

    Command getCommand(String idFiscalRegistrar, String idCommand) {

        String idFiscalRegistrarsAndCommand = idFiscalRegistrar + idCommand;
        Command command = mapCommandsByFiscalRegistrars.get(idFiscalRegistrarsAndCommand);

        if (command == null) {
            FiscalRegistrars fiscalRegistrars = mapFiscalRegistrars.get(idFiscalRegistrar);

            if (fiscalRegistrars == null) {
                fiscalRegistrars = this.createFiscalRegistrar(idFiscalRegistrar);
                mapFiscalRegistrars.put(idFiscalRegistrar, fiscalRegistrars);
            }

            command = this.createCommand(idCommand, fiscalRegistrars);
            mapCommandsByFiscalRegistrars.put(idFiscalRegistrarsAndCommand, command);
        }

        return command;

    }

    FiscalRegistrars createFiscalRegistrar(String idFiscalRegistrars) {
        System.out.println("---------------First FiscalRegistrar---------------");
        return switch (idFiscalRegistrars) {
            case "Atol50F":
                yield Atol50F.getInstance();
            case "Riteil02F":
                yield Riteil02F.getInstance();
            case "Poscenter02F":
                yield Poscenter02F.getInstance();
            default:
                throw new IllegalStateException("Unexpected value: " + idFiscalRegistrars);
        };
    }

    Command createCommand(String idCommand, FiscalRegistrars fiscalRegistrars) {
        System.out.println("---------------First Command---------------");
        return switch (idCommand) {
            case "PaymentStart":
                yield new CommandPaymentStart(fiscalRegistrars);
            case "PaymentCancel":
                yield new CommandPaymentCancel(fiscalRegistrars);
            case "CashDeskClose":
                yield new CommandCashDeskClose(fiscalRegistrars);
            case "CashDeskOpen":
                yield new CommandCashDeskOpen(fiscalRegistrars);
            default:
                throw new IllegalStateException("Unexpected value: " + idCommand);
        };
    }

    public static TestService getInstance() {
        if (testService == null) {
            synchronized (TestService.class) {
                if (testService == null) {
                    testService = new TestService();
                }
            }
        }
        return testService;
    }
}
