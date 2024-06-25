package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ShoppingCartSteps {

    @And("I should see the text Shopping Cart")
    public void iShouldSeeTheTextShoppingCart() {
        Assert.assertEquals(new ShoppingCartPage().verifyTheTextShoppingCart().substring(0, 13), "Shopping Cart", "Text didn't match!");
    }

    @And("I should able to see the Product name {string}")
    public void iShouldAbleToSeeTheProductName(String product) {
        Assert.assertEquals(new ShoppingCartPage().getProductName(), product, "Text didn't match!");
    }

    @And("I should see the Model {string}")
    public void iShouldSeeTheModel(String model) {
        Assert.assertEquals(new ShoppingCartPage().getModelName(), model, "Text didn't match!");
    }

    @And("I should see Total {string}")
    public void iShouldSeeTotal(String total) {
        Assert.assertEquals(new ShoppingCartPage().getTotalPrice(), total, "Text didn't match!");
    }

    @Then("I should see the text {string} after successful added")
    public void iShouldSeeTheTextAfterSuccessfulAdded(String text) {
        Assert.assertEquals(new ShoppingCartPage().verifyTheTextShoppingCart(), text, "Text didn't match!");
    }

    @And("I should see the Product name {string}")
    public void iShouldSeeTheProductName(String product) {
        Assert.assertEquals(new ShoppingCartPage().verifyTheProductSonyVAIO(), product, "Text didn't match!");
    }

    @When("I change the Quantity to {string}")
    public void iChangeTheQuantityTo(String qty) {
        new ShoppingCartPage().changeQty();
    }

    @And("I click on Update button")
    public void iClickOnUpdateButton() {
        new ShoppingCartPage().clickOnUpdateTab();
    }

    @Then("I should see the message {string} after modified")
    public void iShouldSeeTheMessageAfterModified(String message) {
        Assert.assertEquals(new ShoppingCartPage().modifiedMessage(), message, "Text didn't match!");
    }

    @And("I should see the Total {string}")
    public void iShouldSeeTheTotal(String total) {
        Assert.assertEquals(new ShoppingCartPage().verifyTotal(), total, "Text didn't match!");
    }

    @When("I click on Checkout button")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }

    @Then("I should see the text {string} on shopping cart page")
    public void iShouldSeeTheTextOnShoppingCartPage(String text) {
        Assert.assertEquals(new ShoppingCartPage().verifyTheTextCheckout(), text, "Text didn't match!");
    }
}
