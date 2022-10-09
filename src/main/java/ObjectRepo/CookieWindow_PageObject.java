package ObjectRepo;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CookieWindow_PageObject {

    WebDriver driver;


    public CookieWindow_PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy(id="CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    WebElement Cookieaccept;

    @FindBy(xpath = "//*[@id=\"cb-confirmedSettings\"]/div/button")
    WebElement CookieDone;


     public void cookiesaccept(){
        Cookieaccept.click();
    }

     public void Cookie_Done(){

         CookieDone.click();
    }

}
