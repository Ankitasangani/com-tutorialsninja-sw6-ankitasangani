package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CheckoutPageSteps {
    @And("I should see the text {string} on checkout page")
    public void iShouldSeeTheTextOnCheckoutPage(String text) {
        Assert.assertEquals(new CheckoutPage().verifyTheTextNewCustomer(), text, "Text didn't match!");
    }

    @When("I click on Guest Checkout radio button")
    public void iClickOnGuestCheckoutRadioButton() {
        new CheckoutPage().clickOnGuestCheckout();
    }

    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        new CheckoutPage().clickOnContinueTab();
    }

    @And("I fill in the mandatory fields")
    public void iFillInTheMandatoryFields() {
        new CheckoutPage().fillBillingFormDetails("Ankita", "Sangi", "ankita456@gmail.com", "07724567892"
                , "25 Harbor Street", "birmingham", "B202DW", "United Kingdom", "Kent");
    }

    @And("I click on Continue button in guest")
    public void iClickOnContinueButtonInGuest() {
        new CheckoutPage().clickOnContinueButtonGuest();
    }

    @And("I add Comments About my order into text area")
    public void iAddCommentsAboutMyOrderIntoTextArea() {
        new CheckoutPage().addCommentsAboutOrder();
    }

    @And("I click on Continue button in shipping")
    public void iClickOnContinueButtonInShipping() {
        new CheckoutPage().continueButton();
    }

    @And("I check the Terms & Conditions check box")
    public void iCheckTheTermsConditionsCheckBox() {
        new CheckoutPage().termsAndConditionCheckBox();
    }

    @And("I click on Continue button next")
    public void iClickOnContinueButtonNext() {
        new CheckoutPage().nextContinueButton();
    }

    @Then("I click on confirm order button")
    public void iClickOnConfirmOrderButton() {
        new CheckoutPage().confirmOrderButton();
    }

}
