package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Journeyresults_PageObject {

    WebDriver driver;


    public Journeyresults_PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"full-width-content\"]/div/div[2]/div/h1/span")
    WebElement CaptureResult;

    @FindBy(xpath ="//*[@id=\"plan-a-journey\"]/div[1]/div[3]/a/span")
    WebElement editJourney;

    @FindBy(id= "plan-journey-button")
    WebElement updateJourney;

    @FindBy(linkText = "Clear From location")
    WebElement clearfrom;

    @FindBy(xpath = "//div[@class='info-message disambiguation']")
    WebElement Waringmessage;

    public String  capture_text(){

        String text_capture = CaptureResult.getText();
        return text_capture;


    }

    public void click_Editjourney(){

        editJourney.click();

    }

    public void updateJourney_Button(){
        updateJourney.click();
    }

    public void Clear_fromtxtfield(){
        clearfrom.click();
    }

    public boolean warning_message(){
        boolean message = Waringmessage.isDisplayed();
        return message;
    }

    public void gobacktohome(){
        driver.navigate().back();
    }
}
