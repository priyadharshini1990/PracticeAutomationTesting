package PageObjectModel;

import Utilities.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class PlaceOrderPage extends CommonMethods {
    private String enterFirstNameXpath="//*[@id='billing_first_name']";
    private String enterLastNameXpath="//*[@id='billing_last_name']";
    private String enterCompanyNameXpath="//*[@id='billing_company']";
    private String enterPhoneNoXpath="//*[@id='billing_phone']";
    private String enterStreetAddressXpath="//*[@id='billing_address_1']";
    private String enterApartmentXpath="//*[@id='billing_address_2']";
    private String enterCityXpath="//*[@id='billing_city']";
    private String enterZipCodeXpath="//*[@id='billing_postcode']";
    private String clickPaymentOptionXpath="//*[@id='payment_method_cod']";
    private String clickPlaceOrderXpath="//*[@id='place_order']";
    private String verifyPlaceOrderXpath="//*[text()='Billing Address']";
    private String checkOutXpath="//*[@class='checkout-button button alt wc-forward']";

    /*public enterBillingDetails(){
        enterFirstName();
        enterLastName();
        enterCompanyName();
        enterPhoneNo();
        enterStreetAddress();
        enterApartment();
        enterCity();
        enterZipCode();
        additionalInformation();
        clickPaymentOption();
        click placeOrder();
    }  */
    public void enterFirstName(String firstName){
        clear(enterFirstNameXpath);
        setText(enterFirstNameXpath,"xpath",firstName);
    }
    public void enterLastName(String lastName){
        clear(enterLastNameXpath);
        setText(enterLastNameXpath,"xpath",lastName);
    }
    public void enterCompanyName(String companyName ){
        clear(enterCompanyNameXpath);
        setText(enterCompanyNameXpath,"xpath",companyName);
    }
    public void enterPhoneNo(String phoneNo){
        clear(enterPhoneNoXpath);
        setText(enterPhoneNoXpath,"xpath",phoneNo);
    }
    public void enterStreetAddress(String streetAddress){
        clear(enterStreetAddressXpath);
        setText(enterStreetAddressXpath,"xpath",streetAddress);
    }
    public void enterApartment(String apartment){
        clear(enterApartmentXpath);
        setText(enterApartmentXpath,"xpath",apartment);
    }
    public void enterCity(String city){
        clear(enterCityXpath);
        setText(enterCityXpath,"xpath",city);
    }
    public void enterZipCode(String zipCode){
        clear(enterZipCodeXpath);
        setText(enterZipCodeXpath,"xpath",zipCode);
        //js.executeScript("window.scrollBy(0,100)");
    }
    public void proceedToCheckout(){
        js.executeScript("window.scrollBy(0,400)");
        clickAnElement(checkOutXpath,"xpath");
    }
    public void clickPaymentOption() throws InterruptedException {
        js.executeScript("window.scrollBy(0,700)");
        //Thread.sleep(1000);
        clickAnElement(clickPaymentOptionXpath,"xpath");
    }
    public void clickPlaceOrder(){
        clickAnElement(clickPlaceOrderXpath,"xpath");
    }
    public void verifyPlaceOrder(){
        js.executeScript("window.scrollBy(0,70)");
        Boolean assertion=isDisplayed(verifyPlaceOrderXpath,"xpath");
        assertTrue("Order not placed",assertion);
    }
    public void placeOrderScreenShot(String module,String name) throws IOException {
        screenShot(module,name);
    }



}

