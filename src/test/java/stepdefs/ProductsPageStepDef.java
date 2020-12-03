package stepdefs;

import io.cucumber.java.en.And;
import pages.ProductsPage;

public class ProductsPageStepDef {
    ProductsPage productsPage = new ProductsPage();

    @And("I add {string} and {string} to WishList")
    public void i_add_all_products_to_wishList(String apple, String samsung) {
        productsPage.addToWishListFollowingProducts(apple, samsung);
    }
}
