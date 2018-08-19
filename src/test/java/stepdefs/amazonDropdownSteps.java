package stepdefs;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.ResultsPage;
import pages.ShoppingCartPage;
import pages.TestPage;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

/**
 * Created by padmaa on 08/05/18.
 */

public class amazonDropdownSteps {


    @Steps

    amazonBaseSteps baseSteps;
    ResultsPage results;
    ShoppingCartPage shoppingCart;

    @Given("^I navigate to amazon website$")
    public void goToWebsite() {
        baseSteps.openHomePage();
    }

    @Given("^I select (.*) in the product dropdown$")
    public void selectProduct(String text) {
        baseSteps.selectDropdown(text);
    }

    @Given("^I type in '(.*)' in the search box$")
    public void enterTextDropdown(String text) {
        baseSteps.enterTextSearchBox(text);
    }

    @Given("^I press enter$")
    public void pressEnter() {
        baseSteps.keysEnter();
    }

    @Given("^I see that the first result has the name '(.*)' in it$")
    public void assertSearchText(String text) {
        Assert.assertThat(results.assertResultText(), containsString(text));
    }

    @Given("^I hover mouse over '(.*)' to '(.*)' and click '(.*)'$")
    public void mouseHover(String productType1, String productType2, String productType3) {
        // baseSteps.mouseHover();
    }

    @Given("^I clear the shopping basket if there are items in it$")
    public void clearShoppingCart() {
        int count = baseSteps.countShoppingCart();
        if (count > 0) {
            baseSteps.clickShoppingCart();
            shoppingCart.clickDelete();
        } else {
            baseSteps.pageRefresh();
        }
    }

    @Given("^I select '(.*)' on the products page$")
    public void selectProductType(String productType1) {
        results.clickFirstItemResultsPage();
    }

    @Given("^I click add to the basket on the product page$")
    public void clickAddToShoppinBasket() {
        baseSteps.clickAddToBasket();
    }

    @Given("^I see the shopping cart has (.*) item in it$")
    public void verifyShoppingCart(int count) {
        Assert.assertEquals(baseSteps.countShoppingCart(), count);
    }

    @Given("^I click Today's Deals$")
    public void clickTodaysDeals() {
        baseSteps.clickTodaysDeals();
    }

    @Given("^I click (.*) pounds deals$")
    public void clickPriceAmount(String amount) {
        baseSteps.clickUnder15Pounds();
    }

    @Given("^I click Shop by Department hidden list$")
    public void clickAllItemsHiddenList() { baseSteps.clickHiddenList();}

    @Given("^I click (.*) in Home,Garden,Pets and DIY department$")
    public void clickFurniture(String department){ baseSteps.clickFurniture(); }

    @Given("^I click (.*) in the furniture department$")
    public void clickSofaAndCouches(String department) { baseSteps.clickSofaAndCouches(); }

    @Given("^I see (.*) in the H2$")
    public void getTextSofaAndCouches(String department){ baseSteps.getTextSofaAndCouches();}

}
