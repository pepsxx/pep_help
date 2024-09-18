package example.c1_java_jdk_jvm_jit;

public class Main {
    public static void main(String[] args) {
        System.out.printf("""
                JDK - Java Development Kit     - Комплект разработки на Java
                JRE - Java Runtime Environment - Среда времени выполнения Java
                JVM - Java Virtual Machine     - Виртуальная машина Java
                JIT - Just-in-time compilation
                
                JDK - 
                    - JAVAC     Компилятор.
                    - Library   Стандартные библиотеки классов Java.
                    - Examples  Примеры.
                    - Doc       Документация.
                    - Utility   Утилиты (   javap   - декомпилятор в байт-код.
                                            jmap    - Выведет дамп памяти                     по Java-процессу
                                            jinfo   - Выведет много-много полезной информации по Java-процессу.
                                            jstack  - выведет дамп всех потоков               по Java-процессу.
                                            jps     - Выведет список только Java-процессов.
                                                    -   4192 Jps
                                                        3156 Launcher
                                                        4788 Launcher
                                                        10616 PepAstonApplication
                                                        13004 Main
                                            jcmd    - В новейших релизах JDK она заменяет старые утилиты, которые считаются устаревшими.
                                            javaagent   - это «агенты», написанные на Java. Подключаются к приложению при старте с помощью параметра.
                                                        - Пример: "-javaagent:C:\\Program Files\\JetBrains\\IntelliJIdea2024.2\\lib\\idea_rt.jar=51310:C:\\Program Files\\JetBrains\\IntelliJIdea2024.2\\bin"
                                            ).
                    - JRE   - 
                            - Library   Стандартный набор библиотек классов Java
                            - JVM   - Загрузчик Java-классов.
                                    - Интерпретатор байт-кода.
                                    - Несколько сборщиков мусора.
                                    - Набор вспомогательных библиотек времени выполнения.
                                    - JIT   - 
                                            - Не весь код сразу компилируется в машинный, а только необходимая часть
                                            
                Test.java -> JAVAC -> Test.class -> JVM -> OC
                """);
    }
}
