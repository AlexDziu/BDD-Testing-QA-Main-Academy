package stepdefs;

import components.TopBar;
import io.cucumber.java.en.And;

import static pages.BasePage.getDriver;

public class TopBarStepDef {
    TopBar topBar = new TopBar(getDriver());

    @And("I navigate to WishList page")
    public void i_navigate_to_WishList_page() {
        topBar.clickOnWishListTotal();
    }
}
