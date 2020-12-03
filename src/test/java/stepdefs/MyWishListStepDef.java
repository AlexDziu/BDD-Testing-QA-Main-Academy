package stepdefs;

import io.cucumber.java.en.Then;
import pages.WishListPage;

import static org.assertj.core.api.Assertions.assertThat;

public class MyWishListStepDef {
    WishListPage wishListPage = new WishListPage();

    @Then("I see {string} and {string} added")
    public void i_see_all_products_added(String apple, String samsung) {
        assertThat(wishListPage.getNamesFromWishListItems().contains(apple));
        assertThat(wishListPage.getNamesFromWishListItems().contains(samsung));
        System.out.println(apple);
        System.out.println(samsung);
    }
}
