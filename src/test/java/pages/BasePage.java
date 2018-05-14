package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by padmaa on 08/05/18.
 */
public class BasePage {

    WebDriver driver = new FirefoxDriver();
    String testURL = "https://www.amazon.co.uk/";


    public void getURL(){
        driver.navigate().to(testURL);
    }

    public WebElement findElement(By by){
        WebElement element = driver.findElement(by);
        return element;
    }

    public void selectElement(By by, String text){
      Select select = new Select(findElement(by));
      select.selectByVisibleText(text);
    }



    public void pressEnter(By by){
        findElement(by).sendKeys(Keys.ENTER);
    }

    public void findEx(){

    }

}
