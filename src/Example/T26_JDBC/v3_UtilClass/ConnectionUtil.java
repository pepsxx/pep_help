package Example.T26_JDBC.v3_UtilClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionUtil {
    private static final String URL_KEY = "url";
    private static final String USER_KEY = "user";
    private static final String PASS_KEY = "pass";

    private ConnectionUtil() {
    }

    static Connection getConnection() {

        String url = PropertiesUtil.getPProperties(URL_KEY);
        String user = PropertiesUtil.getPProperties(USER_KEY);
        String pass = PropertiesUtil.getPProperties(PASS_KEY);
        try {
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
