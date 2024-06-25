package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class HomepageTestSteps {
    @When("I click on My Account Link")
    public void iClickOnMyAccountLink() {
        new HomePage().clickOnMyAccountLink();
    }

    @And("I select My account Options Register")
    public void iSelectMyAccountOptionsRegister() {
        new HomePage().selectMyAccountOptions("Register");
    }

    @And("I select My account Options Login")
    public void iSelectMyAccountOptionsLogin() {
        new HomePage().selectMyAccountOptions("Login");
    }


    @And("I select My account Options Logout")
    public void iSelectMyAccountOptionsLogout() {
        new HomePage().selectMyAccountOptions("Logout");
    }
}
