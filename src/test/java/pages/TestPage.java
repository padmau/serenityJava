package pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Created by padmaa on 10/05/18.
 */

@DefaultUrl("https://www.amazon.co.uk/")
public class TestPage extends PageObject{

     @FindBy(id = "twotabsearchtextbox")
     WebElementFacade searchBox;
     @FindBy(id = "nav-cart-count" )
     WebElementFacade shoppingCartCount;
     @FindBy(id="nav-cart")
     WebElementFacade shoppingCart;
     @FindBy(id="add-to-cart-button")
      WebElementFacade addToBasket;


    String dep = "nav-link-shopall";
    String FandG = "span.nav-hasPanel:nth-child(18)>span:nth-child(1)";
    String grocery = "div.nav-template:nth-child(17)>div:nth-child(2)>a:nth-child(1)";


    public void findEx(String text){
        new WebDriverWait(getDriver(),10).until(ExpectedConditions.presenceOfElementLocated(By.id("searchDropdownBox")));
        selectFromDropdown(getDriver().findElement(By.id("searchDropdownBox")),text);
     }

    public void  searchBox(String text){
        searchBox.sendKeys(text);
    }

    public void keysEnter(){
       searchBox.sendKeys(Keys.ENTER);
    }

    public void mouseHover(){
        new WebDriverWait(getDriver(),10).until(ExpectedConditions.presenceOfElementLocated(By.id("nav-link-shopall")));

//        Actions action = new Actions(getDriver());
//        withAction().moveToElement()
       // withAction().moveToElement(find(By.id(dep))).build().perform();

        new Actions(getDriver()).moveToElement(find(By.id(dep))).build().perform();
        new WebDriverWait(getDriver(),10).until(ExpectedConditions.presenceOfElementLocated(By.id(FandG)));
        find(By.id(FandG)).click();
        find(By.id(grocery)).click();
    }

    public void clickShoppingCart(){
        shoppingCart.click();
    }

    public int countShoppingCart(){
        String count = shoppingCartCount.getText();
        int count1=Integer.parseInt(count);
        System.out.println("****************************"+count1);
        return count1;
    }

    public void pageRefresh(){
        getDriver().navigate().refresh();
    }

    public void clickAddToBasket(){
        addToBasket.click();
    }

}
