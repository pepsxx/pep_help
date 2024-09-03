package example.T28_JDBC_DAO.v1.exception;

public class DaoException extends RuntimeException{
    public DaoException(Throwable throwable) {
    super(throwable);
    }
}
