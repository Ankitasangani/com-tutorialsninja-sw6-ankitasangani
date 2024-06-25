package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DesktopPageTestSteps {
    @And("I  Select Sort By position Name: Z to A")
    public void iSelectSortByPositionNameZToA() {
        new DesktopPage().SortByPositionZtoA();
    }

    @Then("I should see the Product will arrange in Descending order.")
    public void iShouldSeeTheProductWillArrangeInDescendingOrder() {
        Assert.assertEquals(new DesktopPage().getProductsNameAfterFilterZToA(), new DesktopPage().verifyDescendingOrder(), "Text didn't match!");
    }

    @When("I Mouse hover on Currency Dropdown and click")
    public void iMouseHoverOnCurrencyDropdownAndClick() {
        new HomePage().clickOnCurrency();
    }

    @And("I Mouse hover on £Pound Sterling and click")
    public void iMouseHoverOn£PoundSterlingAndClick() {
        new HomePage().selectPoundCurrency();
    }

    @And("I Select Sort By position Name: A to Z")
    public void iSelectSortByPositionNameAToZ() {
        new DesktopPage().selectFromSortByDropdown("Name (A - Z)");
    }


    @And("I Select product {string}")
    public void iSelectProduct(String product) {
        new DesktopPage().clickOnProduct(product);
    }


    @And("I Enter Qty {int} using Select class.")
    public void iEnterQtyUsingSelectClass(int qty) {
        new DesktopPage().enterQuantity(1);
    }


    @And("Click on Add to Cart button")
    public void clickOnAddToCartButton() {
        new DesktopPage().clickOnAddToCartButton();
    }

    @And("I should see the Message {string}")
    public void iShouldSeeTheMessage(String message) {
        Assert.assertEquals(new DesktopPage().getSuccessAlertMsg(), message, "Text didn't match!");
    }

    @And("I Click on link “shopping cart” display into success message")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new DesktopPage().clickOnCartLinkInMsgButton();
    }

}
