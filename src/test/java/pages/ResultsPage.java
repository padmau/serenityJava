package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by padmaa on 08/05/18.
 */
public class ResultsPage extends PageObject{

    String result = "s-result-count";
    @FindBy(css = "#result_0 > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > a:nth-child(1) > h2:nth-child(1)")
    WebElementFacade firstItemResultsPage;

    public String assertResultText(){
        String str = find(By.id(result)).getText();
        //String text =resultText.getText();
        return str;
    }

    public void clickFirstItemResultsPage(){
        firstItemResultsPage.click();
    }
}
