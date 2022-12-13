package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class TopMenuPage extends Utility {
         @CacheLookup
        @FindBy(linkText = "Desktops")
        WebElement deskTopTab;
    //By deskTopTab = By.linkText("Desktops");

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement verifyDesktopsText;
    //By verifyDesktopsText = By.xpath("//h2[contains(text(),'Desktops')]");

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopAndNotebook ;
    //By laptopAndNotebook =By.linkText("Laptops & Notebooks");

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement laptopsAndNotebooksMessage;
    //By laptopsAndNotebooksMessage=By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componant;
    //By componant=By.linkText("Components");

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componantMessage;
   // By componantMessage= By.xpath("//h2[contains(text(),'Components')]");

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }
    public void mouseHoverOnDeskTopTabAndClick() {
        mouseHoverToElementAndClick(deskTopTab);
    }
    public void selectALlDesktops() {
        Reporter.log("Select show all desktops");
        // clickOnElement(allDesktops);
        selectMenu("Show All Desktops");
    }

    public String verifyDesktopsTextMessage() {
        Reporter.log("Verify message "+verifyDesktopsText.toString());
        return getTextFromElement(verifyDesktopsText);
    }

    public void mouseHoverOnlaptopAndNotebookAndClick(){
        Reporter.log("Mousehover on laptop and notebook and click"+laptopAndNotebook.toString());
        clickOnElement(laptopAndNotebook);
    }

    public void selectOnShowAllLaptopsAndNotebook(){
        Reporter.log("Select show all option and notebook");
        selectMenu("Show All Laptops & Notebooks");
    }

    public String verifyLaptopsAndNotebooksMessage(){
        Reporter.log("Verify text"+laptopsAndNotebooksMessage.toString());
        return getTextFromElement(laptopsAndNotebooksMessage);
    }

    public void mouseHoverOnComponantAndClick(){
        Reporter.log("Mousehover on componant and click"+componant.toString());
        clickOnElement(componant);
    }
    public void selectShowAllComponant() {
        Reporter.log("Select show all componant");
        selectMenu("Show All Components");

    }

    public String verifycomponantMessage(){
        Reporter.log("Verify message"+componantMessage.toString());
        return getTextFromElement(componantMessage);
    }
}
