package StepDefinitions;

import PageObjectModel.CheckoutPage;
import Utilities.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.security.auth.login.LoginContext;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Checkout extends CheckoutPage {
    //WebDriver driver=StepDefinitions.Login.driver;
    //JavascriptExecutor js= Login.js;
    @Then("User can able to view the Items with price and clicks on Items")
    public void userCanAbleToViewTheMenuItemsWithPrice() {
        //driver.findElement(By.xpath("//*[@class='wpmenucart-contents']")).click();
        itemMenu();
    }
    @Then("User can enter Coupon Code")
    public void userCanEnterCouponCode() {
        couponCode("IRFREESHIP");
    }
    @And("User click on Apply Coupon")
    public void userClickOnApplyCoupon() throws InterruptedException {
        applyCoupon();
    }
    @Then("User takes a screenshot of checkout page")
    public void userTakesAScreenshotAndStoresIt() throws IOException {
        /*TakesScreenshot ts=(TakesScreenshot)driver;
        //js.executeScript("window.scrollBy(0,250)");
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
        Random random = new Random();
        String name = "CheckOut"+random.nextInt()+".png".toString();
        File destinationFile=new File(System.getProperty("user.dir")+"//target//"+name);
        FileUtils.copyFile(srcFile,destinationFile);*/
        checkOutScreenShot("CheckOut","Items in Checkout");
    }

    @Then("User verify and clicks on Proceed to Checkout")
    public void userVerifyAndClicksOnProceedToCheckout() {
        proceedToCheckout();
    }
}
