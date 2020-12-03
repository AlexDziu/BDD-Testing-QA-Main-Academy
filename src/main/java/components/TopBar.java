package components;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pages.BasePage.getDriver;

@Getter
public class TopBar {
    private final WebDriver webDriver;
    private final WebDriverWait wait;

    @FindBy(xpath = "//span[@class='caret']")
    private WebElement myAccountDropDown;
    @FindBy(xpath = "//ul//a[text()='Register']")
    private WebElement registerLink;
    @FindBy(xpath = "//ul//a[text()='Login']")
    private WebElement loginLink;
    @FindBy(xpath = "//a[@id='wishlist-total']")
    private WebElement wishListTotal;

    public TopBar(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
        webDriver = driver;
        wait = new WebDriverWait(driver, 5);
    }

//    private final By myAccountDropDown = By.xpath("//span[@class='caret']");
//    private final By registerLink = By.xpath("//ul//a[text()='Register']");
//    private final By loginLink = By.xpath("//ul//a[text()='Login']");
//    private final By wishListTotal = By.xpath("//a[@id='wishlist-total']");


    public TopBar clickOnMyAccountDropDown() {
        wait.until(ExpectedConditions.visibilityOf(myAccountDropDown)).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountDropDown)).click();
        return this;
    }

    public void selectRegister() {
        wait.until(ExpectedConditions.visibilityOf(registerLink)).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(registerLink)).click();
    }

    public void selectLogin() {
        wait.until(ExpectedConditions.visibilityOf(loginLink)).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(loginLink)).click();
    }

    public void clickOnWishListTotal() {
        wait.until(ExpectedConditions.visibilityOf(wishListTotal)).click();

//        actions.moveToElement(webDriver.findElement(wishListTotal));
//        webDriver.findElement(wishListTotal).click();
    }
}
