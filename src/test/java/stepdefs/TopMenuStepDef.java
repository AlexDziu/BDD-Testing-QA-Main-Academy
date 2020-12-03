package stepdefs;

import components.MenuCategories;
import components.MenuSubCategories;
import components.TopMenu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static pages.BasePage.getDriver;

public class TopMenuStepDef {
    TopMenu topMenu = new TopMenu(getDriver());

    @Given("I click on {} in the top menu")
    public void i_click_on_COMPONENTS_in_the_TopMenu(MenuCategories item) {
        topMenu.selectCategoryFromMenuItem(item);
        System.out.println(item);
    }

    @When("I choose {}")
    public void i_choose_MONITORS(MenuSubCategories item) {
        topMenu.selectSubCategory(item);
        System.out.println(item);
    }

}
