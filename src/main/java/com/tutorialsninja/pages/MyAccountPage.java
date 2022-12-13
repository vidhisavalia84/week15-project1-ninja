package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class MyAccountPage extends Utility {
        @CacheLookup
        @FindBy(xpath = "//span[contains(text(),'My Account')]")
        WebElement myAccount ;
    //By myAccount = By.xpath("//span[contains(text(),'My Account')]");

    @CacheLookup
    @FindBy(xpath =  "//h1[contains(text(),'Register Account')]")
    WebElement register ;
   // By register = By.xpath("//h1[contains(text(),'Register Account')]");

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement  returning;
    //By returning = By.xpath("//h2[contains(text(),'Returning Customer')]");

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstName ;
   // By firstName = By.id("input-firstname");

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastName ;
  //  By lastName = By.id("input-lastname");

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email  ;
    //By email = By.id("input-email");

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement phone ;
   // By phone = By.id("input-telephone");

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password ;
    //By password = By.id("input-password");

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPass ;
   // By confirmPass = By.id("input-confirm");

    @CacheLookup
    @FindBy(xpath = "//input[@name='newsletter']")
    WebElement newsLetter ;
   // By newsLetter = By.xpath("//input[@name='newsletter']");

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement privacyPolicy ;
   // By privacyPolicy = By.xpath("//div[@class = 'buttons']//input[@name='agree']");

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement continue1 ;
    //By continue1 = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountCreated ;
   // By accountCreated = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continue3 ;
   // By continue3 = By.xpath("//a[contains(text(),'Continue')]");

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountLink ;
   // By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement logout ;
   // By logout = By.xpath("//h1[contains(text(),'Account Logout')]");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continue4  ;
   // By continue4 = By.xpath("//a[contains(text(),'Continue')]");

    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginButton ;
   // By loginButton = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");
   public void selectMyAccountOptions(String option) {
       List<WebElement> myAccountList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
       try {
           for (WebElement options : myAccountList) {
               if (options.getText().equalsIgnoreCase(option)) {
                   options.click();
               }
           }
       } catch (StaleElementReferenceException e) {
           myAccountList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
       }
   }


    public void clickonMyAccount() {
        Reporter.log("Click on my account"+myAccount.toString());
        clickOnElement(myAccount);
    }

    public String verifyRegisterText() {
        Reporter.log("Verify register text "+register.toString());
        return getTextFromElement(register);

    }
    public String verifyReturningText() {
        Reporter.log("Verify returning text "+returning.toString());
        return getTextFromElement(returning);

    }
    public void enterFirstName(String name) {
        Reporter.log("Enter first name"+firstName.toString());
        sendTextToElement(firstName, name+getRandomString(2));
    }

    public void enterLastName(String lastname) {
        Reporter.log("Enter last name"+lastName.toString());
        sendTextToElement(lastName,lastname+getRandomString(3));
    }

    public void enterEmailAddress(String email1) {
        Reporter.log("Enter email "+email1.toString());
        sendTextToElement(email, email1);
    }
    public void enterPhoneNumber(String num) {
        Reporter.log("Enter telephone "+phone.toString());
        sendTextToElement(phone, num);
    }
    public void enterPassword(String num) {
       Reporter.log("Enter password"+password.toString());
        sendTextToElement(password, num);
    }
    public void enterConfirmPassword(String num) {
        Reporter.log("Enter conform password "+confirmPass.toString());
        sendTextToElement(confirmPass, num);
    }
    public void clickOnNewsLetterButton() {
        Reporter.log("Click on newsletter button "+newsLetter.toString());
        clickOnElement(newsLetter);
    }

    public void clickOnPrivacyPolicy() {
        Reporter.log("Click on privacy policy "+privacyPolicy.toString());
        clickOnElement(privacyPolicy);
    }
    public void clickOnContinue1() {
        Reporter.log("Click on continue "+continue1.toString());
        clickOnElement(continue1);
    }

    public String verifyMessageYourAccount() {
        Reporter.log("Verify message "+accountCreated.toString());
        return getTextFromElement(accountCreated);

    }
    public void clickOnContinue3() {
        Reporter.log("click on continue "+continue3.toString());
        clickOnElement(continue3);
    }
    public void clickOnMyAccountLink() {
        Reporter.log("click on my account link "+myAccountLink.toString());
        clickOnElement(myAccountLink);
    }
    public String verifyLogoutText() {
        Reporter.log("Verify logout text "+logout.toString());
        return getTextFromElement(logout);

    }
    public void clickOnContinue4() {
        Reporter.log("Click on continue");
        clickOnElement(continue4);
    }
    public void clickOnLogin() {
        Reporter.log("Click on login button");
        clickOnElement(loginButton);

    }


}
