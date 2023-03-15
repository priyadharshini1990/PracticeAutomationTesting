package StepDefinitions;

import PageObjectModel.ShopPage;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class ProductByCategory extends ShopPage {
    //WebDriver driver=StepDefinitions.Login.driver;
    //JavascriptExecutor js= Login.js;
    @Then("User select JavaScript under Product Categories")
    public void userSelectJavaScriptUnderProductCategories() throws InterruptedException {
        /*js.executeScript("window.scrollBy(0,30)");
        WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofSeconds(30));
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='JavaScript']")));
        driver.findElement(By.xpath("//*[text()='JavaScript']")).click();*/
        clickProductUnderCategories();
    }
    @Then("User can verify whether it displays JavaScript page")
    public void userCanVerifyWhetherItDisplaysJavasriptJSPage() {
        verifyProductsUnderCategories();
        /*List<WebElement> JSBooks=driver.findElements(By.xpath("//*[@id='content']/ul/li"));
        System.out.println( "Total no.of Books under JavaScript:  " +JSBooks.size());
        Assert.assertEquals("Counts are not matching",3,JSBooks.size());
       for (WebElement book:JSBooks){
            System.out.println("JavaScript Books are  "+book.getText());
            Assert.assertTrue("There is no such Book",book.getText().contains("JS")||book.getText().contains("JavaScript"));
       }*/
    }
    @Then("User takes a screenshot")
    public void userTakesAScreenshot() throws IOException {
        /*TakesScreenshot ts=(TakesScreenshot)driver;
        //js.executeScript("window.scrollBy(0,250)");
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
        Random random = new Random();
        String name = "Categories"+random.nextInt()+".png".toString();
        File destinationFile=new File(System.getProperty("user.dir")+"//target//"+name);
        FileUtils.copyFile(srcFile,destinationFile);*/
        shopScreenShot("Shop","Categorised Products");
    }

    @Then("User clicks on Add to basket button which adds that book to basket")
    public void userClicksOnAddToBasketButtonWhichAddsThatBookToBasket() throws InterruptedException {
        //js.executeScript("window.scrollBy(0,125)");
        //driver.findElement(By.xpath("//*[text()='Add to basket']")).click();
        addToBasket();
        System.out.println("Added item");
    }

    @Then("User should able to click on view Basket")
    public void userShouldAbleToClickOnViewBasket() {
        viewBasket();
    }

}
