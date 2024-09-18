package example.c1_java_classloader;

public class Main {
    public static void main(String[] args) {
        System.out.printf("""
                № | Class                 | Класс                |  Ключ           | системная опция | Реализация     | Директория
                1 | Bootstrap Classloader | Базовый загрузчик    | -Xbootclasspath | ???             | ???            | <JAVA_HOME>/lib
                2 | Extension Classloader | Загрузчик расширений | -???            | java.ext.dirs   | ExtClassLoader | <JAVA_HOME>/lib/ext
                3 | System    Classloader | Системный загрузчик  | -classpath      | java.class.path | AppClassLoader | CLASSPATH
                
                Пусть в систем исполнения встретилась декларация переменной пользовательского класса Student.
                1.1 System Classloader                    -  Поиск в кеше класс Student.
                    Если не найден, загрузка делегируется -> Extension Classloader.
                1.2 Extension Classloader                 -  Поиск в кеше класс Student.
                    Если не найден, загрузка делегируется -> Bootstrap Classloader.
                1.3 Bootstrap Classloader                 -  Поиск в кеше класс Student.
                    Если не найден                        -  Переход к попытке загрузки.
                2.1 Bootstrap Classloader загрузка класса
                    Если загрузка не прошла управление    -> Extension Classloader.
                2.2 Extension Classloader загрузка класса
                    Если загрузка не прошла управление    -> System Classloader.
                2.3 System Classloader загрузка класса
                    Если загрузка не прошла генерируется ->  java.lang.ClassNotFoundException.
                    
                    Примеры:
                    
                    "C:\\Program Files\\Java\\jdk-21\\bin\\java.exe"
                    "-javaagent:C:\\Program Files\\JetBrains\\IntelliJIdea2024.2\\lib\\idea_rt.jar=51310:C:\\Program Files\\JetBrains\\IntelliJIdea2024.2\\bin"
                     -Dfile.encoding=UTF-8
                     -Dsun.stdout.encoding=UTF-8
                     -Dsun.stderr.encoding=UTF-8
                     -classpath C:\\Users\\pep_s\\IdeaProjects\\test1038\\out\\production\\test1038
                    Main

                    "C:\\Program Files\\Java\\jdk-21\\bin\\java.exe"\s
                    "-javaagent:C:\\Program Files\\JetBrains\\IntelliJIdea2024.2\\lib\\idea_rt.jar=50869:C:\\Program Files\\JetBrains\\IntelliJIdea2024.2\\bin"
                     -Dfile.encoding=UTF-8
                     -Dsun.stdout.encoding=UTF-8
                     -Dsun.stderr.encoding=UTF-8
                     -classpath C:\\Users\\pep_s\\IdeaProjects\\pep_pro_help\\out\\production\\pep_pro_help;
                                C:\\Users\\pep_s\\IdeaProjects\\pep_pro_help\\manualDependency\\postgresql-42.7.3.jar;
                    			C:\\Users\\pep_s\\IdeaProjects\\pep_pro_help\\manualDependency\\lombok.jar
                    example.T29_Arg.Main a1 a2 a3 a4

                    "C:\\Program Files\\Java\\jdk-21\\bin\\java.exe"
                     -XX:TieredStopAtLevel=1
                     -Dspring.output.ansi.enabled=always
                     -Dcom.sun.management.jmxremote
                     -Dspring.jmx.enabled=true
                     -Dspring.liveBeansView.mbeanDomain
                     -Dspring.application.admin.enabled=true
                     "-Dmanagement.endpoints.jmx.exposure.include=*"
                     "-javaagent:C:\\Program Files\\JetBrains\\IntelliJIdea2024.2\\lib\\idea_rt.jar=51501:C:\\Program Files\\JetBrains\\IntelliJIdea2024.2\\bin"
                     -Dfile.encoding=UTF-8
                     -Dsun.stdout.encoding=UTF-8
                     -Dsun.stderr.encoding=UTF-8
                     -classpath\s
                    			C:\\Users\\pep_s\\IdeaProjects\\pep_aston\\target\\classes;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\yaml\\snakeyaml\\2.2\\snakeyaml-2.2.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\spring-webmvc\\6.1.6\\spring-webmvc-6.1.6.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\spring-web\\6.1.6\\spring-web-6.1.6.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\spring-tx\\6.1.6\\spring-tx-6.1.6.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\spring-orm\\6.1.6\\spring-orm-6.1.6.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\spring-jdbc\\6.1.6\\spring-jdbc-6.1.6.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\spring-jcl\\6.1.6\\spring-jcl-6.1.6.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\spring-expression\\6.1.6\\spring-expression-6.1.6.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\spring-core\\6.1.6\\spring-core-6.1.6.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\spring-context\\6.1.6\\spring-context-6.1.6.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\spring-beans\\6.1.6\\spring-beans-6.1.6.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\spring-aspects\\6.1.6\\spring-aspects-6.1.6.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\spring-aop\\6.1.6\\spring-aop-6.1.6.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\data\\spring-data-jpa\\3.2.5\\spring-data-jpa-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\data\\spring-data-commons\\3.2.5\\spring-data-commons-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-web\\3.2.5\\spring-boot-starter-web-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-validation\\3.2.5\\spring-boot-starter-validation-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-tomcat\\3.2.5\\spring-boot-starter-tomcat-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-logging\\3.2.5\\spring-boot-starter-logging-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-json\\3.2.5\\spring-boot-starter-json-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-jdbc\\3.2.5\\spring-boot-starter-jdbc-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-data-jpa\\3.2.5\\spring-boot-starter-data-jpa-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-aop\\3.2.5\\spring-boot-starter-aop-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-actuator\\3.2.5\\spring-boot-starter-actuator-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter\\3.2.5\\spring-boot-starter-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\boot\\spring-boot-docker-compose\\3.2.5\\spring-boot-docker-compose-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\boot\\spring-boot-autoconfigure\\3.2.5\\spring-boot-autoconfigure-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\boot\\spring-boot-actuator-autoconfigure\\3.2.5\\spring-boot-actuator-autoconfigure-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\boot\\spring-boot-actuator\\3.2.5\\spring-boot-actuator-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\springframework\\boot\\spring-boot\\3.2.5\\spring-boot-3.2.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\slf4j\\slf4j-api\\2.0.13\\slf4j-api-2.0.13.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\slf4j\\jul-to-slf4j\\2.0.13\\jul-to-slf4j-2.0.13.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\projectlombok\\lombok-mapstruct-binding\\0.2.0\\lombok-mapstruct-binding-0.2.0.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\projectlombok\\lombok\\1.18.34\\lombok-1.18.34.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\postgresql\\postgresql\\42.6.2\\postgresql-42.6.2.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\ow2\\asm\\asm\\9.6\\asm-9.6.jar;C:\\Users\\pep_s\\.m2\\repository\\com\\thoughtworks\\qdox\\qdox\\2.0.3\\qdox-2.0.3.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\mapstruct\\mapstruct\\1.6.0\\mapstruct-1.6.0.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\latencyutils\\LatencyUtils\\2.0.3\\LatencyUtils-2.0.3.jar com.xandr.pep_aston.PepAstonApplication
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\jboss\\logging\\jboss-logging\\3.5.3.Final\\jboss-logging-3.5.3.Final.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\hibernate\\validator\\hibernate-validator\\8.0.1.Final\\hibernate-validator-8.0.1.Final.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\hibernate\\orm\\hibernate-core\\6.4.4.Final\\hibernate-core-6.4.4.Final.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\hibernate\\common\\hibernate-commons-annotations\\6.0.6.Final\\hibernate-commons-annotations-6.0.6.Final.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\hdrhistogram\\HdrHistogram\\2.1.12\\HdrHistogram-2.1.12.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\glassfish\\jaxb\\txw2\\4.0.5\\txw2-4.0.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\glassfish\\jaxb\\jaxb-runtime\\4.0.5\\jaxb-runtime-4.0.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\glassfish\\jaxb\\jaxb-core\\4.0.5\\jaxb-core-4.0.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\eclipse\\angus\\angus-activation\\2.0.2\\angus-activation-2.0.2.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\codehaus\\plexus\\plexus-xml\\3.0.0\\plexus-xml-3.0.0.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\codehaus\\plexus\\plexus-utils\\4.0.0\\plexus-utils-4.0.0.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\codehaus\\plexus\\plexus-java\\1.2.0\\plexus-java-1.2.0.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\codehaus\\plexus\\plexus-compiler-manager\\2.15.0\\plexus-compiler-manager-2.15.0.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\codehaus\\plexus\\plexus-compiler-javac\\2.15.0\\plexus-compiler-javac-2.15.0.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\codehaus\\plexus\\plexus-compiler-api\\2.15.0\\plexus-compiler-api-2.15.0.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\checkerframework\\checker-qual\\3.31.0\\checker-qual-3.31.0.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\aspectj\\aspectjweaver\\1.9.22\\aspectjweaver-1.9.22.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\apache\\tomcat\\embed\\tomcat-embed-websocket\\10.1.20\\tomcat-embed-websocket-10.1.20.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\apache\\tomcat\\embed\\tomcat-embed-el\\10.1.20\\tomcat-embed-el-10.1.20.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\apache\\tomcat\\embed\\tomcat-embed-core\\10.1.20\\tomcat-embed-core-10.1.20.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\apache\\maven\\shared\\maven-shared-utils\\3.4.2\\maven-shared-utils-3.4.2.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\apache\\maven\\shared\\maven-shared-incremental\\1.1\\maven-shared-incremental-1.1.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\apache\\maven\\plugins\\maven-compiler-plugin\\3.13.0\\maven-compiler-plugin-3.13.0.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\apache\\logging\\log4j\\log4j-to-slf4j\\2.21.1\\log4j-to-slf4j-2.21.1.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\apache\\logging\\log4j\\log4j-api\\2.21.1\\log4j-api-2.21.1.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\org\\antlr\\antlr4-runtime\\4.13.0\\antlr4-runtime-4.13.0.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\net\\bytebuddy\\byte-buddy\\1.14.13\\byte-buddy-1.14.13.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\javax\\inject\\javax.inject\\1\\javax.inject-1.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\jakarta\\xml\\bind\\jakarta.xml.bind-api\\4.0.2\\jakarta.xml.bind-api-4.0.2.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\jakarta\\validation\\jakarta.validation-api\\3.0.2\\jakarta.validation-api-3.0.2.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\jakarta\\transaction\\jakarta.transaction-api\\2.0.1\\jakarta.transaction-api-2.0.1.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\jakarta\\persistence\\jakarta.persistence-api\\3.1.0\\jakarta.persistence-api-3.1.0.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\jakarta\\inject\\jakarta.inject-api\\2.0.1\\jakarta.inject-api-2.0.1.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\jakarta\\annotation\\jakarta.annotation-api\\2.1.1\\jakarta.annotation-api-2.1.1.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\jakarta\\activation\\jakarta.activation-api\\2.1.3\\jakarta.activation-api-2.1.3.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\io\\smallrye\\jandex\\3.1.2\\jandex-3.1.2.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\io\\micrometer\\micrometer-observation\\1.12.5\\micrometer-observation-1.12.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\io\\micrometer\\micrometer-jakarta9\\1.12.5\\micrometer-jakarta9-1.12.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\io\\micrometer\\micrometer-core\\1.12.5\\micrometer-core-1.12.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\io\\micrometer\\micrometer-commons\\1.12.5\\micrometer-commons-1.12.5.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\commons-io\\commons-io\\2.11.0\\commons-io-2.11.0.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\com\\zaxxer\\HikariCP\\5.0.1\\HikariCP-5.0.1.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\com\\sun\\istack\\istack-commons-runtime\\4.1.2\\istack-commons-runtime-4.1.2.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\com\\fasterxml\\jackson\\module\\jackson-module-parameter-names\\2.15.4\\jackson-module-parameter-names-2.15.4.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\com\\fasterxml\\jackson\\datatype\\jackson-datatype-jsr310\\2.15.4\\jackson-datatype-jsr310-2.15.4.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\com\\fasterxml\\jackson\\datatype\\jackson-datatype-jdk8\\2.15.4\\jackson-datatype-jdk8-2.15.4.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\com\\fasterxml\\jackson\\core\\jackson-databind\\2.15.4\\jackson-databind-2.15.4.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\com\\fasterxml\\jackson\\core\\jackson-core\\2.15.4\\jackson-core-2.15.4.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\com\\fasterxml\\jackson\\core\\jackson-annotations\\2.15.4\\jackson-annotations-2.15.4.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\com\\fasterxml\\classmate\\1.6.0\\classmate-1.6.0.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\ch\\qos\\logback\\logback-core\\1.4.14\\logback-core-1.4.14.jar;
                    			C:\\Users\\pep_s\\.m2\\repository\\ch\\qos\\logback\\logback-classic\\1.4.14\\logback-classic-1.4.14.jar;""");
    }
}
