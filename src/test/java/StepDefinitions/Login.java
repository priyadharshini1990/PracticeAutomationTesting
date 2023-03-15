package StepDefinitions;

import PageObjectModel.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

public class Login extends MyAccountPage{
   //public static WebDriver driver;
    //public static MyAccountPage account;
    @Then("User opens the Browser")
    public void userOpensTheBrowser() {
        /*driver = new ChromeDriver();
        js=(JavascriptExecutor)driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));*/
        System.out.println("Opened the Browser");
    }
    @Then("User enters URL {string},application page should be displayed")
    public void userEntersURLApplicationPageShouldBeDisplayed(String Url) {
        //driver.get("https://practice.automationtesting.in/");
        get(Url);
        System.out.println("Opened URL");
    }
    @Then("User clicks on My Account Menu")
    public void userClicksOnMyAccountMenu() {
        //driver.findElement(By.xpath("//*[text()='My Account']")).click();
        clickMyAccount();
    }
    @Then("User Close the ad and return to default content")
    public void userCloseTheAdAndReturnToDefaultContent() {
        JavascriptExecutor js1= (JavascriptExecutor)driver;
        String currentFrameName1= (String) js1.executeScript("return self.name");
        System.out.println(currentFrameName1);
        if (driver.findElements(By.xpath("//*[text()='Register']")).size()>0){ }
        else
        {
            System.out.println("in Else block");
            try {
                JavascriptExecutor js= (JavascriptExecutor)driver;
                String currentFrameName= (String) js.executeScript("return self.name");
                System.out.println(currentFrameName);
                /*driver.switchTo().frame("aswift_7");
                driver.switchTo().frame("ad_iframe");
                driver.findElement(By.id("dismiss-button")).click();
                driver.switchTo().defaultContent();*/
                switchToFrameWithNames("aswift_8");
                switchToFrameWithNames("ad_iframe");
                clickAnElement("dismiss-button","id");
                System.out.println("Closed the ad");
                System.out.println("Executed Try block");
            }
            catch(Exception ex) {
                System.out.println("Executing in Catch block");
                JavascriptExecutor js= (JavascriptExecutor)driver;
               String currentFrameName= (String) js.executeScript("return self.name");
                System.out.println(currentFrameName);
                switchToFrameWithNames("aswift_7");
                switchToFrameWithNames("ad_iframe");
                clickAnElement("dismiss-button","id");
                System.out.println("Closed the ad");
                switchToDefaultContent();
            }

        }
    }
    @Then("User can able to enter email address {string}")
    public void userCanAbleToEnterEmailAddress(String email) {
        /*driver.findElement(By.xpath("//*[@id='username']")).sendKeys(email);
        System.out.println("Email "+email);
        account.enterUserName(email);*/
        enterUserName(email);
    }
    @And("Password {string}")
    public void password(String password) {
       //driver.findElement(By.id("password")).sendKeys("Practice.automation@testing");
       enterPassword(password);
    }
    @Then("User clicks on Login Button")
    public void userClicksOnLoginButton() {
        clickOnLogin();
        System.out.println("Logged in");
    }
    @When("User logged in verify it displays Dashboard")
    public void userLoggedInVerifyWhetherItNavigateToDashboard() throws InterruptedException {
        /*Boolean dashBoard=driver.findElement(By.xpath("//*[text()='trainingproject2']")).isDisplayed();
        Assert.assertTrue("Element is not present",dashBoard);
        Thread.sleep(1000);*/
        verifyAccountLogin("Login Assertion is not matched");
    }
    @Then("User takes a screenshot of Login Page")
    public void userTakesAScreenshotAndStoresIt() throws IOException {
        /*TakesScreenshot ts=(TakesScreenshot)driver;
        //js.executeScript("window.scrollBy(0,250)");
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
        Random random = new Random();
        String name = "Login"+random.nextInt()+".png".toString();
        File destinationFile=new File(System.getProperty("user.dir")+"//target//"+name);
        FileUtils.copyFile(srcFile,destinationFile);*/
        myAccountScreenShot("MyAccount","Login Dashboard");
    }
    @And("User close the Browser")
    public void userCloseTheBrowser() {
        //driver.close();
        close();
    }
}
