package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessRegistrationPage extends BasePage {

    @FindBy(xpath = "//div[@id='content']/h1[text()='Your Account Has Been Created!']")
    private WebElement textMessage;

    public SuccessRegistrationPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public String getSuccessMessageText() {
        waitUntilVisible(textMessage, 5);
        return textMessage.getText();
    }
}
