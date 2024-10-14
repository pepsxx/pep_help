package shop.FiscalRegistrars.iml;

import shop.FiscalRegistrars.FiscalRegistrars;

public class Riteil02F implements FiscalRegistrars {

    volatile static FiscalRegistrars fiscalRegistrars;

    private final String id = "Riteil02F";

    @Override
    public String getId() {
        return id;
    }

    private Riteil02F() {
    }

    public static FiscalRegistrars getInstance() {
        if (fiscalRegistrars == null) {
            synchronized (Riteil02F.class) {
                if (fiscalRegistrars == null) {
                    fiscalRegistrars = new Riteil02F();
                }
            }
        }
        return fiscalRegistrars;
    }

    @Override
    public void paymentStart() {
        System.out.println(id + " Старт оплаты");
    }

    @Override
    public void paymentCancel() {
        System.out.println(id + " Отмена оплаты");
    }

    @Override
    public void cashDeskClose() {
        System.out.println(id + " Закрытие кассы");
    }

    @Override
    public void cashDeskOpen() {
        System.out.println(id + " Открытие кассы");
    }
}
