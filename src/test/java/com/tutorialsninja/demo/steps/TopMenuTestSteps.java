package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.TopMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuTestSteps {
    @Given("I am on Homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover and click on Desktops tab")
    public void iMouseHoverAndClickOnDesktopsTab() {
        new TopMenuPage().mouseHoverAndClickOnDesktops();
    }

    @And("I  select Menu Show All Desktops")
    public void iSelectMenuShowAllDesktops() {
        new TopMenuPage().selectMenu("Show AllDesktops");
    }

    @Then("I should see the text Desktops")
    public void iShouldSeeTheTextDesktops() {
        Assert.assertEquals(new TopMenuPage().verifyTextDesktops(), "Desktops", "Text didn't match!");
    }

    @When("I mouse hover and click on Laptops & Notebooks tab")
    public void iMouseHoverAndClickOnLaptopsNotebooksTab() {
        new TopMenuPage().mouseHoverAndClickOnLaptopsNotebooks();
    }

    @And("I  select Menu Show All Laptops & Notebooks")
    public void iSelectMenuShowAllLaptopsNotebooks() {
        new TopMenuPage().selectMenu("Show AllLaptops & Notebooks");
    }

    @Then("I should see the text Laptops & Notebooks")
    public void iShouldSeeTheTextLaptopsNotebooks() {
        Assert.assertEquals(new TopMenuPage().verifyTextLaptopsNotebooks(), "Laptops & Notebooks", "Text didn't match!");
    }


    @When("I mouse hover and click on Components tab")
    public void iMouseHoverAndClickOnComponentsTab() {
        new TopMenuPage().mouseHoverAndClickOnComponents();
    }

    @And("I  select Menu Show All Components")
    public void iSelectMenuShowAllComponents() {
        new TopMenuPage().selectMenu("Show AllComponents");
    }

    @Then("I should see the text Components")
    public void iShouldSeeTheTextComponents() {
        Assert.assertEquals(new TopMenuPage().verifyTextComponents(), "Components", "Text didn't match!");
    }
}
