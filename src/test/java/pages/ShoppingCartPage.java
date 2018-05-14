package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by padmaa on 13/05/18.
 */
public class ShoppingCartPage extends PageObject {
        @FindBy(css = ".sc-action-delete > span:nth-child(1) > input:nth-child(1)")
          WebElementFacade delete;

        public void clickDelete(){
            delete.click();
        }
}
