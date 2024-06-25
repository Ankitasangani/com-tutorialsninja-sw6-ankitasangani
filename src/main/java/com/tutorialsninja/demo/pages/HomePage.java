package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(LaptopsAndNotebooksPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement linkMyAccount;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Currency']")
    WebElement currencyLink;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='£Pound Sterling']")
    WebElement poundLink;

    // create method with name "selectMyAccountOptions" it has one parameter name "option" of type string
    // This method should click on the options whatever name is passed as parameter.
    public void selectMyAccountOptions(String option) {
        clickOnElement(By.xpath("//a[normalize-space()='" + option + "']"));
    }

    public void clickOnMyAccountLink() {
        clickOnElement(linkMyAccount);
        log.info("Click on " + linkMyAccount.toString());
    }

    public void clickOnCurrency() {
        clickOnElement(currencyLink);
        clickOnElement(By.xpath("(//button[@class='currency-select btn btn-link btn-block'])[2]"));
        log.info("Click on " + currencyLink.toString());
    }

    public void selectPoundCurrency() {
        clickOnElement(currencyLink);
        clickOnElement(poundLink);
        log.info("Click on " + poundLink.toString());
    }
}
