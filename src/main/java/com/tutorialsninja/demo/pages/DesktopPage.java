package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement link;

    @CacheLookup
    @FindBy(xpath = "//div[@class='caption']//h4//a")
    List<WebElement> descend;

    @CacheLookup
    @FindBy(xpath = "//div[@class='caption']//h4")
    List<WebElement> element;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sort;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByDropdown;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> listOfProducts;

    @CacheLookup
    @FindBy(id = "input-quantity")
    WebElement quantityTextBox;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successAlertMsg;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement cartLinkInMsg;


    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
        log.info("Click on " + addToCart.toString());
    }

    public void clickOnLinkShoppingCart() {
        clickOnElement(link);
       log.info("Click on " + link.toString());
    }

    public void SortByPositionZtoA() {
        selectByVisibleTextFromDropDown(sort, "Name (Z - A)");
        log.info("Click on " + sort.toString());
    }

    public List<String> verifyDescendingOrder() {
        List<WebElement> elements = descend;
        //Create arraylist
        List<String> beforeFilterProductNamesList = new ArrayList<>();
        //Store elements text to array list
        for (WebElement p : elements) {
            beforeFilterProductNamesList.add(p.getText().toUpperCase());
        }
        // Sort arraylist to ascending order
        Collections.sort(beforeFilterProductNamesList);
        // //Reverse the list
        Collections.reverse(beforeFilterProductNamesList);
        return beforeFilterProductNamesList;
    }

    public List<String> getProductsNameAfterFilterZToA() {
        //Store elements after filtering
        List<WebElement> afterFilterProductNames = element;
        //Create another list to store text of elements after clicking on filter Z to A
        List<String> afterFilterProductNamesList = new ArrayList<>();
        for (WebElement s : afterFilterProductNames) {
            afterFilterProductNamesList.add(s.getText().toUpperCase());
        }
        return afterFilterProductNamesList;
    }


    public void selectFromSortByDropdown(String value) {
        selectByVisibleTextFromDropDown(sortByDropdown, value);
        log.info("Click on " + sortByDropdown.toString());
    }


    public void clickOnProduct(String product) {
        List<WebElement> products = listOfProducts;
        List<String> productList = new ArrayList<>();
        for (WebElement e : products) {
            if (e.getText().equalsIgnoreCase(product)) {
                e.click();
                break;
            }
        }

        log.info("Click on " + product);
    }


    public void enterQuantity(int qty) {
        quantityTextBox.clear();
        sendTextToElement(quantityTextBox, String.valueOf(qty));
        log.info("update " + qty);
    }

    public String getSuccessAlertMsg() {
        log.info("Get " + successAlertMsg.toString());
        return getTextFromElement(successAlertMsg);
    }

    public void clickOnCartLinkInMsgButton() {
        clickOnElement(cartLinkInMsg);
        log.info("Click on " + cartLinkInMsg.toString());
    }
}
