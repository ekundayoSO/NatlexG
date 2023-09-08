package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static final String CONFIG_FILE = "src/main/java/config/properties.ini";
    public static String getUsername() {

        return getProperty("username");
    }
    public static String getFullName() {

        return getProperty("name");
    }
    public static String getPassword() {

        return getProperty("password");
    }
    private static String getProperty(String propertyName) {
        Properties properties = new Properties();
        try {
            FileInputStream input = new FileInputStream(CONFIG_FILE);
            properties.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(propertyName);
    }
}
