package Example.T27_JDBC_Query.v2_PreparedStatement;

import java.io.IOException;
import java.sql.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        int random = ThreadLocalRandom.current().nextInt(0, 10);
        String sqlInsert = """
                INSERT INTO  test (name)
                VALUES (?);
                """;
        String sqlUpdate = """
                UPDATE test
                SET name = ?
                WHERE name = ?;
                """;
        String sqlDelete = """
                DELETE
                FROM test
                WHERE name = ? OR name = ?;
                """;
        String sqlSelect = """
                SELECT  *
                FROM test;
                """;
        try (Connection connection = ConnectionUtil.getConnection()) {
            System.out.println("connection.getSchema() = " + connection.getSchema());
            System.out.println("connection.getCatalog() = " + connection.getCatalog());
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT 'TEST'");

            preparedStatement = connection.prepareStatement(sqlInsert);
            preparedStatement.setString(1, "Mike" + random);
            int intInsert = preparedStatement.executeUpdate();
            System.out.println("intInsert = " + intInsert);

            preparedStatement = connection.prepareStatement(sqlUpdate);
            preparedStatement.setString(1, "Leo" + random);
            preparedStatement.setString(2, "Mike" + (random + 1));
            int intUpdate = preparedStatement.executeUpdate();
            System.out.println("intUpdate = " + intUpdate);

            preparedStatement = connection.prepareStatement(sqlDelete);
            preparedStatement.setString(1, "Mike" + (random - 1));
            preparedStatement.setString(2, "Leo" + (random - 1));
            int intDelete = preparedStatement.executeUpdate();
            System.out.println("intDelete = " + intDelete);

            preparedStatement = connection.prepareStatement(sqlSelect);
            ResultSet resultSelect = preparedStatement.executeQuery();
            while (resultSelect.next()) {
                System.out.printf("%10s%-10s%n", "resultSelect = ", resultSelect.getString("name"));
            }

        }
    }
}

