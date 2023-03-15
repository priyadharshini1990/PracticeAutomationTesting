package StepDefinitions;

import PageObjectModel.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WindowType;

public class RememberMe extends MyAccountPage {
    @Then("User clicks on RememberMe checkbox")
    public void userClicksOnRememberMeCheckbox() {
        rememberMe();
    }

    @Then("User opens the new tab and enters URL {string}")
    public void userOpensTheNewTabAndEntersURL(String url) {
        driver.switchTo().newWindow(WindowType.TAB);
        get(url);
    }
}
