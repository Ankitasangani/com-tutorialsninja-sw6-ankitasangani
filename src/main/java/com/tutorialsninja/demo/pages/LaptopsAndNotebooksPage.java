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

public class LaptopsAndNotebooksPage extends Utility {

    private static final Logger log = LogManager.getLogger(LaptopsAndNotebooksPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12']//div[1]//div[2]//div[1]//p//span[@class='price-tax']")
    List<WebElement> priceValue;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12']//div[1]//div[2]//div[1]//p//span[@class='price-tax']")
    List<WebElement> afterFilter;

    @CacheLookup
    @FindBy(linkText = "Sony VAIO")
    WebElement product;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Success')]")
    WebElement message;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Sony VAIO')]")
    WebElement verifySonyVAIO;

    @CacheLookup
    @FindBy(linkText = "HP LP3065")
    WebElement HpLp;

    @CacheLookup
    @FindBy(css = "div[id='content'] h1")
    WebElement productText;

    public String getProductText() {
        log.info("Verify Product name : " + productText.toString());
        return getTextFromElement(productText);
    }


    public void selectSortByPriceHighToLow() {
        selectByValueFromDropDown(price, "https://tutorialsninja.com/demo/index.php?route=product/category&path=18&sort=p.price&order=DESC");
    }

    public List<Double> beforeFilterProductPrice() throws InterruptedException {
        List<WebElement> beforeFilterProductPrice = priceValue;
        //Create arraylist
        List<Double> beforeFilterProductPriceList = new ArrayList<>();
        //Store elements text to array list
        for (WebElement p : beforeFilterProductPrice) {
            String beforeFilterPrice = p.getText().replaceAll("[E,x,T,a,x,£,:,$]", "").replace(",", "");
            Double priceValueBeforeFilter = Double.parseDouble(beforeFilterPrice);
            beforeFilterProductPriceList.add(priceValueBeforeFilter);
        }
        //Sort arraylist to ascending order
        Collections.sort(beforeFilterProductPriceList);
        //Reverse the list
        Collections.reverse(beforeFilterProductPriceList);
        return beforeFilterProductPriceList;
    }


    public List<Double> afterFilterProductPrice() {
        //Store elements after filtering
        List<WebElement> afterFilterProductPrice = afterFilter;
        //Create another list to store text of elements after clicking on filter Price high to low
        List<Double> afterFilterProductPriceList = new ArrayList<>();
        for (WebElement s : afterFilterProductPrice) {
            String afterFilterPrice = s.getText().replaceAll("[E,x,T,a,x,£,:,$]", "").replace(",", "");
            Double afterFilterPriceValue = Double.parseDouble(afterFilterPrice);
            afterFilterProductPriceList.add(afterFilterPriceValue);
        }
        return afterFilterProductPriceList;
    }

    public void selectProductSonyVAIO() {
        clickOnElement(product);
        log.info("Click on " + product.toString());
    }

    public String verifyTextSonyVAIO() {
        log.info("SonyVAIO" + verifySonyVAIO.toString());
        return getTextFromElement(verifySonyVAIO);
    }

    public String verifyTextMessage() {
        log.info("message" + message.toString());
        return getTextFromElement(message).substring(0, 56);
    }

    public void clickOnProductHpLp(String productName) {
        clickOnElement(HpLp);
        log.info("Select " + productName + HpLp.toString());
    }
}
