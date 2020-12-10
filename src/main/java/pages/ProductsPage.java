package pages;

import components.ProductBox;
import lombok.Getter;
import org.openqa.selenium.By;

import java.util.List;

@Getter
public class ProductsPage extends BasePage {
    private final ProductBox boxProduct;
    private final By boxContainers = By.xpath("//div[@class='product-thumb']");
    private final By wishListSuccessAddMessage = By.xpath("//div[contains(@class,'alert-success')]//a[1]");
    private final By closeSuccessMessageButton = By.xpath("//button[@class='close']");

    public ProductsPage() {
        this.boxProduct = new ProductBox(getDriver());
    }

    public void addToWishListFollowingProducts(String... productNames) {
        List<ProductBox> allProductBoxesFromPage = boxProduct.getAllProducts(boxContainers);
        for (String productName : productNames) {
            for (ProductBox box : allProductBoxesFromPage) {
                if (box.getNameItem().contains(productName)) {
                    moveToElement(box.getAddToWishList());
                    clickWithJs(box.getAddToWishList());
                    waitUntilTextWillPresent(wishListSuccessAddMessage, 10, box.getNameItem());
                    find(closeSuccessMessageButton).click();
                    waitInvisibilityOf(wishListSuccessAddMessage, 3);
                }
            }
        }
    }
}
