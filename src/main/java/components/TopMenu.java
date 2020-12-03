package components;

import lombok.Getter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ProductsPage;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static pages.BasePage.getDriver;


@Getter
public class TopMenu {
    private final WebDriver webDriver;
    private final WebDriverWait wait;
    private final Actions actions;

    @FindBy(xpath = "//a[text()='Components']")
    private WebElement selectComponents;

    @FindBy(xpath = "//a[contains(text(),'Monitors')]")
    private WebElement selectMonitors;

    @FindBy(xpath = "//a[text()='Desktops']")
    private WebElement desktopsCategory;

    public TopMenu(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
        webDriver = driver;
        wait = new WebDriverWait(driver, 10);
        actions = new Actions(driver);
    }

    public void selectCategoryFromMenuItem(MenuCategories category) {
//        Actions actions = new Actions(webDriver);
        switch (category) {
            case DESKTOPS:
                actions.moveToElement(desktopsCategory).build().perform();
                break;
            case COMPONENTS:
                actions.moveToElement(selectComponents).build().perform();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + category);
        }
    }

    public void selectSubCategory(MenuSubCategories subCategory) {
//        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        switch (subCategory) {
            case MONITORS:
                wait.until(ExpectedConditions.visibilityOf(selectMonitors)).click();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + subCategory);
        }
        new ProductsPage();
    }
//    private final WebDriver driver;
//
//    public TopMenu(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    private final By selectComponents = By.xpath("//a[text()='Components']");
//    private final By selectMonitors = By.xpath("//a[contains(text(),'Monitors')]");
//    private final By desktopsCategoryLink = By.xpath("//a[text()='Desktops']");
//
//    public TopMenu selectCategoryFromMenuItem(MenuCategories category) {
//        Actions actions = new Actions(driver);
//        switch (category) {
//            case DESKTOPS:
//                actions.moveToElement(driver.findElement(desktopsCategoryLink));
//                break;
//            case COMPONENTS:
//                actions.moveToElement(driver.findElement(selectComponents));
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + category);
//        }
//        actions.build().perform();
//        return this;
//    }
//
//    public ProductsPage selectSubCategory(MenuSubCategories subCategory) {
//        WebDriverWait wait = new WebDriverWait(driver, 3);
//        switch (subCategory) {
//            case MONITORS:
//                wait.until(visibilityOfElementLocated(selectMonitors)).click();
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + subCategory);
//        }
//        return new ProductsPage();
//    }
}
