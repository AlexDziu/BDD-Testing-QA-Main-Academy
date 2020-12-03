package pages;

import io.qameta.allure.Step;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ScreenShotUtils;

@Slf4j
@Getter
public class LoginPage extends BasePage {
    @FindBy(id = "input-email")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @Step("Set valid credentials")
    public void setValidCredentials(String email, String password) {
        log.info("Input email and password");
        waitUntilVisible(emailField, 5).sendKeys(email);
        ScreenShotUtils.makeScreenshot();
        passwordField.click();
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
