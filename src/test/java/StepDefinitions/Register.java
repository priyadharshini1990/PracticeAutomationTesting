package StepDefinitions;

import PageObjectModel.MyAccountPage;
import StepDefinitions.Login;
import Utilities.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Register extends MyAccountPage {
        JavascriptExecutor js= Login.js;
    //MyAccountPage account=new MyAccountPage();
    @Then("User can able to enter Register Email address")
    public void userCanAbleToEnterRegisterEmailAddress() {
        enterEmailAddress("trainingproject12@gmail.com");
    }
    @And("password")
    public void password() throws InterruptedException {
        enterPasswordForRegister("Dharshini@23");
        //Thread.sleep(5000);
    }
    @Then("User clicks on Register Button")
    public void userClicksOnRegisterButton()  {
         clickOnRegister();
        System.out.println("Registered");
    }
    @When("User registered verify it displays Dashboard")
    public void userRegisteredVerifyItDisplaysDashboard() throws InterruptedException {
        /*Boolean dashBoard=driver.findElement(By.xpath("//*[text()='trainingproject3']")).isDisplayed();
        Assert.assertTrue("Element is not present",dashBoard);
        Thread.sleep(1000);*/
        verifyAccountRegister("Register Assertion is not Matched");
    }
}
