package StepDefinitions;

import PageObjectModel.MyAccountPage;
import Utilities.CommonMethods;
import io.cucumber.java.en.Then;

public class LostPassword extends MyAccountPage {
    @Then("User clicks on Lost your password")
    public void userClicksOnLostYourPassword() {
        lostMyPassword();
    }
}
