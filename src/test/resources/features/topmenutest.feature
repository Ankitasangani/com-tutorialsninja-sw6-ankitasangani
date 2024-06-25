Feature: Navigate to different pages
  I want to navigate to the different pages
  As a User
  I can see all the products

  @author_Ankita @smoke @sanity @regression
  Scenario: Verify User Should Navigate To Desktops Page Successfully
    Given I am on Homepage
    When I mouse hover and click on Desktops tab
    And I  select Menu Show All Desktops
    Then I should see the text Desktops

  @author_Ankita @smoke @regression
  Scenario: Verify User Should Navigate To Laptops And Notebooks Page Successfully
    Given I am on Homepage
    When I mouse hover and click on Laptops & Notebooks tab
    And I  select Menu Show All Laptops & Notebooks
    Then I should see the text Laptops & Notebooks

  @author_Ankita @regression
  Scenario: Verify User Should Navigate To Components Page Successfully
    Given I am on Homepage
    When I mouse hover and click on Components tab
    And I  select Menu Show All Components
    Then I should see the text Components



