package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;

public class PlanaJourney_StepDef {

    @Given("User is on the Plan a Journey page")
    public void user_is_on_the_plan_a_journey_page() throws IOException {
        Base.driverpreReq();
        Base.cookie_repo.cookiesaccept();
        Base.cookie_repo.Cookie_Done();
    }
    @When("User enter From {string} and To {string}")
    public void user_enter_from_and_to(String string, String string2) {
        Base.planjourney_repo.enter_From(string);
        Base.planjourney_repo.enter_To(string2);


    }
    @When("Click on the Plan my journey button")
    public void click_on_the_plan_my_journey_button() {
        Base.planjourney_repo.submit_Button();

    }
    @Then("User is on the Journey results page")
    public void user_is_on_the_journey_results_page() {

        String Actualvalue= Base.journey_repo.capture_text();
        Assert.assertEquals("Journey results",Actualvalue);

    }

    @Then("Error message should be shown on both fields")
    public void errorMessageShouldBeShownOnBothFields() {

        String fromerror=Base.planjourney_repo.capture_fromError();
        Assert.assertEquals("The From field is required.",fromerror);

        String toerror = Base.planjourney_repo.capture_Toerror();
        Assert.assertEquals("The To field is required.",toerror);

    }

    @When("Click on the Edit journey button")
    public void clickOnTheEditJourneyButton() {
        Base.journey_repo.click_Editjourney();
    }

    @When("Click on the Edit journey button and update From {string} field")
    public void clickOnTheEditJourneyButtonAndUpdateFromField(String arg0) {
        Base.journey_repo.click_Editjourney();
        Base.journey_repo.Clear_fromtxtfield();
        Base.planjourney_repo.enter_From(arg0);
    }

    @And("Click on the Update Journey button")
    public void clickOnTheUpdateJourneyButton() {
        Base.journey_repo.updateJourney_Button();
    }

    @Then("Journey details updated")
    public void journeyDetailsUpdated() {

     //    Assert.assertTrue(Base.journey_repo.warning_message());

    }

    @And("click on Recent Section")
    public void clickOnRecentSection() {
        Base.planjourney_repo.click_recent();
    }

    @Then("Recent list should be shown")
    public void recentListShouldBeShown() {

       Assert.assertNotNull(Base.driver.findElement(By.xpath("//*[@id=\"jp-recent-content-jp-\"]/p[1]")).getText());
    }

    @And("Go back to home page")
    public void goBackToHomePage() throws InterruptedException {
       Base.journey_repo.gobacktohome();

    }
}
