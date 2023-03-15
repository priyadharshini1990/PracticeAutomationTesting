package PageObjectModel;

import Utilities.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class CheckoutPage extends CommonMethods {
    private String itemMenuXpath="//*[@class='wpmenucart-contents']";
    private String couponCodeXpath="//*[@id='coupon_code']";
    private String applyCouponXpath="//*[@name='apply_coupon']";
    private String checkOutXpath="//*[@class='checkout-button button alt wc-forward']";
    /*public void userApplyCoupon(){
        clickOnItemMenu();
        applyCouponCode();
        clickApplyCoupon();
    }
    public void Checkout(){
        clickOnProceedToCheckout();
    }*/
 public void itemMenu(){
        clickAnElement(itemMenuXpath,"xpath");
 }
 public void couponCode(String text){
        setText(couponCodeXpath,"xpath",text);
 }
 public void applyCoupon() throws InterruptedException {
        clickAnElement(applyCouponXpath,"xpath");
        Thread.sleep(1000);
 }
 public void proceedToCheckout(){
        js.executeScript("window.scrollBy(0,400)");
        clickAnElement(checkOutXpath,"xpath");
 }
    public void checkOutScreenShot(String module,String name) throws IOException {
        screenShot(module,name);
    }


}
