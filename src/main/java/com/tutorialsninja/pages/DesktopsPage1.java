package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class DesktopsPage1 extends Utility {
        @CacheLookup
        @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currency ;
   // By currency = By.xpath("//span[contains(text(),'Currency')]");
    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'dropdown-menu']/li")
    List<WebElement>  listOfCurrency;
    //By listOfCurrency = By.xpath("//ul[@class = 'dropdown-menu']/li");

    //get from desktoppage
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement hp ;
   // By hp = By.xpath("//a[contains(text(),'HP LP3065')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement hPMessage;


    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")
    WebElement monthYear  ;
   // By monthYear = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement quantity ;
    //By quantity = By.xpath("//input[@id='input-quantity']");
    //clear quantity and add2
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement  addButton;
   // By addButton = By.xpath("//button[@id='button-cart']");
    @CacheLookup
    @FindBy(css = "siblbody:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismise")
    WebElement successMessage  ;
   // By successMessage = By.cssSelector("siblbody:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismise");
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement shoppingCart ;
   // By shoppingCart = By.xpath("//button[@id='button-cart']");
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartLink ;
   // By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),' (1.00kg)')]")
    WebElement shoppinCartMessage ;
   // By shoppinCartMessage = By.xpath("//h1[contains(text(),' (1.00kg)')]");
    @CacheLookup
    @FindBy(css = "div.container:nth-child(4) div.row div.col-sm-12 div.table-responsive table.table.table-bordered tbody:nth-child(2) tr:nth-child(1) td.text-left:nth-child(2) > a:nth-child(1)")
    WebElement productName ;
    //By productName = By.cssSelector("div.container:nth-child(4) div.row div.col-sm-12 div.table-responsive table.table.table-bordered tbody:nth-child(2) tr:nth-child(1) td.text-left:nth-child(2) > a:nth-child(1)");
    @CacheLookup
    @FindBy(css = "div.container:nth-child(4) div.row div.col-sm-12 div.table-responsive table.table.table-bordered tbody:nth-child(2) tr:nth-child(1) > td.text-left:nth-child(3)")
    WebElement model21 ;
   // By model21=By.cssSelector("div.container:nth-child(4) div.row div.col-sm-12 div.table-responsive table.table.table-bordered tbody:nth-child(2) tr:nth-child(1) > td.text-left:nth-child(3)");
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    WebElement total ;
   // By total=By.xpath("//tbody/tr[1]/td[6]");
   public void clickOnCurrencyButton() {
       Reporter.log(" Clicl on currency button"+currency.toString());
       clickOnElement(currency);
   }
    public void selectCurrencyFromDropDown() {
        Reporter.log("Select currency from drop down "+listOfCurrency.toString());
        //List<WebElement> currencyList = webElementList(listOfCurrency);
        for (WebElement e : listOfCurrency) {
            if (e.getText().equalsIgnoreCase("£ Pound Sterling")) {
                e.click();
                break;
            }
        }
    }
    public void clickOnHP() {

        Reporter.log("Click on HP"+hp.toString());
        clickOnElement(hp);
    }
    public String verifyHPMessage() {
        Reporter.log("Verify HP text "+hPMessage.toString());
        return getTextFromElement(hPMessage);
    }

    public void selectDeleveryDate() {
        Reporter.log("Select delivery date ");
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {

            String monthAndYear = monthYear.getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

    public void clearQuantityAndSendQuantity(String num) {
        Reporter.log("Add quantity"+quantity.toString());
        Actions actions = new Actions(driver);
        quantity.clear();
        //clickOnElement(quantity);
        sendTextToElement(quantity, num);
    }
    public void clickOnAddButton() {
        Reporter.log("Click on add button "+addButton.toString());
        clickOnElement(addButton);
    }

    public String verifySuccessfullMessage() {
        Reporter.log("Verify message "+successMessage.toString());
        return getTextFromElement(successMessage);
    }
    public void clickOnShoppingCart() {
        Reporter.log("Click on shopping cart "+shoppingCart.toString());
        clickOnElement(shoppingCart);
    }
    public void clickOnShoppingCartLink() {
        Reporter.log("Click on shopping cart link "+shoppingCartLink.toString());
        clickOnElement(shoppingCartLink);
    }
    public String verifyShoppinCartMessage() {
        Reporter.log("Verify shopping cart message "+shoppinCartMessage.toString());
        return getTextFromElement(shoppinCartMessage);
    }
    //HP LP3065
    public String verifyProductName() {
        Reporter.log("Verify product name "+productName.toString());
        return getTextFromElement(productName);
    }
    //Product 21
    public String verifyProduct21(){
        Reporter.log("Verify product model121"+model21.toString());
        return getTextFromElement(model21);
    }
    //£74.73
    public String verifyTotal(){
        Reporter.log("Verify total "+total.toString());
        return getTextFromElement(total);
    }
}
