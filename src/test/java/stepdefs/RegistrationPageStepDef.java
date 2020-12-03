package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationAccountPage;

import static org.assertj.core.api.Assertions.assertThat;

import static components.UserConfig.*;

public class RegistrationPageStepDef {
    RegistrationAccountPage registrationAccountPage = new RegistrationAccountPage();

    @When("I fill out the form with valid values into register")
    public void i_fill_out_the_form_with_valid_values_in_to_register() {
        registrationAccountPage.setRegistrationField(FIRST_NAME, LAST_NAME, EMAIL, PHONE, PASSWORD);
    }

    @When("I fill out without valid values into register")
    public void i_fill_out_the_form_without_valid_values_in_to_register() {
        registrationAccountPage.setRegistrationWithoutFirstNameField(LAST_NAME, EMAIL, PHONE, PASSWORD);
    }

    @Then("I see that message {string} appears")
    public void i_see_that_message_appears(String message) {
        assertThat(registrationAccountPage.getWrongMessageText().equals(message));
    }
}
