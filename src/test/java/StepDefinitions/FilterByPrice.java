package StepDefinitions;

import PageObjectModel.ShopPage;
import Utilities.CommonMethods;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class FilterByPrice extends ShopPage {
    //WebDriver driver=StepDefinitions.Login.driver;
    JavascriptExecutor js= Login.js;
    @Then("User apply filter by Price")
    public void userApplyFilterByPrice()
    {
        /*//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //WebElement slider=driver.findElement(By.xpath("//*[@class='ui-slider-range ui-corner-all ui-widget-header']"));
        Actions act=new Actions(driver);
        act.moveToElement(slider).dragAndDropBy(slider,25,0).build().perform();
        driver.findElement(By.xpath("//*[text()='Filter']")).click();*/
        applyFilter();
        System.out.println("Applied filter by Price");
    }
    @Then("User can verify whether it navigates to particular page")
    public void userCanVerifyWhetherItNavigatesToParticularPage()
        {
            List<WebElement> filterBooks=driver.findElements(By.xpath("//*[@id='content']/ul/li"));
            System.out.println( "Total no.of Books under 400 to 500:  " +filterBooks.size());
            Assert.assertEquals("Counts are not matching",3,filterBooks.size());
            for (WebElement books:filterBooks)
            {
                System.out.println("Books under 400 to 500 are  "+books.getText());
            }
        }
        @Then("User takes a screenshot and stores it")
    public void userTakesAScreenshotAndStoresIt() throws IOException
    {
        /*TakesScreenshot ts=(TakesScreenshot)driver;
        //js.executeScript("window.scrollBy(0,250)");
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
        Random random = new Random();
        String name = "filterpage"+random.nextInt()+".png".toString();
        File destinationFile=new File(System.getProperty("user.dir")+"//target//"+name);
        FileUtils.copyFile(srcFile,destinationFile);*/
        shopScreenShot("Shop","Filtered by price");
    }

    @Then("User clicks on filter")
    public void userClicksOnFilter() {
      clickOnFilter();
    }
}
