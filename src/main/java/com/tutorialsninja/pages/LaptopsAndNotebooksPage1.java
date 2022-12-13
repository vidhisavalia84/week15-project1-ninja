package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LaptopsAndNotebooksPage1 extends Utility {
    //get cuttency from desktoppage1
    //select(reuse code)laptopsAndNotebooks and allLaptops from laptopsAndNotebookspage
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortBy;
    //By sortBy = By.id("input-sort");
    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement macBook;
    //By macBook = By.linkText("MacBook");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'MacBook')]")
    WebElement macBookMessage;
    // By macBookMessage = By.xpath("//h1[contains(text(),'MacBook')]");

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement cartButton;
    // By cartButton = By.xpath("//button[@id='button-cart']");

    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement successMessage;
    //By successMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;
    // By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),' (0.00kg)')]")
    WebElement shoppingCartMessage;
    //By shoppingCartMessage = By.xpath("//h1[contains(text(),' (0.00kg)')]");

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement macBookText;
    //By macBookText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement quantity;
    // By quantity = By.xpath("//input[contains(@name, 'quantity')]");

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement update;
    //By update = By.xpath("//button[contains(@data-original-title, 'Update')]");

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement modifiedMessage;
    //By modifiedMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    WebElement text;
    // By text = By.xpath("//tbody/tr[1]/td[6]");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement textCheckout;
    //By textCheckout = By.xpath("//a[contains(text(),'Checkout')]");

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement newCustomer;
    // By newCustomer = By.xpath("//h2[contains(text(),'New Customer')]");

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]/input[1]")
    WebElement guestRadioButton;
    //By guestRadioButton = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]/input[1]");

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continue1;
    // By continue1 = By.xpath("//input[@id='button-account']");

    @CacheLookup
    @FindBy(id = "input-payment-firstname")
    WebElement firstName;
    // By firstName = By.id("input-payment-firstname");

    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lastName;
    //By lastName = By.id("input-payment-lastname");

    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement email;
    // By email = By.id("input-payment-email");

    @CacheLookup
    @FindBy(id = "input-payment-telephone")
    WebElement telephone;
    // By telephone = By.id("input-payment-telephone");

    @CacheLookup
    @FindBy(id = "input-payment-company")
    WebElement company;
    //By company = By.id("input-payment-company");

    @CacheLookup
    @FindBy(id = "input-payment-address-1")
    WebElement address;
    // By address = By.id("input-payment-address-1");

    @CacheLookup
    @FindBy(id = "input-payment-city")
    WebElement city;
    //By city = By.id("input-payment-city");

    @CacheLookup
    @FindBy(id = "input-payment-postcode")
    WebElement postcode;
    //By postcode = By.id("input-payment-postcode");

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement country;
    //By country = By.xpath("//select[@id='input-payment-country']");

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone'])")
    WebElement zone;
    //  By zone=By.xpath("//select[@id='input-payment-zone'])");
/* @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement zone;*/
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continue2;
    //By continue2 = By.xpath("//input[@id='button-guest']");

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]")
    WebElement termsAndCondition;
    // By termsAndCondition = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]");

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continue3;
    // By continue3=By.xpath("//input[@id='button-payment-method']");

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement lastMessage;
    //By lastMessage=By.xpath("//div[@class='alert alert-danger alert-dismissible']");

    public void selectPrice() {
        Reporter.log("Select option from drop down "+sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy, "Price (High > Low)");
    }
    public void clickOnSortBy() {
        Reporter.log("Select option from drop down "+sortBy.toString());
        sendTextToElement(sortBy, "Price (High > Low)");
    }
    public void clickOnMacBook() {
        Reporter.log("select Macbook"+macBook.toString());
        clickOnElement(macBook);
    }
    public String verifyMacBookMessage() {
        Reporter.log("Verify text "+macBookMessage.toString());
        return getTextFromElement(macBookMessage);
    }
    public void clickOnAddToCart() {
        Reporter.log("Click on add to cart "+cartButton.toString());
        clickOnElement(cartButton);
    }
    public String verifySuccessfulMessage() {
        Reporter.log("Verify text "+successMessage.toString());
        return getTextFromElement(successMessage);
    }
    public void clickOnShoppingCartLink() {
        Reporter.log("Click on shopping cart link"+shoppingCart.toString());
        clickOnElement(shoppingCart);
    }

    public String verifyShoppingCartMessage() {
        Reporter.log("Verify shopping cart message"+shoppingCartMessage.toString());
        return getTextFromElement(shoppingCartMessage);
    }

    public String verifyMacBookText() {
        Reporter.log("Verify mackbook text"+macBookText.toString());
        return getTextFromElement(macBookText);
    }

    public void clearQuantityAndSendQuantity(String num) {
        Reporter.log("Clear quantity and add quantity"+quantity.toString());
        Actions actions = new Actions(driver);
        quantity.clear();
        //clickOnElement(quantity);
        sendTextToElement(quantity, num);
    }

    public void clickOnUpadte() {
        Reporter.log("Click on update button "+update.toString());
        clickOnElement(update);
    }
    public String verifyModifiedMessage() {
        Reporter.log("Verify text"+modifiedMessage.toString());
        return getTextFromElement(modifiedMessage);
    }
    //$1,204.00
    public String verifyText() {
        Reporter.log("Verify text "+text.toString());
        return getTextFromElement(text);
    }
    public String verifyCheckOutText() {
        Reporter.log("Verify check out text"+textCheckout.toString());
        return getTextFromElement(textCheckout);
    }


    public void clickCheckout() {
        Reporter.log("Click on checkout"+textCheckout.toString());
        clickOnElement(textCheckout);
    }

    public String verifyTextNewCustomer() {
        Reporter.log("Verify text new customer"+newCustomer.toString());
        return getTextFromElement(newCustomer);
    }
    public void clickGuestRadioButton() {
        Reporter.log("Click on radio button "+guestRadioButton.toString());
        clickOnElement(guestRadioButton);
    }

    public void clickContinue1() {
        Reporter.log("Click on continue button"+continue1.toString());
        clickOnElement(continue1);
    }
    public void enterFirstName(String name) {
        Reporter.log("Enter first name"+firstName.toString());
        sendTextToElement(firstName, name);
    }
    public void enterLastName(String name) {
        Reporter.log("Enter last name"+lastName.toString());
        sendTextToElement(lastName, name);
    }

    public void enterEmail(String email1) {
        Reporter.log("Enter email "+email1.toString());
        sendTextToElement(email, email1);
    }
    public void enterTelephoneNumber(String num) {
        Reporter.log("Enter telephone "+telephone.toString());
        sendTextToElement(telephone, num);
    }
    public void enterCompanyName(String name) {
        Reporter.log("Enter company name "+company.toString());
        sendTextToElement(company, name);
    }

    public void enterAddress(String add) {
        Reporter.log("Enter address "+address.toString());
        sendTextToElement(address, add);
    }
    public void enterCity(String c) {
        Reporter.log("Enter city name "+city.toString());
        sendTextToElement(city, c);
    }
    public void enterPostcode(String num) {
        Reporter.log("Enter postcode "+postcode.toString());
        sendTextToElement(postcode, num);
    }

    public void selectCountry() {
        Reporter.log("Select country "+country.toString());
        selectByVisibleTextFromDropDown(country, "Antarctica");
    }
   /* @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement zone;*/
    public void selectZone() {
        Reporter.log("Select zone ");
        selectByVisibleTextFromDropDown(zone, "Berkshire");
    }

    public void clickOnContinue2() {
        Reporter.log("Click on continue");
        clickOnElement(continue2);
    }
    public void clickOnTermsAndCondition() {
        Reporter.log("Tick terms and condition checkbox"+termsAndCondition.toString());
        clickOnElement(termsAndCondition);
    }

    public void clickOnContinue3() {
        Reporter.log("Click on continue"+continue3.toString());
        clickOnElement(continue3);
    }
    public String lastMessage(){
        Reporter.log("Verify message"+lastMessage.toString());
        return getTextFromElement(lastMessage);
    }






}
