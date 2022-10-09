package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class planaJourney_PageObject {

    WebDriver driver;


    public planaJourney_PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "InputFrom")
    WebElement fromTextBox;

    @FindBy(id ="InputTo")
    WebElement toTextBox;

    @FindBy(id= "plan-journey-button")
    WebElement planmyJourneybutton;

    @FindBy(id="CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    WebElement Cookieaccept;

    @FindBy(id="InputTo-error")
    WebElement toerror;

    @FindBy(id="InputFrom-error")
    WebElement fromError;

    @FindBy(linkText = "Recents")
    WebElement recent;

    //*[@id="cb-buttons"]/button

    public void enter_From(String fromfield){

        fromTextBox.clear();
        fromTextBox.sendKeys(fromfield);

    }

    public void enter_To(String tofield){
        toTextBox.sendKeys(tofield);
    }

    public void submit_Button(){
        planmyJourneybutton.click();
    }

    public void cookiesaccept(){
        Cookieaccept.click();
    }

    public String capture_Toerror(){
        return  toerror.getText();
    }

    public String capture_fromError(){
        return fromError.getText();
    }
    public void click_recent(){
        recent.click();
    }
}
