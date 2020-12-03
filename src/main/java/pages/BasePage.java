package pages;

import components.TopBar;
import components.TopMenu;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
public abstract class BasePage {
    private final TopMenu topMenu;
    private final TopBar topBar;

    public BasePage() {
        this.topBar = new TopBar(driver);
        this.topMenu = new TopMenu(driver);
    }

    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public WebElement waitUntilVisible(WebElement element, int time) {
        return new WebDriverWait(driver, time)
                .until(ExpectedConditions.visibilityOf(element));
    }

    protected WebElement find(By locator) {
        return getDriver().findElement(locator);
    }

    public void waitUntilTextWillPresent(By locator, int time, String text) {
        new WebDriverWait(driver, time)
                .until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

    public void waitInvisibilityOf(By locator, int time) {
        new WebDriverWait(driver, time)
                .until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public void clickWithJs(WebElement webElement) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", webElement);
    }

    public void moveToElement(WebElement element) {
        new Actions(driver).moveToElement(element).build().perform();
    }
}
