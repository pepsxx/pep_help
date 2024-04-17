import java.util.ArrayList;
import java.util.List;

public class Main {// Классы могут быть public или Default, но в одном java файле может быть только 1 public

    public static void main(String[] args)  {
        pf_pepLogo();
        pf_pepNote();
        //Thread.sleep(1000);
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
        System.out.println("//Типы данных: //Булевы------------------------------------------------------------------");
        boolean pmb_Boolean = true; // true или false.
        System.out.println("boolean: " + pmb_Boolean);
        //Thread.sleep(1000);
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
        System.out.println("//Типы данных: //Класс - String //Метод - charAt      - символ строки--------------------");
        System.out.println("//Типы данных: //Класс - String //Метод - indexOf     - индекс первого искомого символа--");
        System.out.println("//Типы данных: //Класс - String //Метод - contains    - содержит ли строка подстроку-----");
        System.out.println("//Типы данных: //Класс - String //Метод - substring   - подстрока по индексу-------------");
        System.out.println("//Типы данных: //Класс - String //Метод - replace     - замена символов или части строки-");
        System.out.println("//Типы данных: //Класс - String //Метод - toUpperCase - перевод в заглавные--------------");
        System.out.println("//Типы данных: //Класс - String //Метод - toLowerCase - перевод в строчные---------------");
        System.out.println("Примеры:");
        System.out.println("Длина строки pmSt_String1: " + pmSt_String1.length());
        System.out.println("Сравнение строк pmSt_String1 и pmSt_String2: " + pmSt_String1.equals(pmSt_String2));
        System.out.println("2ой Символ строки pmSt_String1: " + pmSt_String1.charAt(1));
        System.out.println("Индекс символа 'и' в pmSt_String1: " + pmSt_String1.indexOf('и'));
        System.out.println("в pmSt_String2 есть pmSt_String1: " + pmSt_String2.contains(pmSt_String1));
        System.out.println("Часть pmSt_String2 с 5 символа по 7: " + pmSt_String2.substring(5, 8));
        System.out.println("Часть pmSt_String2 с 5 символа до конца: " + pmSt_String2.substring(5));
        System.out.println("Замена Три на Четыре: " + pmSt_String2.replace("Три", "Четыре"));
        System.out.println("Замена 'и' на 'е': " + pmSt_String2.replace('и', 'е'));
        System.out.println("Все в заглавные: " + pmSt_String2.toUpperCase());
        System.out.println("Все в строчные: " + pmSt_String2.toLowerCase());
        System.out.println("//Типы данных: //Класс - String (mutable)------------------------------------------------");
        StringBuilder pmSb_String1 = new StringBuilder("Mutable - Изменяемый класс.");
        System.out.println("pmSb_String1 = " + pmSb_String1);
        pmSb_String1.append(" Добавлен текст, а не создан новый объект с новой ссылкой");
        System.out.println("pmSb_String1 = " + pmSb_String1);
        //Thread.sleep(1000);
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
        //Thread.sleep(1000);
        System.out.println("#########################################################################################");
        System.out.println("//Вывод данных---------------------------------------------------------------------------");
        System.out.print("System.out.print   - Нет перехода на новую строку. ");
        System.out.print("Спец символ \"\\n\" для перехода на новую строчку.\n");
        System.out.println("System.out.println - Есть переход на новую строку.");
        System.out.println("                     Спец символ \"\\t\" для отступа->\t\t<-Продолжение после отступа.");
        System.out.printf("System.out.printf  - Нет перехода на новую строку. но удобно использовать с переменными:\n");
        System.out.printf("%%d: %d, %%f: %f, %%b: %b, %%B: %B, %%c: %c, %%C: %C, %%s: %s, %%S: %S, %%h: %h, %%n: Переход на новую строку %n", pmi_Int, pmf_Float, pmb_Boolean, pmb_Boolean, pmc_Char, pmc_Char, pmSt_String1, pmSt_String1, pmSt_String2);
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
                break;
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

        //Укороченная запись.
        switch (pmy_Bite) {
            case 12, 1, 2 -> System.out.printf("Зима, месяц № %d%n", pmy_Bite);
            case 3, 4, 5 -> System.out.printf("Весна, месяц %d%n", pmy_Bite);
            case 6, 7, 8 -> System.out.printf("Лето, месяц № %d%n", pmy_Bite);
            case 9, 10, 11 -> System.out.printf("Осень, месяц № %d%n", pmy_Bite);
            default -> System.out.printf("Не возможный месяц %d%n", pmy_Bite);
        }

        System.out.println("//Оператор break-------------------------------------------------------------------------");

        while (true) {
            System.out.println("Запущен бесконечный цикл который остановил \"break\"");
            break;
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

        //Thread.sleep(1000);
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

        for (String s : pmMSt_String1) {
            System.out.print(s + " ");
        }

        System.out.println();
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
        System.out.println("//Коллекции - List-----------------------------------------------------------------------");
        System.out.println("//ArrayList удобен, когда нужен быстрый доступ по индексу, а LinkedList - когда важны операции вставки и удаления.");
        System.out.println("////Коллекции - List - ArrayList---------------------------------------------------------");
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
        System.out.println("////Коллекции - List - ArrayList---------------------------------------------------------");
        System.out.println("////Коллекции - List - LinkedList--------------------------------------------------------");
        System.out.println("////Коллекции - List - Vector------------------------------------------------------------");
        System.out.println("////Коллекции - List - Vector - Stack----------------------------------------------------");
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

    public static void pf_pepNote() {
        // Заметки - Начало.
        // v2.4.0.4.1.6.
        System.out.println("""
                /////////////////////////////////////////////////////////////////////////////////////////
                // Ctrl + D             - Создать копию выделенной(х) строки(ок) кода снизу.
                // Ctrl + /             - Закомментировать выделенную(е) строку(и).
                // Ctrl + Shift + /     - Закомментировать выделанный кусок кода.
                // Ctrl + Alt - L       - Выровнять код по стилю.
                // Ctrl + Alt  + Insert - Меню с выбором создания: Класса и др...
                //        Alt  + Insert - Меню с выбором создания: Конструктора, Гетора, Сетора...
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
                // pmxxxxxx - Переменная - Объекта в методе.
                // pgxxxxxx - Переменная - Объекта в классе ("глобальная").
                // psxxxxxx - Переменная - Класса Общая.      (static)
                // PXXXXXXX - Переменная - Неизменная. (final) //Конвенция - Всё большими буквами.
                //
                // Pc_Xxxxx - Класс.                           //Конвенция - С большой буквы.
                // Pi_Xxxxx - Интерфейс.
                // Pe_Xxxxx - Перечисления.
                // Pp_Xxxxx - Пакет.
                // pf_Xxxxx - Функции (мои методы) ничего не возвращает.
                // pfi_Xxxx - Функции (мои методы) возвращает int.
                // po_Xxxxx - Объекты. Кроме: Оберточные, Массивы, Листы.
                // poM_Xxxx - Массив объектов.
                //
                // poEn_Xxx -> Enum.
                // poSb_Xxx -> StringBuilder.
                // poSc_Xxx -> Scanner.
                // poFi_Xxx -> File.
                // poFiOS_X -> FileOutputStream.
                // poFiIS_X -> FileInputStream.
                // poObOS_X -> ObjectOutputStream.
                // poObIS_X -> ObjectInputStream.
                //
                // set_pgi_age - Сетор для переменной pgi_ag. // Лучше создавать средой разработки.
                // get_pgi_age - Гетор для переменной pgi_ag. // Лучше создавать средой разработки.
                // get_Xxxxxxx - Гетор для ещё чего-либо.
                // В методах set и get возможно проще использовать переменную "pgxxxxxx" с "this." вместо "ppxxxxxx".
                //
                // pmс_Xxxx - Переменная примитивная -> char.
                // pmy_Xxxx - Переменная примитивная -> byte.
                // pms_Xxxx - Переменная примитивная -> short.
                // pmi_Xxxx - Переменная примитивная -> int.
                // pml_Xxxx - Переменная примитивная -> long.
                // pmf_Xxxx - Переменная примитивная -> float.
                // pmd_Xxxx - Переменная примитивная -> double.
                // pmb_Xxxx - Переменная примитивная -> boolean.
                //
                // pmDo_Xxx - Переменная - Ссылочная -> Double.
                // pmFl_Xxx - Переменная - Ссылочная -> Float.
                // pmLo_Xxx - Переменная - Ссылочная -> Long.
                // pmIn_Xxx - Переменная - Ссылочная -> Integer.
                // pmSh_Xxx - Переменная - Ссылочная -> Short.
                // pmBy_Xxx - Переменная - Ссылочная -> Byte.
                // pmCh_Xxx - Переменная - Ссылочная -> Character.
                // pmBo_Xxx - Переменная - Ссылочная -> Boolean.
                //
                // pmМi_Xxxx - Масив - Одномерный  -> int.
                // pmМMi_Xxx - Масив - Двумерный   -> int.
                // pmМSt_Xxx - Масив - Одномерный  -> String.
                // pmМMSt_Xx - Масив - Двумерный   -> String.
                // pmLSt_Xx - Лист с -> String.
                // pmLIn_Xx - Лист с -> Intejer.
                // pmLMSt_X - Лист с -> Масив - Одномерный -> String.
                // pmLOb_Xx - Лист с -> Объектами.
                /////////////////////////////////////////////////////////////////////////////////////////
                """);
        // Заметки - Конец.
    }
}

