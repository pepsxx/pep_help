package shop.FiscalRegistrars.iml;

import shop.FiscalRegistrars.FiscalRegistrars;

public class Atol50F implements FiscalRegistrars {

    private volatile static FiscalRegistrars fiscalRegistrars;

    private final String id = "Atol50F";

    @Override
    public String getId() {
        return id;
    }

    private Atol50F() {
    }

    public static FiscalRegistrars getInstance() {
        if (fiscalRegistrars == null) {
            synchronized (Atol50F.class) {
                if (fiscalRegistrars == null) {
                    fiscalRegistrars = new Atol50F();
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
