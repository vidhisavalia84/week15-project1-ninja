package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.TopMenuPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuPageTest extends BaseTest {
    TopMenuPage topMenuPage;

    @BeforeMethod(alwaysRun = true)
public void inIt(){
        topMenuPage=new TopMenuPage();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        topMenuPage.mouseHoverOnDeskTopTabAndClick();
        topMenuPage.selectALlDesktops();
        Assert.assertEquals(topMenuPage.verifyDesktopsTextMessage(),"Desktops");
    }
    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        topMenuPage.mouseHoverOnlaptopAndNotebookAndClick();
        topMenuPage.selectOnShowAllLaptopsAndNotebook();
        Assert.assertEquals(topMenuPage.verifyLaptopsAndNotebooksMessage(),"Laptops & Notebooks");
    }
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToComponentsPageSuccessfully()throws InterruptedException{
        topMenuPage.mouseHoverOnComponantAndClick();
        topMenuPage.selectShowAllComponant();
        Thread.sleep(2000);
        Assert.assertEquals(topMenuPage.verifycomponantMessage(),"Components");
    }

}
