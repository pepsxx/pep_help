package shop;


import shop.Command.Command;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Command command;
        TestService testService = TestService.getInstance();
        String idFiscalRegistrar = "";
        String idCommand = "";

        System.out.println("Старт магазина");
        System.out.println("-------------------------");

        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int j = 0; j < 1_000; j++) {

            idFiscalRegistrar = switch (random.nextInt(1, 5)) {
                case 1 -> "Atol50F";
                case 2 -> "Riteil02F";
                case 3 -> "Poscenter02F";
                case 4 -> "Atol50F";
                default -> idFiscalRegistrar;
            };

            idCommand = switch (random.nextInt(1, 5)) {
                case 1 -> "CashDeskOpen";
                case 2 -> "PaymentStart";
                case 3 -> "PaymentCancel";
                case 4 -> "CashDeskClose";
                default -> idCommand;
            };

            // Получение команд для выполнения и выполнение
            command = testService.getCommand(idFiscalRegistrar, idCommand);
            command.execute();
            Thread.sleep(1_000);
        }


        System.out.println("-------------------------");
        System.out.println("Остановка магазина");

    }
}
