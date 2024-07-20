package Example.T27_JDBC_Query.v2_PreparedStatement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class PropertiesUtil {
    private static final String FILEPATH = "resources/jdbc.properties";

    private PropertiesUtil() {
    }

    static String getPProperties(String key) {
        try (FileInputStream fileInputStream = new FileInputStream(FILEPATH)) {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            return properties.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
