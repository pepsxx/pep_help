package Example.T27_JDBC_Query.v1_Stetment;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        int random = ThreadLocalRandom.current().nextInt(0, 10);
        String sqlInsert = """
                INSERT INTO  test (name)
                VALUES ('Mike%d');
                """.formatted(random);
        String sqlUpdate = """
                UPDATE test
                SET name = 'Leo%d'
                WHERE name = 'Mike%d';
                                """.formatted(random, random + 1);
        String sqlDelete = """
                DELETE
                FROM test
                WHERE name = 'Mike%d' OR name = 'Leo%d';
                                """.formatted(random - 1, random - 1);
        String sqlSelect = """
                SELECT  *
                FROM test;
                """;
        try (Connection connection = ConnectionUtil.getConnection()) {
            System.out.println("connection.getSchema() = " + connection.getSchema());
            System.out.println("connection.getCatalog() = " + connection.getCatalog());
            Statement statement = connection.createStatement();

            boolean resultInsert = statement.execute(sqlInsert);
            System.out.printf("%10s%-10s%n", "resultInsert = ", resultInsert);

            boolean resultUpdate = statement.execute(sqlUpdate);
            System.out.printf("%10s%-10s%n", "resultUpdate = ", resultUpdate);

            boolean resultDelete = statement.execute(sqlDelete);
            System.out.printf("%10s%-10s%n", "resultDelete = ", resultDelete);

            ResultSet resultSelect = statement.executeQuery(sqlSelect);
            while (resultSelect.next()) {
                System.out.printf("%10s%-10s%n", "resultSelect = ", resultSelect.getString("name"));
            }

        }
    }
}

