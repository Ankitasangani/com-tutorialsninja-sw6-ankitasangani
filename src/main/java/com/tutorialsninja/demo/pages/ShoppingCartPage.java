package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(linkText = "Sony VAIO")
    WebElement productSony;

    @CacheLookup
    @FindBy(xpath = "//input[@class='form-control']")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement update;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Success')]")
    WebElement updateMessage;

    @CacheLookup
    @FindBy(xpath = "//tbody//tr//td[6]")
    WebElement totalAmount;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkout;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement textCheckout;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//tbody//tr//td[@class='text-left'][2]")
    WebElement modelName;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]")
    WebElement totalPrice;


    public String verifyTheTextShoppingCart() {
        log.info("shopping Cart" + shoppingCart.toString());
        return getTextFromElement(shoppingCart).substring(0, 13);
    }

    public String verifyTheProductSonyVAIO() {
        log.info("ProductSonyVAIO" + productSony.toString());
        return getTextFromElement(productSony);
    }

    public void changeQty() {
        driver.findElement((By) quantity).clear();
        sendTextToElement(quantity, "2");
        log.info("click " + quantity.toString());
    }

    public void clickOnUpdateTab() {
        clickOnElement(update);
        log.info("Click on " + update.toString());
    }

    public String modifiedMessage() {
        log.info("update Message" + updateMessage.toString());
        return getTextFromElement(updateMessage).substring(0, 46);
    }

    public String verifyTotal() {
        log.info("Total" + totalAmount.toString());
        return getTextFromElement(totalAmount);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkout);
        log.info("Click on " + checkout.toString());
    }

    public String verifyTheTextCheckout() {
        log.info("Checkout" + textCheckout.toString());
        return getTextFromElement(textCheckout);
    }

    public String getProductName() {
        log.info("Get " + productName.toString());
        return getTextFromElement(productName);
    }

    public String getModelName() {
        log.info("Get " + modelName.toString());
        return getTextFromElement(modelName);
    }

    public String getTotalPrice() {
        log.info("Get " + totalPrice.toString());
        WebElement toRightOf = driver.findElement(RelativeLocator.with(By.xpath("//td[@class='text-right']")).toRightOf(By.xpath("//strong[normalize-space()='Total:']")));
        return getTextFromElement(toRightOf);
    }
}
