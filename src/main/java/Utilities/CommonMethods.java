package Utilities;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class CommonMethods {
    protected static WebDriver driver;
    protected static JavascriptExecutor js;
    protected static TakesScreenshot ts;
    //DriverManagement dm;
    //dm.getDriver
    public CommonMethods(){
        driver=DriverManagement.getDriver();
        js=DriverManagement.getJsDriver();
        ts= DriverManagement.getTsDriver();
    }

    public void clickAnElement(String locator,String locatorType){
        if(locatorType.equals("xpath"))
        {
            driver.findElement(By.xpath(locator)).click();
        } else if (locatorType.equals("id")) {
            driver.findElement(By.id(locator)).click();
        }else if (locatorType.equals("name")) {
            driver.findElement(By.name(locator)).click();
        }else if (locatorType.equals("tagName")) {
            driver.findElement(By.tagName(locator)).click();
        }else if (locatorType.equals("class")) {
            driver.findElement(By.className(locator)).click();
        }else if (locatorType.equals("cssSelector")) {
            driver.findElement(By.cssSelector(locator)).click();
        }else if (locatorType.equals("linkText")) {
            driver.findElement(By.linkText(locator)).click();
        }else if (locatorType.equals("partialLinkText")) {
            driver.findElement(By.partialLinkText(locator)).click();
        }
        else
        {
            System.out.println("Unable to find the Locator Type");
        }
    }

    public void setText(String locator,String locatorType,String text){
        if(locatorType.equals("xpath"))
        {
            driver.findElement(By.xpath(locator)).sendKeys(text);
        } else if (locatorType.equals("id")) {
            driver.findElement(By.id(locator)).sendKeys(text);
        }else if (locatorType.equals("name")) {
            driver.findElement(By.name(locator)).sendKeys(text);
        }else if (locatorType.equals("tagName")) {
            driver.findElement(By.tagName(locator)).sendKeys(text);
        }else if (locatorType.equals("class")) {
            driver.findElement(By.className(locator)).sendKeys(text);
        }else if (locatorType.equals("cssSelector")) {
            driver.findElement(By.cssSelector(locator)).sendKeys(text);
        }else if (locatorType.equals("linkText")) {
            driver.findElement(By.linkText(locator)).sendKeys(text);
        }else if (locatorType.equals("partialLinkText")) {
            driver.findElement(By.partialLinkText(locator)).sendKeys(text);
        }
        else
        {
            System.out.println("Unable to find the Locator Type");
        }

    }
    public void switchToFrameWithNames(String name){
        driver.switchTo().frame(name);
    }
    public void switchToFrameWithId(String id){
        driver.switchTo().frame(id);
    }
    public void switchToDefaultContent(){
        driver.switchTo().defaultContent();
    }
    public void get(String Url){
        driver.get(Url);
    }
    public void close(){
        driver.quit();
    }
    //driver.switchTo.defaultContent();
    public void dragAndDrop(String locator)
    {
        WebElement slider=driver.findElement(By.xpath(locator));
        Actions act=new Actions(driver);
        act.moveToElement(slider).dragAndDropBy(slider,20,50).build().perform();
    }
    public void moveToElement(String locator,String locatorType) throws InterruptedException
    {
        WebElement elementToClick=driver.findElement(By.xpath(locator));
        Actions move=new Actions(driver);
        move.moveToElement(elementToClick).click();
    }
    public void selectDropDown(String locator,String locatorType,int index)
    {
        WebElement select=driver.findElement(By.xpath(locator));
        Select dropDown=new Select(select);
        dropDown.selectByIndex(index);
    }
    public void selectDropDown(String locator,String locatorType,String visibleText)
    {
        WebElement select=driver.findElement(By.xpath(locator));
        Select dropDown=new Select(select);
        dropDown.selectByVisibleText(visibleText);
    }
   public void selectDropDown(String locator,String value)
    {
        WebElement select=driver.findElement(By.xpath(locator));
        Select dropDown=new Select(select);
        dropDown.selectByValue(value);
    }
    public Boolean isDisplayed(String locator,String locatorType){
        return driver.findElement(By.xpath(locator)).isDisplayed();
    }
    public void assertTrue(String message,Boolean isDisplayed)
    {
        Assert.assertTrue(message,isDisplayed);
    }
    /*public void assertTrue(String message,Boolean assertion,String locator){
        return Assert.assertTrue(message,driver.findElement(By.xpath(locator)).isDisplayed();
    }*/
    public void assertEquals(String locator,String locatorType,String message,int expected)
    {
        List<WebElement> actual= driver.findElements(By.xpath(locator));
        Assert.assertEquals(message,expected,actual.size());
        //Assert.assertEquals(message,expected,driver.findElement(By.xpath(locator));
    }
    public void clear(String locator){
        driver.findElement(By.xpath(locator)).clear();
    }
    public void screenShot(String module,String name) throws IOException {
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
        Random random = new Random();
        String fileName = module+"_"+name+"_"+random.nextInt()+".png".toString();
        File destinationFile=new File(System.getProperty("user.dir")+"//target//"+fileName);
        FileUtils.copyFile(srcFile,destinationFile);
    }
       }
