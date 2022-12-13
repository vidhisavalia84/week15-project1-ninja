package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LaptopsAndNotebooksPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndNotebooks;
    // By laptopsAndNotebooks=By.linkText("Laptops & Notebooks");
    @CacheLookup
    @FindBy(linkText = "Show All Laptops & Notebooks")
    WebElement showAllOPtion;
    //By showAllOPtion=By.linkText("Show All Laptops & Notebooks");
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortBy;
    // By sortBy=By.id("input-sort");

    public void mouseHoverAndClickOnLaptopsAndNotebooks(){
        Reporter.log("Click on Laptops and notebook tab "+laptopsAndNotebooks.toString());
        mouseHoverToElementAndClick(laptopsAndNotebooks);
    }
    public void clickOnShowAllLaptopsAndNotebooks(){
        Reporter.log("Click on show all option "+showAllOPtion.toString());
        clickOnElement(showAllOPtion);
    }

    public void selectPriseHighToLowFromDropdown(){
        Reporter.log("Select price Low to High "+sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy, "Price (Low > High)");
        // selectOptionsByValue(sortBy,"Price (Low > High)");
    }



}
