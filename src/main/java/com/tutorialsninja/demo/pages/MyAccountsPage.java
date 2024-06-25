package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountsPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement verify;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement verifyText;

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement fNameField;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lNameField;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement mobileField;


    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement agreeCheckbox;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement verifyMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement nextButton;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement logout;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement account;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement link;

    public String verifyTextRegisterAccount() {
        log.info("Register Account" + verify.toString());
        return getTextFromElement(verify);
    }

    public String verifyTextReturningCustomer() {
        log.info("Returning Customer" + verifyText.toString());
        return getTextFromElement(verifyText);
    }

    public void fillRegistrationData(String fName, String lName, String email, String mobile
            , String pwd, String cpwd) {
        sendTextToElement(fNameField, fName);
        sendTextToElement(lNameField, lName);
        sendTextToElement(emailField, email);
        sendTextToElement(mobileField, mobile);
        sendTextToElement(passwordField, pwd);
        sendTextToElement(confirmPasswordField, cpwd);
        clickOnElement(agreeCheckbox);
        clickOnElement(continueButton);
    }

    public String verifyAccountMessage() {
        log.info("Account Message" + verifyMessage.toString());
        return getTextFromElement(verifyMessage);
    }

    public void clickOnNextContinueButton() {
        clickOnElement(nextButton);
        log.info("Click on " + nextButton.toString());
    }

    public String verifyAccountLogout() {
        log.info("Account Logout" + logout.toString());
        return getTextFromElement(logout);
    }

    public void fillLoginData(String email, String pwd) {
        sendTextToElement(emailField, email);
        sendTextToElement(passwordField, pwd);
        clickOnElement(loginButton);
    }

    public String verifyTextMyAccount() {
        log.info("My Account" + account.toString());
        return getTextFromElement(account);
    }

    public void clickOnMyAccountLink() {
        clickOnElement(link);
        log.info("Click on " + link.toString());
    }
}
