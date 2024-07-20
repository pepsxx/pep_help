package Example.T26_JDBC.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Скачать JDBC Driver с сайта используемой СУБД.
        // Подключить его к проекту File -> Project Structure...
        // Project Settings -> Modules -> Dependencies -> +.
        String user = "postgres";
        String pass = "postgres";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        try (Connection connection = DriverManager.getConnection(url, user, pass)) {
            System.out.println("connection.getSchema() = " + connection.getSchema());
        }
    }
}
