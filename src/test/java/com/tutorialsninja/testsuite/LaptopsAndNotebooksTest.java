package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage1;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage1;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends BaseTest {

    LaptopsAndNotebooksPage laptopsAndNotebooksPage;
    DesktopsPage1 desktopsPage1;
    LaptopsAndNotebooksPage1 laptopsAndNotebooksPage1;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
        desktopsPage1 = new DesktopsPage1();
        laptopsAndNotebooksPage1 = new LaptopsAndNotebooksPage1();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        laptopsAndNotebooksPage.mouseHoverAndClickOnLaptopsAndNotebooks();
        laptopsAndNotebooksPage.clickOnShowAllLaptopsAndNotebooks();
        laptopsAndNotebooksPage.selectPriseHighToLowFromDropdown();
    }

    @Test(groups = {"smoke","regression"})
    public void verifyThatUserPlaceOrderSuccessfully()throws InterruptedException {
        desktopsPage1.clickOnCurrencyButton();
        desktopsPage1.selectCurrencyFromDropDown();
        laptopsAndNotebooksPage.mouseHoverAndClickOnLaptopsAndNotebooks();
        laptopsAndNotebooksPage.clickOnShowAllLaptopsAndNotebooks();

        laptopsAndNotebooksPage1.clickOnSortBy();
        laptopsAndNotebooksPage1.clickOnMacBook();
        Assert.assertEquals(laptopsAndNotebooksPage1.verifyMacBookMessage(), "MacBook");
        laptopsAndNotebooksPage1.clickOnAddToCart();
        // Assert.assertEquals(laptopsAndNotebooksPage1.verifySuccessfulMessage(),"Success: You have added MacBook to your shopping cart!");
        laptopsAndNotebooksPage1.clickOnShoppingCartLink();
        Assert.assertEquals(laptopsAndNotebooksPage1.verifyShoppingCartMessage(), "Shopping Cart  (0.00kg)");
        Assert.assertEquals(laptopsAndNotebooksPage1.verifyMacBookText(), "MacBook");
        laptopsAndNotebooksPage1.clearQuantityAndSendQuantity("2");
        laptopsAndNotebooksPage1.clickOnUpadte();
        Assert.assertEquals(laptopsAndNotebooksPage1.verifyModifiedMessage(), "Success: You have modified your shopping cart!" + "\n×");
        Assert.assertEquals(laptopsAndNotebooksPage1.verifyText(), "£737.45");

        Assert.assertEquals(laptopsAndNotebooksPage1.verifyCheckOutText(), "Checkout");
        laptopsAndNotebooksPage1.clickCheckout();
        //Assert.assertEquals(laptopsAndNotebooksPage1.verifyTextNewCustomer(), "New Customer");
        laptopsAndNotebooksPage1.clickGuestRadioButton();
        laptopsAndNotebooksPage1.clickContinue1();
        Thread.sleep(2000);
        laptopsAndNotebooksPage1.enterFirstName("Reva");
        laptopsAndNotebooksPage1.enterLastName("Patel");
        laptopsAndNotebooksPage1.enterEmail("RavaP@gmail"+getRandomString(2)+".com");
        laptopsAndNotebooksPage1.enterTelephoneNumber("07896584569");
        laptopsAndNotebooksPage1.enterCompanyName("Telepad");
        laptopsAndNotebooksPage1.enterAddress("123 block");
        laptopsAndNotebooksPage1.enterCity("Agra");
        laptopsAndNotebooksPage1.enterPostcode("SA1 W32");
        laptopsAndNotebooksPage1.selectCountry();
        Thread.sleep(2000);
       // laptopsAndNotebooksPage1.selectZone();
        laptopsAndNotebooksPage1.clickOnContinue2();
        laptopsAndNotebooksPage1.clickOnTermsAndCondition();
        laptopsAndNotebooksPage1.clickOnContinue3();
        Assert.assertEquals(laptopsAndNotebooksPage1.lastMessage(), "Warning: Payment method required!\n" + "×");

    }

}
