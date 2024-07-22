package Example.T28_JDBC_DAO.v2.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class PropertiesUtil {
    private static final String FILEPATH = "resources/jdbc.properties";

    private PropertiesUtil() {
    }

    public static String getPProperties(String key) {
        try (FileInputStream fileInputStream = new FileInputStream(FILEPATH)) {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            return properties.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
