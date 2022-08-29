package framework.baseTest;

import framework.driverManager.WebDriverCreate;
import framework.utils.PropertiesReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    private final static String URL = "URL";

    @BeforeMethod
    public void startTest() {
        WebDriverCreate.getDriver().get(PropertiesReader.getPropertyValue(URL));
    }

    @AfterMethod
    public void endTest() {
        WebDriverCreate.closeDriver();
    }
}
