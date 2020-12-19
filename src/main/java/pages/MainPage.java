package pages;

import io.qameta.allure.Step;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import utils.ScreenShotUtils;

@Slf4j
@Getter
public class MainPage extends BasePage {

    @Step("Open main page")
    public void openMainPage() {
        log.info("Opening main page of the application");
        getDriver().get("https://demo.opencart.com/");
        ScreenShotUtils.makeScreenshot();
    }

    @Step("click on login")
    public void enterLoginPage() {
        log.info("Click on login");
        getTopBar().clickOnMyAccountDropDown().selectLogin();
        ScreenShotUtils.makeScreenshot();
    }

    @Step("click on register")
    public void enterRegisterPage() {
        log.info("Click on register");
        openMainPage();
        getTopBar().clickOnMyAccountDropDown().selectRegister();
        ScreenShotUtils.makeScreenshot();
    }
}
