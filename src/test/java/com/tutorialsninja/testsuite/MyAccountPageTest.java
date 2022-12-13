package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountPageTest extends BaseTest {

    MyAccountPage myAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        myAccountPage=new MyAccountPage();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        myAccountPage.clickonMyAccount();
        myAccountPage.selectMyAccountOptions("Register");
        Assert.assertEquals(myAccountPage.verifyRegisterText(),"Register Account");
    }
    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        myAccountPage.clickonMyAccount();
        myAccountPage.selectMyAccountOptions("Login");
        Assert.assertEquals(myAccountPage.verifyReturningText(),"Returning Customer");
    }
    @Test(groups = "regression")
    public void verifyThatUserRegisterAccountSuccessfully() {
        myAccountPage.clickonMyAccount();
        myAccountPage.selectMyAccountOptions("Register");
        myAccountPage.enterFirstName("Prime");
        myAccountPage.enterLastName("Testing");
        myAccountPage.enterEmailAddress("Prime" + generateRandomNumber() + "@gmail.com");
        myAccountPage.enterPhoneNumber("07896586958");
        myAccountPage.enterPassword("test123");
        myAccountPage.enterConfirmPassword("test123");
        myAccountPage.clickOnNewsLetterButton();
        myAccountPage.clickOnPrivacyPolicy();
        myAccountPage.clickOnContinue1();
        Assert.assertEquals(myAccountPage.verifyMessageYourAccount(), "Your Account Has Been Created!");
        myAccountPage.clickOnContinue3();
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.selectMyAccountOptions("Logout");
        Assert.assertEquals(myAccountPage.verifyLogoutText(), "Account Logout");
        myAccountPage.clickOnContinue4();


    }



}
