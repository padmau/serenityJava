package stepdefs;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import pages.TestPage;

/**
 * Created by padmaa on 11/05/18.
 */
public class amazonBaseSteps extends TestPage {

    TestPage testPage;

    @Step
    public void openHomePage(){
        testPage.open();
    }

    @Step
    public void selectDropdown(String text){
        testPage.findEx(text);
    }

    @Step
    public void enterTextSearchBox(String text){
         testPage.searchBox(text);
    }

    @Step
    public void performMouseHover(String text){
        testPage.mouseHover();
    }
}
