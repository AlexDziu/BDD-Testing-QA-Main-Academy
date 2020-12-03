package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = "//h2[text()='My Account']")
    private WebElement textMyAccount;

    public MyAccountPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @Step("Get text from my account")
    public String getTextMyAccount() {
        waitUntilVisible(textMyAccount, 5);
        return textMyAccount.getText();
    }

}
