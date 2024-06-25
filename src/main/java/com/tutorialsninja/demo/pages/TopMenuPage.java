package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TopMenuPage extends Utility {

    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//li//a")
    List<WebElement>  topMenu;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Desktops']")
    WebElement desktops;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Desktops']")
    WebElement textDesktops;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
    WebElement click;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Laptops & Notebooks']")
    WebElement laptopsNotebooks;


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Components']")
    WebElement components;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Components']")
    WebElement textComponents;


    // create method with name "selectMenu" it has one parameter name "menu" of type string
    // This method should click on the menu whatever name is passed as parameter.
    public void selectMenu(String menu) {
        List<WebElement> elements = topMenu;
        for (WebElement e : elements) {
            if (e.getText().equalsIgnoreCase(menu)) {
                e.click();
                break;
            }
        }
        log.info("Select"+ topMenu.toString());
    }


    public void mouseHoverAndClickOnDesktops() {
        mouseHoverToElementAndClick(desktops);
        log.info("Click on " + desktops.toString());
    }

    public String verifyTextDesktops() {
        log.info("Desktops" + textDesktops.toString());
        return getTextFromElement(textDesktops);
    }

    public void mouseHoverAndClickOnLaptopsNotebooks() {
        mouseHoverToElementAndClick(click);
        log.info("Click on " + click.toString());

    }

    public String verifyTextLaptopsNotebooks() {
        log.info("get " + laptopsNotebooks.toString());
        return getTextFromElement(laptopsNotebooks);
    }

    public void mouseHoverAndClickOnComponents() {
        mouseHoverToElementAndClick(components);
        log.info("Click on " + components.toString());
    }

    public String verifyTextComponents() {
        log.info("get " + textComponents.toString());
        return getTextFromElement(textComponents);
    }
}
