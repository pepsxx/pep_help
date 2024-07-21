package Example.T28_JDBC_DAO;

import Example.T28_JDBC_DAO.dao.TestDao;
import Example.T28_JDBC_DAO.entity.TestEntity;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        TestEntity testEntity = new TestEntity();
        testEntity.setName("Mike");
        TestDao.getInstance().creat(testEntity);
        TestDao.getInstance().update(testEntity, "Leo");
        TestDao.getInstance().delete(testEntity, "Leo");
        TestDao.getInstance().read();
    }
}

