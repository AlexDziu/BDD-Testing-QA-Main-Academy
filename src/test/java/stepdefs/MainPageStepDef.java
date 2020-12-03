package stepdefs;

import io.cucumber.java.en.Given;
import pages.MainPage;

public class MainPageStepDef {
    MainPage mainPage = new MainPage();

    @Given("I am on the demo.opencart.com register page")
    public void i_am_on_the_open_cart_register_page() {
        mainPage.enterRegisterPage();
    }

    @Given("I am on the demo.opencart.com login page")
    public void i_am_on_the_open_cart_login_page() {
        mainPage.enterLoginPage();
    }
}
