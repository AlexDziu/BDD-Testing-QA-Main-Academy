package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationAccountPage extends BasePage {
    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='input-confirm']")
    private WebElement passwordConfirm;

    @FindBy(xpath = "//input[@id='input-telephone']")
    private WebElement telephone;

    @FindBy(xpath = "//input[@name='agree']")
    private WebElement privacyPolicy;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement buttonContinue;

    @FindBy(xpath = "//div[text()='First Name must be between 1 and 32 characters!']")
    private WebElement textMessage;

    public RegistrationAccountPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void setRegistrationField(String inputFirstName, String inputLastName, String inputEmail, String inputPassword,
                                     String inputTelephone) {
        waitUntilVisible(firstName, 10).sendKeys(inputFirstName);
        lastName.sendKeys(inputLastName);
        email.sendKeys(inputEmail);
        telephone.sendKeys(inputTelephone);
        password.sendKeys(inputPassword);
        passwordConfirm.sendKeys(inputPassword);
        privacyPolicy.click();
        buttonContinue.click();
    }

    public void setRegistrationWithoutFirstNameField(String inputLastName, String inputEmail, String inputPassword,
                                                     String inputTelephone) {
        waitUntilVisible(lastName, 5).sendKeys(inputLastName);
        email.sendKeys(inputEmail);
        telephone.sendKeys(inputTelephone);
        password.sendKeys(inputPassword);
        passwordConfirm.sendKeys(inputPassword);
        privacyPolicy.click();
        buttonContinue.click();
    }

    public String getWrongMessageText() {
        waitUntilVisible(textMessage, 5);
        return textMessage.getText();
    }

}
