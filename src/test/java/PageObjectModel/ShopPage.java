package PageObjectModel;

import Utilities.CommonMethods;

import javax.xml.xpath.XPath;
import java.io.IOException;

public class ShopPage extends CommonMethods {
    private String shopMenuXpath="//*[text()='Shop']";
    private String applyFilterXpath="//*[@class='ui-slider-range ui-corner-all ui-widget-header']";
    private String clickOnFilterXpath="//*[text()='Filter']";
    private String clickProductXpath="//*[text()='JavaScript']";
    private String verifyProductsUnderCategoriesXpath="//*[@id='content']/ul/li";
    private String clickAddToBasketXpath="//*[text()='Add to basket']";
    private String viewBasketXpath="//*[text()='View Basket']";
    private String sortDropDownXpath="//*[@name='orderby']";
    private String viewBasketVerifyXpath="//*[text()='View Basket']";
    /*public void filterByPrice(){
        dragAndDrop("x,y");
        clickOnFiter();
        clickOnProducts();
        clickOnViewBasket();
    }
    public void productCategories(){
        clickOnProducts();
        ClickOnViewBasket();
    }
    public void shop(){
        clickOnProducts();
        clickOnViewBasket();
    }*/
    public void userClicksOnShopMenu(){
        clickAnElement(shopMenuXpath,"xpath");
    }
    public void addToBasketByShop(){
        js.executeScript("window.scrollBy(0,1200)");
        clickAnElement(clickAddToBasketXpath,"xpath");

    }
    public void applyFilter(){
        dragAndDrop(applyFilterXpath);
    }
    public void clickOnFilter(){
        clickAnElement(clickOnFilterXpath,"xpath");
   }
      public void clickProductUnderCategories() throws InterruptedException {
        //moveToElement(clickProductXpath,"xpath");
       js.executeScript("window.scrollBy(0,50)");
       clickAnElement(clickProductXpath,"xpath");
   }
   public void verifyProductsUnderCategories(){
        assertEquals(verifyProductsUnderCategoriesXpath,"xpath","Counts are not matching",3);
   }
   public void addToBasket() throws InterruptedException {
       //Thread.sleep(1000);
       //moveToElement(clickAddToBasketXpath,"xpath");
       js.executeScript("window.scrollBy(0,125)");
       clickAnElement(clickAddToBasketXpath,"xpath");
   }
   public void viewBasketVerify(String message) throws InterruptedException {
        //Thread.sleep(1000);
        Boolean basketVerify=isDisplayed(viewBasketVerifyXpath,"xpath");
        assertTrue(message,basketVerify);

   }
   public void viewBasket(){
       clickAnElement(viewBasketXpath,"xpath");
   }

   public void sortDropDown(int index){
       //js.executeScript("window.scrollBy(0,40)");
       selectDropDown(sortDropDownXpath,"xpath",index);
   }
    public void sortDropDown(String visibleTextOrValue){
        js.executeScript("window.scrollBy(0,40)");
        selectDropDown(sortDropDownXpath,"xpath",visibleTextOrValue);
    }
    /*public void sortDropDown(String value){
        js.executeScript("window.scrollBy(0,40)");
        selectDropDown(sortDropDownXpath,value);
    }*/
    public void shopScreenShot(String module,String name) throws IOException {
        screenShot(module,name);
    }

}
