package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public void setValidCredentials(String email, String password) {
        waitUntilVisible(emailField, 5).sendKeys(email);
        passwordField.click();
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
