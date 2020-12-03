package stepdefs;

import io.cucumber.java.en.When;
import pages.LoginPage;


public class LoginPageStepDef {
    LoginPage loginPage = new LoginPage();

    @When("I enter {string} and {string} into login")
    public void i_enter_email_and_password(String email, String password) {
        loginPage.setValidCredentials(email, password);
    }
}
