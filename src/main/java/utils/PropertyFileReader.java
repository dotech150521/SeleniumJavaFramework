package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

    private static Properties projectProperties;

    static {
        try {
            projectProperties = new Properties();
            FileInputStream fis;
            fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/configFiles/config.properties");
            projectProperties.load(fis);

        } catch (IOException e) {
            e.getMessage();

        }
    }

    public static String getProperty(String propertyName) {

        return projectProperties.getProperty(propertyName);
    }

    public static Properties readPropertyFile() {
        return projectProperties;
    }
}
