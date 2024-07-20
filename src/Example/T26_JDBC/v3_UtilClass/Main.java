package Example.T26_JDBC.v3_UtilClass;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        // Скачать JDBC Driver с сайта используемой СУБД.
        // Подключить его к проекту File -> Project Structure...
        // Project Settings -> Modules -> Dependencies -> +.

        try (Connection connection = ConnectionUtil.getConnection()) {
            System.out.println("connection.getSchema() = " + connection.getSchema());
        }
    }
}

