package Utilities;

import io.cucumber.java.After;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverManagement {
private static WebDriver driver=null;
private static JavascriptExecutor js=null;
private static TakesScreenshot ts=null;

public static WebDriver getDriver() {
    if(driver==null){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Opened the Browser");
    }
    return driver;
}

public static JavascriptExecutor getJsDriver()
{
    if(driver==null)
        driver = getDriver();
    js = (JavascriptExecutor) driver;
    return js;
}

public static TakesScreenshot getTsDriver()
{
    if(driver==null)
        driver = getDriver();
    ts = (TakesScreenshot) driver;
    return ts;
}
@After
    public void tearDown(){
    driver.quit();
    driver=null;
}

}
