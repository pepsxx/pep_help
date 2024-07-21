package Example.T28_JDBC_DAO.exception;

public class DaoException extends RuntimeException{
    public DaoException(Throwable throwable) {
    super(throwable);
    }
}
