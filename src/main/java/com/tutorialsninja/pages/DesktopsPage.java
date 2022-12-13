package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class DesktopsPage extends Utility {
    @CacheLookup
            @FindBy(linkText = "Desktops")
    WebElement desktops ;

    //By desktops = By.linkText("Desktops");
    @CacheLookup
    @FindBy(linkText = "Show All Desktops")
    WebElement alldesktops ;

   // By alldesktops = By.linkText("Show All Desktops");

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort'and@class='form-control']")
    WebElement  sortByZtoA;
    //By sortByZtoA =By.xpath("//select[@id='input-sort'and@class='form-control']");

    @CacheLookup
    @FindBy (xpath = "//div[@class='product-thumb']")
    List<WebElement> allProduct;


    public void mouseHoverAndClickOnDesktops() {
        Reporter.log("Mousehover and click on laptop" +desktops.toString());
        mouseHoverToElementAndClick(desktops);
    }

    public void clickOnAllDesktops() {
        Reporter.log("Click on all desktop "+alldesktops.toString());
        clickOnElement(alldesktops);
    }
    public void clickOnZtoA(){
        Reporter.log("Select Z to A from dropdown"+sortByZtoA.toString());
        selectByIndexFromDropDown(sortByZtoA,2);
    }
}
