package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.MyAccountsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MyAccountPageTestSteps {
    @Then("I should see the text “Register Account”")
    public void iShouldSeeTheTextRegisterAccount() {
        Assert.assertEquals(new MyAccountsPage().verifyTextRegisterAccount(), "Register Account", "Text didn't match!");
    }

    @Then("I should see the text {string} on My Account page")
    public void iShouldSeeTheTextOnMyAccountPage(String text) {
        Assert.assertEquals(new MyAccountsPage().verifyTextReturningCustomer(), text, "Text didn't match!");
    }

    @Then("I enter registration data")
    public void iEnterRegistrationData() {
        new MyAccountsPage().fillRegistrationData("Ankita", "Sangi", "ABC345@gmail.com", "07833662976", "turd@123", "turd@123");
    }

    @And("I should see the message “Your Account Has Been Created!”")
    public void iShouldSeeTheMessageYourAccountHasBeenCreated() {
        Assert.assertEquals(new MyAccountsPage().verifyAccountMessage(), "Your Account Has Been Created!", "Text didn't match!");
    }

    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
        new MyAccountsPage().clickOnNextContinueButton();
    }

    @And("I should see the text “Account Logout”")
    public void iShouldSeeTheTextAccountLogout() {
        Assert.assertEquals(new MyAccountsPage().verifyAccountLogout(), "Account Logout", "Text didn't match!");
    }

    @And("I Click on Continue button next")
    public void iClickOnContinueButtonNext() {
        new MyAccountsPage().clickOnNextContinueButton();
    }

    @Then("I enter login details")
    public void iEnterLoginDetails() {
        new MyAccountsPage().fillLoginData("p344561425@gmail.com", "sjfh@123");
    }

    @And("I should see text “My Account”")
    public void iShouldSeeTextMyAccount() {
        Assert.assertEquals(new MyAccountsPage().verifyTextMyAccount(), "My Account", "Text didn't match!");
    }
}
