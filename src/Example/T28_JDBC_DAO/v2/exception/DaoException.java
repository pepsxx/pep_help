package Example.T28_JDBC_DAO.v2.exception;

public class DaoException extends RuntimeException{
    public DaoException(Throwable throwable) {
    super(throwable);
    }
}
