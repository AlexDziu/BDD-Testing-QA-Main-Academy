package pages;

import lombok.Getter;

@Getter
public class MainPage extends BasePage {

    public void openMainPage() {
        getDriver().get("https://demo.opencart.com/");
    }

    public void enterLoginPage() {
        openMainPage();
        getTopBar().clickOnMyAccountDropDown().selectLogin();
    }

    public void enterRegisterPage() {
        openMainPage();
        getTopBar().clickOnMyAccountDropDown().selectRegister();
    }
}
