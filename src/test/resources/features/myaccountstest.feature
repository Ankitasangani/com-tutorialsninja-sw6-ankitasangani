Feature: Register  and Login successfully
  I want to Register, Login and Logout successfully
  As a User
  I want to add correct details

  @author_Ankita @smoke @sanity @regression
  Scenario: Verify User Should Navigate To Register Page Successfully
    Given I am on Homepage
    When I click on My Account Link
    And I select My account Options Register
    Then I should see the text “Register Account”

  @author_Ankita @smoke @regression
  Scenario: Verify User Should Navigate To Login Page Successfully
    Given I am on Homepage
    When I click on My Account Link
    And I select My account Options Login
    Then I should see the text "Returning Customer" on My Account page


  @author_Ankita @regression
  Scenario: Verify That User Register Account Successfully
    Given I am on Homepage
    When I click on My Account Link
    And I select My account Options Register
    Then I enter registration data
#   And  I Enter First Name
#    And I Enter Last Name
#    And I Enter Email
#    And I Enter Telephone
#    And I Enter Password
#    And I Enter Password Confirm
#    And I Select Subscribe Yes radio button
#    And I Click on Privacy Policy check box
#    And I Click on Continue button
    And I should see the message “Your Account Has Been Created!”
    And I Click on Continue button
    And I click on My Account Link
    And I select My account Options Logout
    And I should see the text “Account Logout”
    And I Click on Continue button next

  @author_Ankita @regression
  Scenario: verifyThatUserShouldLoginAndLogoutSuccessfully
    Given I am on Homepage
    When I click on My Account Link
    And I select My account Options Register
    Then I enter login details
    And I should see text “My Account”
    And I click on My Account Link
    And I select My account Options Logout
    And I should see the text “Account Logout”
    And I Click on Continue button next





