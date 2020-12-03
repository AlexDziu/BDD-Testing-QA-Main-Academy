package pages;

import io.qameta.allure.Step;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import utils.ScreenShotUtils;

//mvn allure::serve

@Slf4j
@Getter
public class MainPage extends BasePage {

    @Step("Open main page")
    public void openMainPage() {
        log.info("Opening main page of the application");
        getDriver().get("https://demo.opencart.com/");
    }

    @Step("enter login")
    public void enterLoginPage() {
        openMainPage();
        log.info("Click on my account drop down");
        getTopBar().clickOnMyAccountDropDown().selectLogin();
        ScreenShotUtils.makeScreenshot();
    }

    @Step("enter register")
    public void enterRegisterPage() {
        openMainPage();
        getTopBar().clickOnMyAccountDropDown().selectRegister();
    }
}
