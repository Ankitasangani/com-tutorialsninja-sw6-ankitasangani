package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class laptopsAndNotebooksPageTestSteps {
    @And("I  Select Sort By Price \\(High > Low)")
    public void iSelectSortByPriceHighLow() {
        new LaptopsAndNotebooksPage().selectSortByPriceHighToLow();
    }

    @Then("I should see the Product price will arrange in High to Low order.")
    public void iShouldSeeTheProductPriceWillArrangeInHighToLowOrder() throws InterruptedException {
        Assert.assertEquals(new LaptopsAndNotebooksPage().beforeFilterProductPrice(), new LaptopsAndNotebooksPage().afterFilterProductPrice(), "Text didn't match!");
    }

    @And("I select Product {string}")
    public void iSelectProduct(String product) {
        new LaptopsAndNotebooksPage().clickOnProductHpLp(product);
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String text) {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getProductText(), text, "Text didn't match!");
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String message) {
        Assert.assertEquals(new LaptopsAndNotebooksPage().verifyTextMessage(), message, "Text didn't match!");
    }
}
