package Example.T00_Err;

public class Main
{
    public static void main(String[] args) {
        // \u000a // Обработается как знак новой строки.
        // C:\users\alex (Компилятор сначала переводит все символы unicode к их значениям,а после \u не следует шоснацетиричные цифры)
    }
}
