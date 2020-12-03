package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ScreenShotUtils;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = "//h2[text()='My Account']")
    private WebElement textMyAccount;

    public MyAccountPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public String getTextMyAccount() {
        waitUntilVisible(textMyAccount, 5);
        ScreenShotUtils.makeScreenshot();
        return textMyAccount.getText();

    }

}
