package StepDefinitions;

import PageObjectModel.MyAccountPage;
import PageObjectModel.ShopPage;
import StepDefinitions.Login;
import Utilities.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Shop extends ShopPage {
    //WebDriver driver=StepDefinitions.Login.driver;
    //JavascriptExecutor js= Login.js;
    MyAccountPage accountPage=new MyAccountPage();
    @When("Logged in, User clicks on shop menu")
    public void loggedInUserClicksOnShopMenu() {
        //WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofSeconds(30));
        //explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Shop']")));
        //driver.findElement(By.xpath("//*[text()='Shop']")).click();
        userClicksOnShopMenu();

        if(driver.findElements(By.xpath("//*[text()='Home']")).size()>0){} //Do Nothing
        else
        {
            /*driver.switchTo().frame("aswift_3");
            driver.switchTo().frame("ad_iframe");
            driver.findElement(By.id("dismiss-button")).click();
            System.out.println("Closed the ad");
            driver.switchTo().defaultContent();*/
            switchToFrameWithNames("aswift_3");
            switchToFrameWithNames("ad_iframe");
            clickAnElement("dismiss-button","id");
            switchToDefaultContent();
        }
    }
    @Then("User can able to enter Username {string}")
    public void userCanAbleToEnterUsername(String username) {
        accountPage.enterUserName(username);
    }
    @And("password {string}")
    public void password(String password) {
        accountPage.enterPassword(password);
    }
    @Then("User clicks on Add to Basket button which adds that book to Basket")
    public void userClicksOnAddToBasketButtonWhichAddsThatBookToBasket() throws InterruptedException {
        //js.executeScript("window.scrollBy(0,1200)");
        //driver.findElement(By.xpath("//*[text()='Add to basket']")).click();
        //addToBasket();
        addToBasketByShop();
        System.out.println("Added item");
    }
    @When("User add the item to Basket,it displays view basket to verify")
    public void userAddTheItemToBasketUserShouldAbleToClickOnViewBasketToVerify() throws InterruptedException {
        /*Boolean viewBasket=driver.findElement(By.xpath("//*[text()='View Basket']")).isDisplayed();
        Assert.assertTrue("Item not Added to Basket",viewBasket);*/
        viewBasketVerify("View Basket is not Displayed");
    }



}
