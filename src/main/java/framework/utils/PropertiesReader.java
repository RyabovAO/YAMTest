package framework.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static framework.constants.FrameworkConstants.PROPERTIES;

public class PropertiesReader {

    public static String getPropertyValue(String key) {
        Properties prop = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(PROPERTIES)) {
            prop.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
