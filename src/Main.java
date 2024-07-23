import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.String.join;

public class Main {// Классы могут быть public или Default, но в одном java файле может быть только 1 public

    public static void main(String[] args) throws InterruptedException, IOException {
        pf_pepLogo();
        pf_pepNote();
//        Thread.sleep(1000);
        System.out.println("//Типы данных: Примитивные данные--------------------------------------------------------");
        System.out.println("//Типы данных: //Символьные--------------------------------------------------------------");
        char pmc_Char = 'c';
        System.out.println("Символ:  " + pmc_Char);         //Вывод самого символа.
        System.out.println("Его код: " + (int) (pmc_Char)); //Вывод кода   символа.
        System.out.println("//Типы данных: //Числовые----------------------------------------------------------------");
        System.out.println("//Типы данных: ////Целые-----------------------------------------------------------------");
        byte pmy_Bite = 100;                        // Бит: 8,  Байт: 1, Диапазон: [-128;127], 01111111.
        short pms_Short = 30_000;                   // Бит: 16, Байт: 2, Диапазон: [-32_768;32_767], 01111111_11111111.
        int pmi_Int = 2_000_000_000;                // Бит: 32, Байт: 4, Диапазон: [-2_147_483_648;2_147_483_647], 01111111_11111111_11111111_11111111.
        long pml_Long = 9_000_000_000_000_000_000L; // Бит: 64, Байт: 8, Диапазон: [-9_223_372_036_854_775_808;9_223_372_036_854_775_807], 01111111_11111111_11111111_11111111_11111111_11111111_11111111_11111111.
        System.out.println("byte:  " + pmy_Bite);
        System.out.println("short: " + pms_Short);
        System.out.println("int:   " + pmi_Int);
        System.out.println("long:  " + pml_Long);
        System.out.println("//Типы данных: ////Целые - Варианты записи - Двоичный -----------------------------------");
        pmy_Bite = 0b01111111;                                                                 // Бит: 8,  Байт: 1.
        pms_Short = 0b01111111_11111111;                                                       // Бит: 16, Байт: 2.
        pmi_Int = 0b01111111_11111111_11111111_11111111;                                       // Бит: 32, Байт: 4.
        pml_Long = 0b01111111_11111111_11111111_11111111_11111111_11111111_11111111_11111111L; // Бит: 64, Байт: 8.
        System.out.println("0b - а дальше в двоичном виде");
        System.out.println("pmy_Bite  = 0b01111111                            = " + pmy_Bite);
        System.out.println("pms_Short = 0b01111111_11111111                   = " + pms_Short);
        System.out.println("pmi_Int   = 0b01111111_11111111_11111111_11111111 = " + pmi_Int);
        System.out.println("pml_Long  = 0b01111111_11111111_11...11_11111111L = " + pml_Long);
        System.out.println("//Типы данных: ////Целые - Визуализация -------------------------------------------------");
        byte negativeMin = (byte) 0b1000_0000;
        byte negativeMed = (byte) 0b1100_0000;
        byte negativeMax = (byte) 0b1111_1111;
        System.out.println("negativeMin = 1000_0000 = " + negativeMin);
        System.out.println("negativeMed = 1100_0000 = " + negativeMed);
        System.out.println("negativeMax = 1111_1111 = " + negativeMax);
        byte positiveMin = (byte) 0b0000_0000;
        byte positiveMed = (byte) 0b0100_0000;
        byte positiveMax = (byte) 0b0111_1111;
        System.out.println("negativeMin = 0000_0000 =  " + positiveMin);
        System.out.println("negativeMed = 0100_0000 =  " + positiveMed);
        System.out.println("negativeMax = 0111_1111 =  " + positiveMax);
        System.out.println("//Типы данных: ////Целые - Варианты записи - Восьмеричный ----------------------------");
        pmy_Bite = 01_77;                             // Бит: 8,  Байт: 1.
        pms_Short = 07_77_77;                         // Бит: 16, Байт: 2.
        pmi_Int = 01_77_77_77_77_77;                  // Бит: 32, Байт: 4.
        pml_Long = 07_77_77_77_77_77_77_77_77_77_77L; // Бит: 64, Байт: 8.
        System.out.println("0x - а дальше в восьмеричном виде");
        System.out.println("pmy_Bite  = 01_77                             = " + pmy_Bite);
        System.out.println("pms_Short = 07_77_77                          = " + pms_Short);
        System.out.println("pmi_Int   = 01_77_77_77_77_77                 = " + pmi_Int);
        System.out.println("pml_Long  = 07_77_77_77_77_77_77_77_77_77_77L = " + pml_Long);
        System.out.println("//Типы данных: ////Целые - Варианты записи - Шеснацетиричный ----------------------------");
        pmy_Bite = 0x7F;                              // Бит: 8,  Байт: 1.
        pms_Short = 0x7F_FF;                          // Бит: 16, Байт: 2.
        pmi_Int = 0x7F_FF_FF_FF;                      // Бит: 32, Байт: 4.
        pml_Long = 0x7F_FF_FF_FF_FF_FF_FF_FFL;        // Бит: 64, Байт: 8.
        System.out.println("0x - а дальше в шеснацетиричном виде");
        System.out.println("pmy_Bite  = 0x7F                       = " + pmy_Bite);
        System.out.println("pms_Short = 0x7F_FF                    = " + pms_Short);
        System.out.println("pmi_Int   = 0x7F_FF                    = " + pmi_Int);
        System.out.println("pml_Long  = 0x7F_FF_FF_FF_FF_FF_FF_FFL = " + pml_Long);
        System.out.println("-----------------------------------------------------------------------------------------");
        //Можно задевать несколько переменных одного типа в одной строке.
        int pmi_Int1 = 1, pmi_Int2 = 2, pmi_Int3 = 1;
        System.out.println("pmi_Int1 = " + pmi_Int1);
        System.out.println("pmi_Int2 = " + pmi_Int2);
        System.out.println("pmi_Int3 = " + pmi_Int3);
        System.out.println("//Типы данных: ////Вещественные----------------------------------------------------------");
        float pmf_Float = 1.0F;   // Бит: 32, Байт: 4.
        double pmd_Double = 1.0;  // Бит: 64, Байт: 8 // На конце можно писать D.
        System.out.println("float:   " + pmf_Float / 3);
        System.out.println("double:  " + pmd_Double / 3);
        System.out.println("//Типы данных: ////Вещественные - Варианты записи - Шеснацетиричный----------------------");
        pmd_Double = 0x1.0p-3;
        System.out.println("pmd_Double = 0x1.0p-3 =  (1.0)(p-3) =  1/2^3 = " + pmd_Double);
        pmd_Double = 0x2.0p-3;
        System.out.println("pmd_Double = 0x2.0p-3 =  (2.0)(p-3) =  2/2^3 = " + pmd_Double);
        pmd_Double = 0x3.0p-3;
        System.out.println("pmd_Double = 0x3.0p-3 =  (3.0)(p-3) =  3/2^3 = " + pmd_Double);
        pmd_Double = 0xF.0p-3;
        System.out.println("pmd_Double = 0xF.0p-3 = (15.0)(p-3) = 15/2^3 = " + pmd_Double);
//        Thread.sleep(100000);
        System.out.println("//Типы данных: //Булевы------------------------------------------------------------------");
        boolean pmb_Boolean = true; // true или false.
        System.out.println("boolean: " + pmb_Boolean);
//        Thread.sleep(1000);
        System.out.println("//Типы данных: Ссылочные-----------------------------------------------------------------");
        System.out.println("//Типы данных: //Классы------------------------------------------------------------------");
        System.out.println("//Типы данных: //Класс - String (immutable)----------------------------------------------");
        String pmSt_String1 = "Два";
        System.out.println("pmSt_String1 = " + pmSt_String1 + ". ");
        pmSt_String1 = "Три";
        System.out.println("pmSt_String1 = " + pmSt_String1 + ". Объект не изминился, а создался новый, т.к. immutable");
        String pmSt_String2 = "Один Два Три";
        System.out.println("pmSt_String1: " + pmSt_String1);
        System.out.println("pmSt_String2: " + pmSt_String2);
        System.out.println("//Типы данных: //Класс - String //Метод - length      - длина строки---------------------");
        System.out.println("//Типы данных: //Класс - String //Метод - equals      - сравнение строк------------------");
        System.out.println("//Типы данных: //Класс - String //Метод - equals      - сравнение строк без учета регистра");
        System.out.println("//Типы данных: //Класс - String //Метод - charAt      - символ строки--------------------");
        System.out.println("//Типы данных: //Класс - String //Метод - indexOf     - индекс первого искомого символа--");
        System.out.println("//Типы данных: //Класс - String //Метод - contains    - содержит ли строка подстроку-----");
        System.out.println("//Типы данных: //Класс - String //Метод - substring   - подстрока по индексу-------------");
        System.out.println("//Типы данных: //Класс - String //Метод - replace     - замена символов или части строки-");
        System.out.println("//Типы данных: //Класс - String //Метод - toUpperCase - перевод в заглавные--------------");
        System.out.println("//Типы данных: //Класс - String //Метод - toLowerCase - перевод в строчные---------------");
        System.out.println("//Типы данных: //Класс - String //Метод - compareTo   - лексикографического сравнения строк");
        System.out.println("//Типы данных: //Класс - String //Метод - startsWith  - Проверка, начинается ли строка с");
        System.out.println("//Типы данных: //Класс - String //Метод - endsWith    - Проверка, заканчивается ли строка на");
        System.out.println("//Типы данных: //Класс - String //Метод - trim        - Убирает пробелы по краям");
        System.out.println("//Типы данных: //Класс - String //Метод - join        - Возвращает String все объекты через указанный разделитель");
        System.out.println("Примеры:");
        System.out.println("Длина строки pmSt_String1: " + pmSt_String1.length());
        System.out.println("Сравнение строк pmSt_String1 и pmSt_String2: " + pmSt_String1.equals(pmSt_String2));
        System.out.println("Правильно защищены от null в переменной - \"Test\".equals(pmSt_String2) = " + "Test".equals(pmSt_String2));
        System.out.println("Не правильно                            - pmSt_String2.equals(\"Test\") = " + pmSt_String2.equals("Test"));
        System.out.println("Сравнение строк pmSt_String1 и pmSt_String2 без учета регистра: " + pmSt_String1.equalsIgnoreCase(pmSt_String2));
        System.out.println("2ой Символ строки pmSt_String1: " + pmSt_String1.charAt(1));
        System.out.println("Индекс символа 'и' в pmSt_String1: " + pmSt_String1.indexOf('и'));
        System.out.println("в pmSt_String2 есть pmSt_String1: " + pmSt_String2.contains(pmSt_String1));
        System.out.println("Часть pmSt_String2 с 5 символа по 7: " + pmSt_String2.substring(5, 8));
        System.out.println("Часть pmSt_String2 с 5 символа до конца: " + pmSt_String2.substring(5));
        System.out.println("Замена Три на Четыре: " + pmSt_String2.replace("Три", "Четыре"));
        System.out.println("Замена 'и' на 'е': " + pmSt_String2.replace('и', 'е'));
        System.out.println("Все в заглавные: " + pmSt_String2.toUpperCase());
        System.out.println("Все в строчные: " + pmSt_String2.toLowerCase());
        System.out.println("Лексикографического сравнения строк: " + pmSt_String1.compareTo(pmSt_String2));
        System.out.println("Проверка, начинается ли pmSt_String2 с pmSt_String1: " + pmSt_String2.startsWith(pmSt_String1));
        System.out.println("Проверка, заканчивается ли pmSt_String2 на pmSt_String1: " + pmSt_String2.endsWith(pmSt_String1));
        System.out.println("-->   Qwe   Rty   <--- .trim() -->" + "   Qwe   Rty   ".trim() + "<---");
        String[] pmMSt_String = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        System.out.println("Обеекты - Месяца, Разделитель -=- : " + join(" -=- ", pmMSt_String));
        System.out.println("//Типы данных: //Класс - String (mutable)------------------------------------------------");
        StringBuilder pmSb_String1 = new StringBuilder("Mutable - Изменяемый класс.");
        System.out.println("pmSb_String1 = " + pmSb_String1);
        pmSb_String1.append(" Добавлен текст, а не создан новый объект с новой ссылкой");
        System.out.println("pmSb_String1 = " + pmSb_String1);
//        Thread.sleep(1000);
        System.out.println("//Типы данных: //Класс - String //Метод - append      - Добавление текста----------------");
        System.out.println("//Типы данных: //Класс - String //Метод - reverse     - Перевернуть текст задом на перёд-");
        System.out.println("//Типы данных: //Класс - String //Метод - delete(x,y) - Удаление с индекса x по у--------");
        StringBuilder poSb_s1 = new StringBuilder();
        System.out.println("poSb_s1 = " + poSb_s1);
        System.out.println("poSb_s1.append(\"Техт\") = " + poSb_s1.append("Техт"));
        System.out.println("poSb_s1.reverse() = " + poSb_s1.reverse());
        System.out.println("poSb_s1.delete(2,poSb_s1.length()) = " + poSb_s1.delete(2, poSb_s1.length()));
//        Thread.sleep(10000);
        System.out.println("//Типы данных: //Массивы-----------------------------------------------------------------");
        System.out.println("//Типы данных: //Массивы - Одномерные----------------------------------------------------");
        String[] pmMSt_String1 = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String[] pmMSt_String2 = {"Красный", "Оранжевый", "Жёлтый", "Зелёный", "Синий", "Голубой", "Фиолетовый"};
        String[] pmMSt_String3 = new String[3]; //Три элемента null. // new ключевое слово для выделения памяти.
        pmMSt_String3[0] = "Один";
        pmMSt_String3[1] = "Два";
        pmMSt_String3[2] = "Три";
        // Вывод через for pmMSt_String1[].
        for (int i = 0; i < pmMSt_String1.length; i++) System.out.print(pmMSt_String1[i] + " ");
        System.out.println();
        // Вывод через for each pmMSt_String2[].
        for (String s : pmMSt_String2) System.out.print(s + " ");
        System.out.println();
        System.out.println("//Типы данных: //Массивы - Двумерные-----------------------------------------------------");
        String[][] pmMMSt_MMSrting1 = {{"aa", "bb", "cc"}, {"dd", "ee", "ff"}, {"gg", "hh", "ii"}, {"jj", "kk", "ll"}};
        String[][] pmMMSt_MMSrting2 = {{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",}, pmMSt_String1, pmMSt_String2, {"mm", "nn"}, pmMSt_String3};
        // Вывод через for pmMMSt_MMSrting1[][].
        for (int i = 0; i < pmMMSt_MMSrting1.length; i++) {
            for (int j = 0; j < pmMMSt_MMSrting1[i].length; j++) {
                System.out.print(pmMMSt_MMSrting1[i][j] + " ");
            }
            System.out.println();
        }
        // Вывод через for each pmMMSt_MMSrting2[][].
        for (String[] sm1 : pmMMSt_MMSrting2) {
            for (String s1 : sm1) {
                System.out.print(s1 + " ");
            }
            System.out.println();
        }
//        Thread.sleep(1000);
        System.out.println("#########################################################################################");
        System.out.println("//Вывод данных---------------------------------------------------------------------------");
        System.out.print("System.out.print   - Нет перехода на новую строку. ");
        System.out.print("Спец символ \"\\n\" для перехода на новую строчку.\n");
        System.out.println("System.out.println - Есть переход на новую строку.");
        System.out.println("                     Спец символ \"\\t\" для отступа->\t\t<-Продолжение после отступа.");
        System.out.printf("System.out.printf  - Нет перехода на новую строку. но удобно использовать с переменными:\n");
        System.out.printf("%%d: %d, %%f: %f, %%b: %b, %%B: %B, %%c: %c, %%C: %C, %%s: %s, %%S: %S, %%h: %h, %%n: Переход на новую строку %n", pmi_Int, pmf_Float, pmb_Boolean, pmb_Boolean, pmc_Char, pmc_Char, pmSt_String1, pmSt_String1, pmSt_String2);
//        Thread.sleep(10_000);
        System.out.println("""
                **************************************
                * Интересный вид записи              *
                * Посмотри как он был написан в коде *
                * Так он и выведен на экран          *
                **************************************""");
        System.out.println("#########################################################################################");
        System.out.println("//Операции-------------------------------------------------------------------------------");
        System.out.println("//Операции - Бинарные - [+ - * / %]------------------------------------------------------");
        System.out.printf("%d + %d = %d%n", pmi_Int1, pmi_Int2, (pmi_Int1 + pmi_Int2));
        System.out.printf("%d - %d = %d%n", pmi_Int1, pmi_Int2, (pmi_Int1 - pmi_Int2));
        System.out.printf("%d * %d = %d%n", pmi_Int1, pmi_Int2, (pmi_Int1 * pmi_Int2));
        System.out.printf("%d / %d = %d%n", pmi_Int1, pmi_Int2, (pmi_Int1 / pmi_Int2));
        System.out.printf("%d %% %d = %d%n", pmi_Int1, pmi_Int2, (pmi_Int1 % pmi_Int2));
        System.out.println("//Операции - Унарные - [+= -= *= /= %= ++ --]--------------------------------------------");
        System.out.printf("a было: %d,   b было: %d,   a+=b,   a стало: %d%n", pmi_Int1, pmi_Int2, pmi_Int1 += pmi_Int2);
        System.out.printf("a было: %d,   b было: %d,   a-=b,   a стало: %d%n", pmi_Int1, pmi_Int2, pmi_Int1 -= pmi_Int2);
        System.out.printf("a было: %d,   b было: %d,   a*=b,   a стало: %d%n", pmi_Int1, pmi_Int2, pmi_Int1 *= pmi_Int2);
        System.out.printf("a было: %d,   b было: %d,   a/=b,   a стало: %d%n", pmi_Int1, pmi_Int2, pmi_Int1 /= pmi_Int2);
        System.out.printf("a было: %d,   b было: %d,   a%%=b,   a стало: %d%n", pmi_Int1, pmi_Int2, pmi_Int1 %= pmi_Int2);
        System.out.printf("i было: %d,   ++i,   i стало: %d%n", pmi_Int1++, pmi_Int1);
        System.out.printf("i было: %d,   i++,   i стало: %d%n", pmi_Int1, ++pmi_Int1);
        System.out.printf("i было: %d,   --i,   i стало: %d%n", pmi_Int1--, pmi_Int1);
        System.out.printf("i было: %d,   i--,   i стало: %d%n", pmi_Int1, --pmi_Int1);
        System.out.printf("|%d|%d|%d|%n", pmi_Int1, 100, pmi_Int2);
        System.out.printf("|%5d|%5d|%5d|%n", pmi_Int1, 100, pmi_Int2);
        System.out.printf("|%-5d|%-5d|%-5d|%n", pmi_Int1, 100, pmi_Int2);
        System.out.printf("|%5d|%5d|%5d|%n", 123, 123456, 123456789); //Если не влезает в 5 символов, то расширяется до нужного количества.
        System.out.printf("|%.5f|%.15f|%.25f|%n", Math.PI, Math.PI, Math.PI);
        Thread.sleep(10_000);
        System.out.println("#########################################################################################");
        System.out.println("//Операторы сравнения - [> >= < <= != ==] и Условный оператор if--------------------------");
        pmy_Bite = 5;
        pms_Short = 1;

        pmb_Boolean = pmy_Bite > pms_Short;
        System.out.printf("%d >  %d %b%n", pmy_Bite, pms_Short, pmb_Boolean);
        pmb_Boolean = pmy_Bite >= pms_Short;
        System.out.printf("%d >= %d %b%n", pmy_Bite, pms_Short, pmb_Boolean);
        pmb_Boolean = pmy_Bite < pms_Short;
        System.out.printf("%d <  %d %b%n", pmy_Bite, pms_Short, pmb_Boolean);
        pmb_Boolean = pmy_Bite <= pms_Short;
        System.out.printf("%d <= %d %b%n", pmy_Bite, pms_Short, pmb_Boolean);
        pmb_Boolean = pmy_Bite != pms_Short;
        System.out.printf("%d != %d %b%n", pmy_Bite, pms_Short, pmb_Boolean);
        pmb_Boolean = pmy_Bite == pms_Short;
        System.out.printf("%d == %d %b%n", pmy_Bite, pms_Short, pmb_Boolean);

        System.out.println("-----------------------------------------------------------------------------------------");

        if (pmy_Bite > pms_Short) {
            System.out.printf("%d > %d%n", pmy_Bite, pms_Short);
        } else if (pmy_Bite < pms_Short) {
            System.out.printf("%d < %d%n", pmy_Bite, pms_Short);
        } else {
            System.out.printf("%d = %d%n", pmy_Bite, pms_Short);
        }

        System.out.println("//Логические операции - [&& || !]--------------------------------------------------------");
        pms_Short = 1;

        //Если в фигурных скобочках одна строчка, то их можно не писать.
        if (pms_Short > 0 && pms_Short < 90) System.out.printf("Угол равен: %d Острый%n", pms_Short);
        else if (pms_Short == 90) System.out.printf("Угол равен: %d Прямой%n", pms_Short);
        else if (pms_Short > 90 && pms_Short < 180) System.out.printf("Угол равен: %d Тупой%n", pms_Short);
        else if (pms_Short == 180) System.out.printf("Угол равен: %d Развернутый%n", pms_Short);
        else if (pms_Short > 180 && pms_Short < 360) System.out.printf("Угол равен: %d Выпуклый%n", pms_Short);
        else if (pms_Short == 360) System.out.printf("Угол равен: %d Полный%n", pms_Short);
        else System.out.printf("Угол равен: %d Не корректный%n", pms_Short);

        System.out.println("//Поразрядные операции - [<< >>]---------------------------------------------------------");
        System.out.println(">>  - операция    сохраняет старший бит, для сохранения отрицательного числа");
        System.out.println(">>> - операция не сохраняет старший бит, числа становятся положительными");
        int i0 = 0b0;
        int i1 = 0b1;
        int i2 = 0b11;
        int i3 = 0b111;
        int i4 = 0b1111;
        int i5 = 0b11110;
        int i6 = 0b111100;
        int i7 = 0b1111000;
        int i8 = 0b11110000;
        System.out.println("i0 = 00000000 = " + i0);
        System.out.println("i1 = 00000001 = " + i1);
        System.out.println("i2 = 00000011 = " + i2);
        System.out.println("i3 = 00000111 = " + i3);
        System.out.println("i4 = 00001111 = " + i4);
        System.out.println("i5 = 00011110 = " + i5);
        System.out.println("i6 = 00111100 = " + i6);
        System.out.println("i7 = 01111000 = " + i7);
        System.out.println("i8 = 11110000 = " + i8);
        int ii;
        ii = i4 >> 4;
        System.out.println("ii =  i4 >> 4 = " + ii);
        ii = i4 >> 3;
        System.out.println("ii =  i4 >> 3 = " + ii);
        ii = i4 >> 2;
        System.out.println("ii =  i4 >> 2 = " + ii);
        ii = i4 >> 1;
        System.out.println("ii =  i4 >> 1 = " + ii);
        ii = i4 << 1;
        System.out.println("ii =  i4 << 1 = " + ii);
        ii = i4 << 2;
        System.out.println("ii =  i4 << 2 = " + ii);
        ii = i4 << 3;
        System.out.println("ii =  i4 << 3 = " + ii);
        ii = i4 << 4;
        System.out.println("ii =  i4 << 4 = " + ii);
//        Thread.sleep(10000);

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("pmSt_String1 = " + pmSt_String1);
        System.out.println("pmSt_String2 = " + pmSt_String2);

        //Строки надо сравнивать с помощью метода equals.
        if (pmSt_String1.equals(pmSt_String2)) System.out.println("Строки совпадают");
        else System.out.println("Строки не совпадают");

        //Thread.sleep(1000);
        System.out.println("//Оператор выбора switch-----------------------------------------------------------------");
        pmy_Bite = 13;

        //int short byte char String.
        //Полная запись запись.
        switch (pmy_Bite) {
            case 12:
            case 1:
            case 2:
                System.out.printf("Зима, месяц № %d%n", pmy_Bite);
                break; // Если break не написать, то выполнится и следующий блок (System.out.printf("Весна, месяц %d%n", pmy_Bite);).
            case 3:
            case 4:
            case 5:
                System.out.printf("Весна, месяц %d%n", pmy_Bite);
                break;
            case 6:
            case 7:
            case 8:
                System.out.printf("Лето, месяц № %d%n", pmy_Bite);
                break;
            case 9:
            case 10:
            case 11:
                System.out.printf("Осень, месяц № %d%n", pmy_Bite);
                break;
            default:
                System.out.printf("Не возможный месяц %d%n", pmy_Bite);
        }

        //Лямбда запись.
        switch (pmy_Bite) {
            case 12, 1, 2 -> System.out.printf("Зима, месяц № %d%n", pmy_Bite);
            case 3, 4, 5 -> System.out.printf("Весна, месяц %d%n", pmy_Bite);
            case 6, 7, 8 -> System.out.printf("Лето, месяц № %d%n", pmy_Bite);
            case 9, 10, 11 -> System.out.printf("Осень, месяц № %d%n", pmy_Bite);
            default -> System.out.printf("Не возможный месяц %d%n", pmy_Bite);
        }
        //Лямбда запись - Присваивание.
        pmSt_String1 = switch (pmy_Bite) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Не возможный месяц";
        };
        System.out.println("pmSt_String1 = " + pmSt_String1);
//        Thread.sleep(10_000);

        System.out.println("//Оператор break-------------------------------------------------------------------------");

        while (true) {
            System.out.println("Запущен бесконечный цикл который остановил \"break\"");
            break;
        }

        System.out.println("for c двумя инкрементами");
        ii = 10;
        for (int i = 0; i < 5; i++, ii++) {
            System.out.println("i = " + i + "    ii = " + ii);
        }


        System.out.println("break во внутреннем цикле по j = 2");
        for (int i = 0; i < 5; i++) {
            System.out.printf("i=%d j=", i);
            for (int j = 0; j < 5; j++) {
                if (j == 2) break;
                System.out.print(" " + j);
            }
            System.out.println();
        }

        System.out.println("break во внутреннем цикле по i = 2");
        for (int i = 0; i < 5; i++) {
            System.out.printf("i=%d j=", i);
            for (int j = 0; j < 5; j++) {
                if (i == 2) break;
                System.out.print(" " + j);
            }
            System.out.println();
        }

        System.out.println("break по метке во внутреннем цикле по i = 2 выход из внешнего цикла по метке");
        metka:
        for (int i = 0; i < 5; i++) {
            System.out.printf("i=%d j=", i);
            for (int j = 0; j < 5; j++) {
                if (i == 2) break metka;
                System.out.print(" " + j);
            }
            System.out.println();
        }
        System.out.println();

        int pmi_Int4 = 44;
        System.out.println("pmi_Int = " + pmi_Int1 + " > " + pmi_Int2 + " ? " + pmi_Int3 + " : " + pmi_Int4);
        pmi_Int = pmi_Int1 > pmi_Int2 ? pmi_Int3 : pmi_Int4;
        // pmi_Int1 > pmi_Int2
        // 1. если true  то справа от ":"
        // 2. если false то слева  от ":"
        System.out.println("pmi_Int = " + pmi_Int);

        //Thread.sleep(10000);
        System.out.println("//Оператор continue----------------------------------------------------------------------");

        for (int pmi_i = 1; pmi_i < 15; pmi_i++) {
            if (pmi_i % 2 == 0) continue;
            System.out.printf("%d - Это не четное число%n", pmi_i);
        }

        System.out.println("#########################################################################################");
        System.out.println("//Циклы----------------------------------------------------------------------------------");
        System.out.println("//Цикл - for-----------------------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (; ; ) { // В for параметры могут быть пустыми.
            System.out.println("pmy_Bite = " + pmy_Bite);
            pmy_Bite--;
            if (pmy_Bite < 1) break;
        }

        System.out.println();

        for (int i = 'a'; i < 'z'; i++) { // Можно итерироваться по символам
            System.out.print((char) i + " ");
        }

        System.out.println();

        for (String s : pmMSt_String1) {
            System.out.print(s + " ");
        }

        System.out.println();

//        Thread.sleep(10_000);
        System.out.println("//Цикл - while---------------------------------------------------------------------------");

        while (pmb_Boolean) {
            System.out.println("while - Первый вариант");
            pmb_Boolean = false;
        }

        while (!pmb_Boolean) {
            System.out.println("while - Второй вариант");
            pmb_Boolean = true;
        }

        int wd = 10;
        while (wd < 10) {
            System.out.println("   wile сначала проверяю условие потом делаю тело цикла");
            wd++;
        }

        System.out.println("//Цикл - do while------------------------------------------------------------------------");

        int dw = 10;
        do {
            System.out.println("do wile сначала делаю тело цикла потом проверяю условие");
            System.out.println("do wile гарантирует однократное выполнение");
            dw++;
        } while (dw < 10);

        System.out.println("#########################################################################################");
        System.out.println("//Другое - Math (класс математических действий)------------------------------------------");
        System.out.printf("Наименьшее число из [%d], [%d] это %d %n", pmi_Int1, pmi_Int2, Math.min(pmi_Int1, pmi_Int2));
        System.out.printf("Наибольшее число из [%d], [%d] это %d %n", pmi_Int1, pmi_Int2, Math.max(pmi_Int1, pmi_Int2));
        System.out.printf("[%d] в степени [%d] это %f %n", pmi_Int1, pmi_Int2, Math.pow(pmi_Int1, pmi_Int2));
        System.out.printf("Число Пи равно %f %n", Math.PI);

        System.out.println("#########################################################################################");
        System.out.println("//Collection ----------------------------------------------------------------------------");
        System.out.println("////Collection - List-----------------------------------------------------------------------");
        System.out.println("////ArrayList удобен, когда нужен быстрый доступ по индексу, а LinkedList - когда важны операции вставки и удаления.");
        System.out.println("//////Collection - List - ArrayList---------------------------------------------------------");
        List<Integer> pmLIn_Integer = List.of(0, (int) pms_Short, pmi_Int, 12345);
        List<String> pmLSt_String = List.of(String.valueOf(pmc_Char), pmSt_String1, pmSt_String2, "qwerty");
        System.out.printf("Элемент Листа с индексом %d это: %d%n", 2, pmLIn_Integer.get(2));
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Если в List (Integer или String) изменить значения, то они не изменятся в переменной и на оборот т.к. они immutable");
        String a1 = "aa";
        String b1 = "bb";
        String c1 = "cc";
        List<String> pplist1 = new ArrayList<>();
        pplist1.add(a1);
        pplist1.add(b1);
        pplist1.add(c1);
        System.out.printf("Переменные String равны  a1=%s, b1=%s, c1=%s%n", a1, b1, c1);
        System.out.printf("Проверяем значения List  a1=%s, b1=%s, c1=%s%n", pplist1.get(0), pplist1.get(1), pplist1.get(2));
        a1 = "xx";
        pplist1.set(1, "yy");
        System.out.printf("Задаем a1 = \"xx\", и  pplist1.set(1, \"yy\")\n");
        System.out.printf("Переменные String равны  a1=%s, b1=%s, c1=%s%n", a1, b1, c1);
        System.out.printf("Проверяем значения List  a1=%s, b1=%s, c1=%s%n", pplist1.get(0), pplist1.get(1), pplist1.get(2));
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Если изменить значения переменной StringBuilder, то изменятся в листе т.к. StringBuilder mutable");
        StringBuilder a1_sb = new StringBuilder("aa");
        StringBuilder b1_sb = new StringBuilder("bb");
        StringBuilder c1_sb = new StringBuilder("cc");
        List<StringBuilder> pplist1_sb = List.of(a1_sb, b1_sb, c1_sb);
        System.out.printf("Переменные StringBuilder равны   a1_sb=%s, b1_sb=%s, c1_sb=%s%n", a1_sb, b1_sb, c1_sb);
        System.out.printf("Проверяем значения листа         a1_sb=%s, b1_sb=%s, c1_sb=%s%n", pplist1_sb.get(0), pplist1_sb.get(1), pplist1_sb.get(2));
        a1_sb.append("xxx");
        System.out.println("Добавляем к a1_sb = \"aaa\"");
        System.out.printf("Переменные StringBuilder равны   a1_sb=%s, b1_sb=%s, c1_sb=%s%n", a1_sb, b1_sb, c1_sb);
        System.out.printf("Проверяем значения листа         a1_sb=%s, b1_sb=%s, c1_sb=%s%n", pplist1_sb.get(0), pplist1_sb.get(1), pplist1_sb.get(2));

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Если в List (Integer[] или String[]) изменить значения, то они изменятся в переменной и на оборот т.к. они mutable");
        String[] a2 = {"aaa"};
        String[] b2 = {"bbb"};
        String[] c2 = {"ccc"};
        List<String[]> pplist2 = List.of(a2, b2, c2);
        System.out.printf("Переменные String[] равны a2=%s, b2=%s, c2=%s%n", a2[0], b2[0], c2[0]);
        System.out.printf("Проверяем значения листа  a2=%s, b2=%s, c2=%s%n", pplist2.get(0)[0], pplist2.get(1)[0], pplist2.get(2)[0]);
        b2[0] = "bBb";
        System.out.printf("Задаем b2[0] = \"bBb\",             и запрашиваем значения. Они изменились:%n");
        System.out.printf("Переменные String[] равны a2=%s, b2=%s, c2=%s%n", a2[0], b2[0], c2[0]);
        System.out.printf("Проверяем значения листа  a2=%s, b2=%s, c2=%s%n", pplist2.get(0)[0], pplist2.get(1)[0], pplist2.get(2)[0]);
        pplist2.get(2)[0] = "cCc";
        System.out.printf("Задаем pplist2.get(0)[0] = \"cCc\", и запрашиваем значения. Они изменились:%n");
        System.out.printf("Переменные String[] равны a2=%s, b2=%s, c2=%s%n", a2[0], b2[0], c2[0]);
        System.out.printf("Проверяем значения листа  a2=%s, b2=%s, c2=%s%n", pplist2.get(0)[0], pplist2.get(1)[0], pplist2.get(2)[0]);
        //Thread.sleep(1000);
        System.out.println("//////Collection - List - LinkedList-----------------------------------------------------");
        System.out.println("//////Collection - List - Vector (Устарел)-----------------------------------------------");
        System.out.println("//////Collection - List - Vector - Stack-------------------------------------------------");
        System.out.println("////Collection - Map---------------------------------------------------------------------");
        System.out.println("////Collection - Set---------------------------------------------------------------------");
        System.out.println("////Collection - Queue-------------------------------------------------------------------");
        System.out.println("#########################################################################################");
        System.out.println("//Object - Методы для всех классов-------------------------------------------------------");
        Object poOb_object1 = new Object();
        Object poOb_object2 = new Object();
        System.out.println("//Object - equals - сравнение объектов---------------------------------------------------");
        System.out.println("//Object - hashCode - Хеш код объекта----------------------------------------------------");
        System.out.println("//Object - toString - Получение String от объекта (по умолчинию ссылка)------------------");
        System.out.println("//Object - getClass - Получение класса к которому относиться объект----------------------");
        System.out.println("poOb_object1.equals(poOb_object2) = " + poOb_object1.equals(poOb_object2));
        System.out.println("poOb_object1.hashCode() = " + poOb_object1.hashCode());
        System.out.println("poOb_object1.toString() = " + poOb_object1.toString());

        System.out.println("poOb_object1.getClass() = " + poOb_object1.getClass());
        System.out.println("#########################################################################################");
        System.out.println("//Random - Методы для всех классов-------------------------------------------------------");
        Random po_random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print("po_random.nextInt(10) = " + po_random.nextInt(30, 60)); // Старый вариант.
            System.out.println(" ThreadLocalRandom.current().nextInt(10) = " + ThreadLocalRandom.current().nextInt(60, 90));  // Новый вариант.
        }
        System.out.println("#########################################################################################");
        System.out.println("//File-----------------------------------------------------------------------------------");
        String fs = File.separator;
        File dir = new File("resources");
        System.out.println("dir.exists()            = " + dir.exists());
        System.out.println("dir.mkdir()             = " + dir.mkdir());
        System.out.println("dir.isDirectory()       = " + dir.isDirectory());
        System.out.println("dir.isFile()            = " + dir.isFile());
        System.out.println("dir.getParent()         = " + dir.getParent());
        System.out.println("dir.getAbsolutePath()   = " + dir.getAbsolutePath());
        File file1 = new File(dir.getName() + fs + "File1.txt");
        File file2 = Path.of(dir.getName(), "File2.txt").toFile(); // Более современный вариант (не требует сепаратора).
        System.out.println("file1.exists()          = " + file1.exists());
        System.out.println("file2.createNewFile()   = " + file2.createNewFile());
        System.out.println("file1.createNewFile()   = " + file1.createNewFile());
        System.out.println("file1.isDirectory()     = " + file1.isDirectory());
        System.out.println("file1.isFile()          = " + file1.isFile());
        System.out.println("file1.getParent()       = " + file1.getParent());
        System.out.println("file1.getAbsolutePath() = " + file1.getAbsolutePath());
        System.out.println("//FileInputStream------------------------------------------------------------------------");
        try (FileInputStream fis = new FileInputStream(file1)) {
            byte[] bytes = fis.readAllBytes();
            String string = new String(bytes);
            System.out.println("string:\n" + string);
        }
        System.out.println("//BufferedReader & FileReader------------------------------------------------------------");
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String collect = br.lines()
                    .collect(Collectors.joining("\n"));
            System.out.println("collect:\n" + collect);
        }
        System.out.println("//FileOutputStream-----------------------------------------------------------------------");
        try (FileOutputStream fos = new FileOutputStream(file2, true)) { // true - добавлять, false - перезаписывать
            fos.write(("TestLine1" + System.lineSeparator()).getBytes());       // System.lineSeparator() - перевод на новую строку в разных ОС.
        }
        System.out.println("//BufferedWriter & FileWriter------------------------------------------------------------");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file2, true))) {
            bw.append("TestLine2");
            bw.newLine(); // Перевод на новую строку в разных ОС.
        }
        System.out.println("//Files----------------------------------------------------------------------------------");
        System.out.println("//Files - Input--------------------------------------------------------------------------");
        Path path1 = Path.of(dir.getName(), "File1.txt");
        try (Stream<String> lines = Files.lines(path1)) {
            lines.forEach(System.out::println);
        }
        System.out.println("//Files - Output-------------------------------------------------------------------------");
        Path path2 = Path.of(dir.getName(), "File2.txt");
        Files.writeString(path2, "TestLine3\n", StandardOpenOption.APPEND);
        System.out.println("//ZonedDateTime--------------------------------------------------------------------------");
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime.toEpochSecond()              = " + zonedDateTime.toEpochSecond());
        System.out.println("zonedDateTime.toInstant().toEpochMilli()   = " + zonedDateTime.toInstant().toEpochMilli());
        System.out.println("zonedDateTime.truncatedTo(ChronoUnit.DAYS) = " + zonedDateTime.truncatedTo(ChronoUnit.DAYS));
        System.out.println("LocalDateTime.now()               = " + LocalDateTime.now());
        System.out.println("LocalDateTime.now()               = " + LocalDateTime.now(ZoneOffset.UTC));
        System.out.println("LocalDateTime.now().toLocalDate() = " + LocalDateTime.now().toLocalDate());
        System.out.println("LocalDateTime.now().toLocalTime() = " + LocalDateTime.now().toLocalTime());
        System.out.println("LocalDate.now()                   = " + LocalDate.now());
        System.out.println("LocalDate.now(ZoneOffset.UTC)     = " + LocalDate.now(ZoneOffset.UTC));
        System.out.println("LocalTime.now()                   = " + LocalTime.now());
        System.out.println("LocalTime.now(ZoneOffset.UTC)     = " + LocalTime.now(ZoneOffset.UTC));
        System.out.println("zonedDateTime                 = " + zonedDateTime);
        System.out.println("zonedDateTime.plusSeconds(1)  = " + zonedDateTime.plusSeconds(1));
        System.out.println("zonedDateTime.plusMinutes(1)  = " + zonedDateTime.plusMinutes(1));
        System.out.println("zonedDateTime.plusHours(1)    = " + zonedDateTime.plusHours(1));
        System.out.println("zonedDateTime.plusDays(1)     = " + zonedDateTime.plusDays(1));
        System.out.println("zonedDateTime.plusWeeks(1)    = " + zonedDateTime.plusWeeks(1));
        System.out.println("zonedDateTime.plusMonths(1)   = " + zonedDateTime.plusMonths(1));
        System.out.println("zonedDateTime.plusYears(1)    = " + zonedDateTime.plusYears(1));
        System.out.println("zonedDateTime.getSecond()     = " + zonedDateTime.getSecond());
        System.out.println("zonedDateTime.getMinute()     = " + zonedDateTime.getMinute());
        System.out.println("zonedDateTime.getHour()       = " + zonedDateTime.getHour());
        System.out.println("zonedDateTime.getDayOfMonth() = " + zonedDateTime.getDayOfMonth());
        System.out.println("zonedDateTime.getDayOfWeek()  = " + zonedDateTime.getDayOfWeek());
        System.out.println("zonedDateTime.getDayOfYear()  = " + zonedDateTime.getDayOfYear());
        System.out.println("zonedDateTime.getMonth()      = " + zonedDateTime.getMonth());
        System.out.println("zonedDateTime.getMonthValue() = " + zonedDateTime.getMonthValue());
        System.out.println("zonedDateTime.getYear()       = " + zonedDateTime.getYear());
        System.out.println("zonedDateTime.getZone()       = " + zonedDateTime.getZone());
        System.out.println("zonedDateTime.getOffset()     = " + zonedDateTime.getOffset());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("   DateTimeFormatter dateTimeFormatter  = DateTimeFormatter.ofPattern(\"dd.MM.yyyy\")");
        System.out.println("zonedDateTime.format(dateTimeFormatter) = " + zonedDateTime.format(dateTimeFormatter));
        System.out.println("#########################################################################################");
    }

    public static void pf_pepLogo() {
        // Logo - Начало.
        // v2.4.0.4.1.3.
        System.out.println("""
                -----------------------------------------------------------------------------
                -                                              $$                           -
                - $$$$$$$$     $$$$$$   $$$$$$$$            $$$$$$$$  $$$$  $$$$ $$$$  $$$$ -
                - $$$$$$$$$   $$$$$$$$  $$$$$$$$$          $$$$$$$$$$ $$$$  $$$$ $$$$  $$$$ -
                - $$$$  $$$$ $$$$  $$$$ $$$$  $$$$         $$$$   $$$  $$$  $$$   $$$  $$$  -
                - $$$$  $$$$ $$$$  $$$$ $$$$  $$$$         $$$$         $$$$$$     $$$$$$   -
                - $$$$$$$$$  $$$$$$$$$$ $$$$$$$$$          $$$$$$$$$     $$$$       $$$$    -
                - $$$$$$$$   $$$$$$$$$$ $$$$$$$$            $$$$$$$$$    $$$$       $$$$    -
                - $$$$       $$$$       $$$$                     $$$$   $$$$$$     $$$$$$   -
                - $$$$       $$$$  $$$$ $$$$               $$$   $$$$  $$$  $$$   $$$  $$$  -
                - $$$$        $$$$$$$$  $$$$     $$$$$$$$  $$$$$$$$$$ $$$$  $$$$ $$$$  $$$$ -
                - $$$$          $$$$    $$$$     $$$$$$$$   $$$$$$$$  $$$$  $$$$ $$$$  $$$$ -
                -                                              $$                           -
                -----------------------------------------------------------------------------
                """);
        // Logo - Конец.
    }

    private static void pf_pepNote() {
        // Заметки - Начало.
        // V2.4.0.7.2.3.

        // Заметки - Конец.
        System.out.println("""
                /////////////////////////////////////////////////////////////////////////////////////////
                // Ctrl + D             - Создать копию выделенной(х) строки(ок) кода снизу.
                // Ctrl + /             - Закомментировать выделенную(е) строку(и).
                // Ctrl + P             - Показать все перегрузки конструктора.
                // Ctrl + H             - Показать иерархию Класса, Интерфейса,...
                // Ctrl + Shift + /     - Закомментировать выделанный кусок кода.
                // Ctrl + Shift + Вверх - Переместить блок (метод) вверх над другим блоком (методом).
                // Ctrl + Alt - V       - Создать переменную из значения.
                // Ctrl + Alt - C       - Создать константу.
                // Ctrl + Alt - N       - Прописать значение вместо переменной.
                // Ctrl + Alt - L       - Выровнять код по стилю.
                // Ctrl + Alt - T       - Добавить if, while, try, synchronized.
                // Ctrl + Alt - P       - Переместить переменную в параметры метода.   
                // Ctrl + Alt - M       - Убрать блок в метод.   
                // Ctrl + Alt - F       - Сделать переменную полем класса.   
                // Ctrl + Alt - B       - Перейти к месту декларации переменной.   
                // Ctrl + Alt  + Insert - Меню с выбором создания: Класса и др...
                //        Alt  + Insert - Меню с выбором создания: Конструктора, Гетора, Сетора...
                // Alt + Shift + Insert - Включение/выключение режима одновременного редактирование нескольких сторк.
                // Shift + F10          - Запустить код.");
                // psvm - Создать метод main
                // sout - Создать метод System.out.println();
                /////////////////////////////////////////////////////////////////////////////////////////
                // (public, protected, default, private)
                //// "public"    - Переменную можно будет задавать на прямую, следовательно, можно задать не корректное число (неправильно небезопасно).
                //// "protected" - Доступ к переменной в пределах пакета (папки) и из классов родителей.
                //// "default"   - Доступ к переменной в пределах пакета (папки).
                //// "private"   - Переменную можно будет поменять только через метод (правильно безопасно).
                // "static"      - Это переменная не объекта, а класса и поэтому при её смене она меняется сразу у всех объектов.
                // "final"       - Переменная которую нельзя менять (ПРИНЯТО ПИСАТЬ ИМЯ БОЛЬШИМИ БУКВАМИ).
                // pmxxxxxxx - Переменная - Объекта в методе.
                // pgxxxxxxx - Переменная - Объекта в классе ("глобальная").
                // psxxxxxxx - Переменная - Класса Общая.      (static)
                // PXXXXXXXx - Переменная - Неизменная. (final) //Конвенция - Всё большими буквами.
                //
                // Pc_Xxxxxx - Класс.                           //Конвенция - С большой буквы.
                // Pi_Xxxxxx - Интерфейс.
                // Pe_Xxxxxx - Перечисления.
                // Pp_Xxxxxx - Пакет.
                // Pa_Xxxxxx - Аннотация.
                // pf_Xxxxxx - Функции (мои методы) ничего не возвращает.
                // pfi_Xxxxx - Функции (мои методы) возвращает int.
                // po_Xxxxxx - Объекты. Кроме: Оберточные, Массивы.
                //
                // poEn_Xxxx -> Enum.
                // poSb_Xxxx -> StringBuilder.
                // poSc_Xxxx -> Scanner.
                // poFi_Xxxx -> File.
                // poFiOS_Xx -> FileOutputStream.
                // poFiIS_Xx -> FileInputStream.
                // poObOS_Xx -> ObjectOutputStream.
                // poObIS_Xx -> ObjectInputStream.
                // poTh_Xxxx -> Thread.
                // poRa_Xxxx -> Random.
                //
                // poLi_Xxxx - List. (ArrayList, LinkedList).
                // poSt_Xxxx - List - Vector - Stack.
                // poSe_Xxxx - Set. (HashSet, LinkedHashSet, TreeSet).
                // poMa_Xxxx - Map. (HashMap, LinkedHashMap, TreeMap).
                // poQu_Xxxx - Queue.
                //
                // set_pgi_age - Сетор для переменной pgi_ag. // Лучше создавать средой разработки.
                // get_pgi_age - Гетор для переменной pgi_ag. // Лучше создавать средой разработки.
                // get_Xxxxxxx - Гетор для ещё чего-либо.
                // В методах set и get возможно проще использовать переменную "pgxxxxxx" с "this." вместо "ppxxxxxx".
                //
                // pmс_Xxxxx - Переменная примитивная -> char.
                // pmy_Xxxxx - Переменная примитивная -> byte.
                // pms_Xxxxx - Переменная примитивная -> short.
                // pmi_Xxxxx - Переменная примитивная -> int.
                // poLi_Xxxxx - Переменная примитивная -> long.
                // pmf_Xxxxx - Переменная примитивная -> float.
                // pmd_Xxxxx - Переменная примитивная -> double.
                // pmb_Xxxxx - Переменная примитивная -> boolean.
                //
                // pmDo_Xxxx - Переменная - Ссылочная -> Double.
                // pmFl_Xxxx - Переменная - Ссылочная -> Float.
                // pmLo_Xxxx - Переменная - Ссылочная -> Long.
                // pmIn_Xxxx - Переменная - Ссылочная -> Integer.
                // pmSh_Xxxx - Переменная - Ссылочная -> Short.
                // pmBy_Xxxx - Переменная - Ссылочная -> Byte.
                // pmCh_Xxxx - Переменная - Ссылочная -> Character.
                // pmBo_Xxxx - Переменная - Ссылочная -> Boolean.
                //
                // pmМi_Xxxxx - Масив - Одномерный  -> int.
                // pmМMi_Xxxx - Масив - Двумерный   -> int.
                // pmМSt_Xxxx - Масив - Одномерный  -> String.
                // pmМMSt_Xxx - Масив - Двумерный   -> String.
                /////////////////////////////////////////////////////////////////////////////////////////
                //
                // sysdm.cpl         -> Дополнительно -> Переменные среды -> Создать
                // IntelliJ IDEA     -> C:\\Program Files\\JetBrains\\IntelliJIdea2023.3
                //
                // sysdm.cpl         -> Дополнительно -> Переменные среды -> Path -> Изменить
                // java path example -> C:\\Program Files\\Java\\jdk-17\\bin
                // mvn path example  -> %IntelliJ IDEA%\\plugins\\maven\\lib\\maven3\\bin
                //
                // cmd:
                // java  -version    -> java version "17.0.7" 2023-04-18 LTS...
                // javac -version    -> javac 17.0.7
                // mvn   -version    -> Apache Maven 3.9.5 (57804ffe001d7215b5e7bcb531cf83df38f93546)...
                /////////////////////////////////////////////////////////////////////////////////////////
                //
                // entry      - Запись
                // entity     - Сущность
                // exsecution - Исполнение
                // isEmpty    - Пусто
                // instance   - Экземпляр
                // invoke     - Вызывать
                // forEach    - Для Каждого
                // field      - Поле
                // peek       - Заглянуть
                /////////////////////////////////////////////////////////////////////////////////////////
                //
                // CRUD - Create Read Update Delete 
                // DAO  - Data Access Object (in Hibernate)
                // DSL  - Domain Specific Language (in Grable 2007)
                // DTO  - Data Transfer Object (in Hibernate)
                // ORM  - Object Relational Mapping (Hibernate, JOOQ, MyBatis)
                // POM  - Project Object Model (in Maven 2002)
                /////////////////////////////////////////////////////////////////////////////////////////
                //
                // SQL     - JAVA
                // bigint  - Long
                // numeric - Double
                // numeric - BigDecimal (для денег)
                // varchar - String
                /////////////////////////////////////////////////////////////////////////////////////////
                //
                //         Стандартные   - Потокобезопасные
                // List
                //       - ArrayList     - CopyOnWriteArrayList
                //       - LinkedList    -
                //
                // Queue - Queue         - BlockingQueue - ConcurrentLinkedQueue - ArrayBlockingQueue
                // Deque - Deque         - BlockingDeque - ConcurrentLinkedDeque
                //
                // Set                   
                // 	     - HashSet       - CopyOnWriteArraySet
                // 	     - LinkedHashSet - -
                //       - TreeSet       - ConcurrentSkipListSet
                //	 
                // Map                  
                //       - HashMap       - ConcurrentHashMap 
                //       - LinkedHashMap - -
                //       - TreeMap       - ConcurrentSkipListMap
                /////////////////////////////////////////////////////////////////////////////////////////
                """);
    }
}

