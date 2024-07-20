package Example.T26_JDBC.v2_propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        // Скачать JDBC Driver с сайта используемой СУБД.
        // Подключить его к проекту File -> Project Structure...
        // Project Settings -> Modules -> Dependencies -> +.
        try (FileInputStream fileInputStream = new FileInputStream("resources/jdbc.properties")) {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            String user = properties.getProperty("user");
            String pass = properties.getProperty("pass");
            String url = properties.getProperty("url");
            try (Connection connection = DriverManager.getConnection(url, user, pass)) {
                System.out.println("connection.getTransactionIsolation() = " + connection.getTransactionIsolation());
            }
        }
    }
}
