package StepDefinitions;

import PageObjectModel.PlaceOrderPage;
import StepDefinitions.Login;
import Utilities.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class PlaceOrder extends PlaceOrderPage {

    /*@Then("User clicks on Proceed to Checkout")
    public void userClicksOnProceedToCheckout() {
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//*[@class='checkout-button button alt wc-forward']")).click();
        System.out.println("Able to check out");
    }*/
    @Then("User enter FirstName")
    public void userEnterFirstName() {
        enterFirstName("Saran");
    }
    @And("LastName")
    public void lastName() {
        enterLastName("Ram");
    }
    @And("CompanyName")
    public void companyName() {
        enterCompanyName("Tanu");
    }
    @And("PhoneNumber")
    public void phoneNumber() {
        enterPhoneNo("1234567890");
    }
    @And("Street Address")
    public void streetAddress() {
        enterStreetAddress("ValleyRanch");
    }
    @And("Apartment")
    public void apartment() {
        enterApartment("West");
    }
    @And("City")
    public void city() {
        enterCity("Irving");
    }
    @And("Zipcode")
    public void zipcode() {
        enterZipCode("75063");
    }
    /*@Then("User should verify Billing Details and Your Order")
    public void userShouldVerifyBillingDetailsAndYourOrder()
    {
        Boolean user=driver.findElement(By.xpath("//*[@value='Saranya']")).isDisplayed();
        Assert.assertTrue("No Such User Found",user);
    }*/
    @Then("User clicks on Proceed to Checkout")
    public void userCanVerifyAndClicksOnProceedToCheckout() throws InterruptedException {
        /*js.executeScript("window.scrollBy(0,400)");
        driver.findElement(By.xpath("//*[@class='checkout-button button alt wc-forward']")).click();*/
        proceedToCheckout();
        System.out.println("Able to check out");
    }
    @And("User should able to select payment option")
    public void userShouldAbleToSelectPaymentOption() throws InterruptedException {
        /*js.executeScript("window.scrollBy(0,1300)");
        driver.findElement(By.xpath("//*[@id='payment_method_cod']")).click();*/
        clickPaymentOption();
    }
    @Then("User should click on Place Order button")
    public void userShouldClickOnPlaceOrderButton()
    {
        //driver.findElement(By.xpath("//*[@id='place_order']")).click();
        clickPlaceOrder();
        System.out.println("Placed an Order");
    }
    @When("Order placed user can verify")
    public void orderPlacedUserCanVerifyWithOrderNumber()
    {
     /*js.executeScript("window.scrollBy(0,70)");
    Boolean billing=driver.findElement(By.xpath("//*[text()='Billing Address']")).isDisplayed();
    Assert.assertTrue("No Order Placed",billing);*/
        verifyPlaceOrder();
    }
    @Then("User takes a screenshot of Placed order page")
    public void userTakesAScreenshotOfPlacedOrderPage() throws IOException {
        /*TakesScreenshot ts=(TakesScreenshot)driver;
        //js.executeScript("window.scrollBy(0,250)");
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
        Random random = new Random();
        String name = "PlacedOrder"+random.nextInt()+".png".toString();
        File destinationFile=new File(System.getProperty("user.dir")+"//target//"+name);
        FileUtils.copyFile(srcFile,destinationFile);*/
        placeOrderScreenShot("PlaceOrder","Order Details");
    }


}
