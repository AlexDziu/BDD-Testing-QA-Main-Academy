package stepdefs;

import io.cucumber.java.en.Then;
import pages.MyAccountPage;

import static org.assertj.core.api.Assertions.assertThat;

public class MyAccountPageStepDef {
    MyAccountPage myAccountPage = new MyAccountPage();

    @Then("I see {string} in the left top of the page")
    public void i_see_in_the_left_top_of_the_page(String message) {
        assertThat(myAccountPage.getTextMyAccount().equals(message));
    }
}
