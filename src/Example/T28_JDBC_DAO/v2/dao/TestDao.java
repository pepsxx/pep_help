package Example.T28_JDBC_DAO.v2.dao;

import Example.T28_JDBC_DAO.v2.entity.TestEntity;
import Example.T28_JDBC_DAO.v2.exception.DaoException;
import Example.T28_JDBC_DAO.v2.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;

public class TestDao { // final делать не стоит т.к. Hibernate (при использовании) будет создавать Proxy
    private static final TestDao INSTANCE = new TestDao();
    private static String sqlInsert = """
            INSERT INTO  test (name)
            VALUES (?)
            """;
    private static String sqlUpdate = """
            UPDATE test
            SET name = ?
            WHERE name = ?
            """;
    private static String sqlDelete = """
            DELETE
            FROM test
            WHERE name = ? OR name = ?
            """;
    private static String sqlSelect = """
            SELECT  *
            FROM test
            """;
    private static String sqlSelectWhere = sqlSelect + """
            WHERE name LIKE ?
            """;

    private TestDao() {
    }

    public static TestDao getInstance() {
        return INSTANCE;
    }

    public void creat(TestEntity testEntity) {
        int random = getRandom();
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

    public void read(TestEntity testEntity) {
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlSelectWhere);
            preparedStatement.setString(1, "%" + testEntity.getName() + "%");
            System.out.println("preparedStatement = " + preparedStatement);
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
