Feature:  Product add to cart successfully
  I want to navigate to the Desktops page
  As a User
  I can Add the product successfully

  @author_Ankita @smoke @sanity @regression
  Scenario: Verify Products Price Display High To Low Successfully
    Given I am on Homepage
    When I mouse hover and click on Laptops & Notebooks tab
    And I  select Menu Show All Laptops & Notebooks
    And I  Select Sort By Price (High > Low)
    Then I should see the Product price will arrange in High to Low order.

  @author_Ankita @smoke @regression
  Scenario: Verify That User Place Order Successfully
    Given I am on Homepage
    When I mouse hover and click on Laptops & Notebooks tab
    And I  select Menu Show All Laptops & Notebooks
    And I  Select Sort By Price (High > Low)
    And I select Product "HP LP3065"
    Then I should see the text "HP LP3065"
    When Click on Add to Cart button
    Then I should see the message "Success: You have added MacBook to your shopping cart!"
    When I Click on link “shopping cart” display into success message
    Then I should see the text "Shopping Cart" after successful added
    And I should see the Product name "HP LP3065"
    When I change the Quantity to "2"
    And I click on Update button
    Then I should see the message "Success: You have modified your shopping cart!" after modified
    And I should see the Total "£149.45"
    When I click on Checkout button
    Then I should see the text "Checkout" on shopping cart page
    And I should see the text "New Customer" on checkout page
    When I click on Guest Checkout radio button
    And I click on Continue button
    And I fill in the mandatory fields
    And I click on Continue button in guest
    And I add Comments About my order into text area
    And I click on Continue button in shipping
    And I check the Terms & Conditions check box
    And I click on Continue button next
    Then I click on confirm order button
