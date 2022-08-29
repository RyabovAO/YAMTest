package framework.baseElement;

import framework.driverManager.WebDriverCreate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static framework.constants.FrameworkConstants.DRIVER_EXPLICIT_WAIT_TIMER;

public abstract class BaseElement {

    protected WebDriver driver;

    public BaseElement() {
        this.driver = WebDriverCreate.getDriver();
    }

    public boolean elementIsVisible(String xPath) {
        return waitElement(xPath).isDisplayed();
    }

    public WebElement findByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public List<WebElement> findElements(String xPath) {
        return driver.findElements(By.xpath(xPath));
    }

    public WebElement waitElement(String elem) {
        return new WebDriverWait(driver, DRIVER_EXPLICIT_WAIT_TIMER).
                until(ExpectedConditions.elementToBeClickable(findByXpath(elem)));
    }

    public void mouseMoveToElement(String xPath) {
        new Actions(driver).moveToElement(findByXpath(xPath)).perform();
    }
}
