package StepDefinitions;

import PageObjectModel.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RememberMe extends MyAccountPage {
    @Then("User clicks on RememberMe checkbox")
    public void userClicksOnRememberMeCheckbox() {
        rememberMe();
    }
    @Then("User opens the new tab")
    public void userOpensTheNewTab() {
        driver.switchTo().newWindow(WindowType.TAB);
    }
    @Then("User switch to previous window and closed it")
    public void userSwitchToPreviousWindowAndClosedIt() {
        Set<String> windowsID=driver.getWindowHandles();
        List<String> id=new ArrayList(windowsID);
       String window1=id.get(0);
       String window2=id.get(1);
       driver.switchTo().window(window1).close();
       driver.switchTo().window(window2).getTitle();
       }


}
