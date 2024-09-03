package example.T28_JDBC_DAO.v1.dao;

import example.T28_JDBC_DAO.v1.util.ConnectionUtil;
import example.T28_JDBC_DAO.v1.entity.TestEntity;
import example.T28_JDBC_DAO.v1.exception.DaoException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;

public class TestDao { // final делать не стоит т.к. Hibernate (при использовании) будет создавать Proxy
    private static final TestDao INSTANCE = new TestDao();

    private TestDao() {
    }

    public static TestDao getInstance() {
        return INSTANCE;
    }

    public void creat(TestEntity testEntity) {
        int random = getRandom();
        String sqlInsert = """
                INSERT INTO  test (name)
                VALUES (?);
                """;

        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
            preparedStatement.setString(1, testEntity.getName() + random);
            int intInsert = preparedStatement.executeUpdate();
            System.out.println("intInsert = " + intInsert);
        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }

    public void update(TestEntity testEntity, String newName) {
        int random = getRandom();
        String sqlUpdate = """
                UPDATE test
                SET name = ?
                WHERE name = ?;
                """;
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlUpdate);
            preparedStatement.setString(1, newName + random);
            preparedStatement.setString(2, testEntity.getName() + (random + 1));
            int intUpdate = preparedStatement.executeUpdate();
            System.out.println("intUpdate = " + intUpdate);
        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }

    public void delete(TestEntity testEntity, String deleteToName) {
        int random = getRandom();
        String sqlDelete = """
                DELETE
                FROM test
                WHERE name = ? OR name = ?;
                """;
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlDelete);
            preparedStatement.setString(1, testEntity.getName() + (random - 1));
            preparedStatement.setString(2, deleteToName + (random - 1));
            int intDelete = preparedStatement.executeUpdate();
            System.out.println("intDelete = " + intDelete);
        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }

    public void read() {
        int random = getRandom();
        String sqlSelect = """
                SELECT  *
                FROM test;
                """;
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlSelect);
            ResultSet resultSelect = preparedStatement.executeQuery();
            while (resultSelect.next()) {
                System.out.printf("%10s%-10s%n", "resultSelect = ", resultSelect.getString("name"));
            }
        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }

    private static int getRandom() {
        return ThreadLocalRandom.current().nextInt(0, 10);
    }
}
