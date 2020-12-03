package stepdefs;

import io.cucumber.java.en.Given;
import pages.MainPage;

public class MainPageStepDef {
    MainPage mainPage = new MainPage();

    @Given("I am on the demo.opencart.com register page")
    public void i_select_register() {
        mainPage.enterRegisterPage();
    }

    @Given("I am on the demo.opencart.com main page")
    public void i_select_login() {
        mainPage.openMainPage();
        mainPage.enterLoginPage();
    }
}
