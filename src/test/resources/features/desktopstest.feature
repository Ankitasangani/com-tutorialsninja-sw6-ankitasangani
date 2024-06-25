Feature: Product add to cart successfully
  I want to navigate to the Desktops page
  As a User
  I can Add the product successfully

  @author_Ankita @smoke @sanity @regression
  Scenario: Verify Product Arrange In Alphabetical Order
    Given I am on Homepage
    When I mouse hover and click on Desktops tab
    And I  select Menu Show All Desktops
    And I  Select Sort By position Name: Z to A
    Then I should see the Product will arrange in Descending order.

  @author_Ankita @smoke @regression
  Scenario Outline: Verify Product Added To Shopping Cart SuccessFully
    Given I am on Homepage
    When I Mouse hover on Currency Dropdown and click
    And I Mouse hover on £Pound Sterling and click
    Then I mouse hover and click on Desktops tab
    And I Select Sort By position Name: A to Z
    And I Select product "<product>"
    And I Enter Qty 1 using Select class.
    And Click on Add to Cart button
    And I should see the Message "Success: You have added product to your shopping cart!"
    And I Click on link “shopping cart” display into success message
    And I should see the text Shopping Cart
    And I should able to see the Product name "<product>"
    And I should see the Model "<model>"
    And I should see Total "<price>"
    Examples:
      | product      | model      | price   |
      | HTC Touch HD | Product 1  | £74.73  |
      | iPhone       | product 11 | £75.46  |
      | iPod Classic | product 20 | £74.73  |
      | MacBook      | Product 16 | £368.73 |
      | MacBook Air  | Product 17 | £736.23 |
      | Sony VAIO    | Product 19 | £736.23 |

