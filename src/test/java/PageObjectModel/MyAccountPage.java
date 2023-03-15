package PageObjectModel;
import StepDefinitions.Login;
import Utilities.CommonMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class MyAccountPage extends CommonMethods {
    private String MyAccountXpath="//*[text()='My Account']";
    private String UserNameXpath="//*[@id='username']";
    private String PasswordXpath="password";
    private String clickOnLoginXpath="//*[@name='login']";
    private String verifyAccountLoginXpath="//*[text()='trainingproject2']";
    private String enterEmailAddressXpath="//*[@id='reg_email']";
    private String enterPasswordForRegisterXpath="reg_password";
    private String clickOnRegisterXpath="//*[@name='register']";
    private String verifyAccountRegisterXpath="//*[text()='trainingproject12']";
    private String lostPasswordXpath="//*[text()='Lost your password?']";
    private String rememberMeXpath="//*[@id='rememberme']";
    //private String dashBoardMessage ="Message is not Displayed";

    /*public void Login() {
        enterUserName("abc");
        enterPassword("123");
        clickOnLogin();
    }
    public void Register(){
        enterEmailAddress("xyz");
        enterPasswordForRegister("789");
        clickOnRegister();
    }
    public void LostMyPassword(){}*/
    public void clickMyAccount(){
        clickAnElement(MyAccountXpath,"xpath");
    }

    public void enterUserName(String Username){
        //driver.findElement(By.xpath("//*[@id='username']")).sendKeys(Username);
        setText(UserNameXpath,"xpath",Username);
    }
    public void enterPassword(String Password){
        //driver.findElement(By.id("password")).sendKeys(Password);
        setText(PasswordXpath,"id",Password);
    }
    public void clickOnLogin(){
        //driver.findElement(By.xpath("//*[@name='login']")).click();
         clickAnElement(clickOnLoginXpath,"xpath");
    }

    public void verifyAccountLogin(String message){
        Boolean isDisplayed = isDisplayed(verifyAccountLoginXpath,"xpath");
        assertTrue(message,isDisplayed);
        //assertTrue(dashBoardMessage,isDisplayed);
        //Assert.assertTrue("Message is not Displayed",isDisplayed);
    }
    public void enterEmailAddress(String address){
        //WebElement email=driver.findElement(By.xpath("//*[@id='reg_email']"));
        //email.clear();
        //email.sendKeys("trainingproject3@gmail.com");
        //driver.findElement(By.xpath("//*[@id='reg_email']")).sendKeys(emailAddress);
        setText(enterEmailAddressXpath,"xpath",address);
    }
    public void enterPasswordForRegister(String Password) throws InterruptedException {
        //WebElement pass=driver.findElement(By.id("reg_password"));
        //pass.clear();
        //pass.sendKeys("Practice.automation@testing");
        //driver.findElement(By.id("reg_password")).sendKeys(Password);
        setText(enterPasswordForRegisterXpath,"id",Password);
        //Thread.sleep(5000);
    }
    public void clickOnRegister()  {
        //driver.findElement(By.xpath("//*[@name='register']")).click();
        clickAnElement(clickOnRegisterXpath,"xpath");
        //driver.switchTo().defaultContent();

    }
    public void verifyAccountRegister(String message){
        Boolean isDisplayed = isDisplayed(verifyAccountRegisterXpath,"xpath");
        assertTrue(message,isDisplayed);
    }
    public void lostMyPassword(){
        clickAnElement(lostPasswordXpath,"xpath");
    }
    public void rememberMe(){
        clickAnElement(rememberMeXpath,"xpath");
    }

    public void myAccountScreenShot(String module,String name) throws IOException {
        screenShot(module,name);

    }
}
