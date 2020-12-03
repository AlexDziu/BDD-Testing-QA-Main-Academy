package stepdefs;

import io.cucumber.java.en.Then;
import pages.SuccessRegistrationPage;

import static org.assertj.core.api.Assertions.assertThat;

public class SuccessRegistrationStepDef {
    SuccessRegistrationPage successRegistrationPage = new SuccessRegistrationPage();

    @Then("I see message {string} appears")
    public void i_see_message_your_account_has_been_created_appears(String message) {
        assertThat(successRegistrationPage.getSuccessMessageText()).isEqualTo(message);
    }
}
