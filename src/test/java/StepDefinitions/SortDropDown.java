package StepDefinitions;

import PageObjectModel.ShopPage;
import StepDefinitions.Login;
import Utilities.CommonMethods;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class SortDropDown extends ShopPage {
    //WebDriver driver=StepDefinitions.Login.driver;
    //JavascriptExecutor js= Login.js;
    @Then("User selects based on Newness from sorting dropdown")
    public void userSelectsBasedOnNewnessFromSortingDropdown() {
        /*js.executeScript("window.scrollBy(0,40)");
        WebElement sortOptions= driver.findElement(By.xpath("//*[@name='orderby']"));
        System.out.println("Sorting Options are:  "+sortOptions.getText());
        Select drop=new Select(sortOptions);
        drop.selectByIndex(3);*/
        sortDropDown(3);

    }
    @Then("User selects based on Popularity from sorting dropdown")
    public void userSelectsBasedOnPopularityFromSortingDropdown() {
        /*js.executeScript("window.scrollBy(0,40)");
        WebElement sortOptions= driver.findElement(By.xpath("//*[@name='orderby']"));
        System.out.println("Sorting Options are:  "+sortOptions.getText());
        Select drop=new Select(sortOptions);
        drop.selectByIndex(1);*/
        sortDropDown("Sort by popularity");
    }
    @Then("User selects based on AverageRating from sorting dropdown")
    public void userSelectsBasedOnAverageRatingFromSortingDropdown() {
        /*js.executeScript("window.scrollBy(0,40)");
        WebElement sortOptions= driver.findElement(By.xpath("//*[@name='orderby']"));
        System.out.println("Sorting Options are:  "+sortOptions.getText());
        Select drop=new Select(sortOptions);
        drop.selectByIndex(2);*/
        sortDropDown("rating");
    }
}
