package com.tutorialsninja.testsuite;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.DesktopsPage1;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class DesktopsPageTest extends BaseTest {
/*<class name="com.tutorialsninja.testsuite.DesktopsPageTest"></class>*/
    DesktopsPage desktopsPage;
    DesktopsPage1 desktopsPage1;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        desktopsPage=new DesktopsPage();
        desktopsPage1=new DesktopsPage1();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyProductArrangeInAlphaBaticalOrder(){
        desktopsPage.mouseHoverAndClickOnDesktops();
        desktopsPage.clickOnAllDesktops();
        desktopsPage.clickOnZtoA();
    }
@Test(groups = {"smoke","regression"})
public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException{
        desktopsPage1.clickOnCurrencyButton();
    desktopsPage1.selectCurrencyFromDropDown();

    desktopsPage.mouseHoverAndClickOnDesktops();
    desktopsPage.clickOnAllDesktops();
    desktopsPage.clickOnZtoA();

    desktopsPage1.clickOnHP();
    Assert.assertEquals(desktopsPage1.verifyHPMessage(), "HP LP3065", " Product not display");
    desktopsPage1.selectDeleveryDate();
    desktopsPage1.clearQuantityAndSendQuantity("1");
    desktopsPage1.clickOnAddButton();
    //Assert.assertEquals(desktopsPage1.verifySuccessfullMessage(), "Success: You have added HP LP3065 to your shopping cart!");
    desktopsPage1.clickOnShoppingCart();
Thread.sleep(2000);
    desktopsPage1.clickOnShoppingCartLink();
    Assert.assertEquals(desktopsPage1.verifyShoppinCartMessage(), "Shopping Cart  (1.00kg)");
    Assert.assertEquals(desktopsPage1.verifyProductName(), "HP LP3065");
    Assert.assertEquals(desktopsPage1.verifyProduct21(), "Product 21");
    Assert.assertEquals(desktopsPage1.verifyTotal(), "£74.73");
}
}
