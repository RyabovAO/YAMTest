package framework.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class WebDriverCreate {

    private static WebDriver driver;

    private WebDriverCreate() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver(ChromeConfig.configChrome());
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
    }
}
