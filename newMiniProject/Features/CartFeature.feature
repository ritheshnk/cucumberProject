Feature: AddToCart

Scenario: Successful login with valid credentials
    Given User launch chrome browser
    When User opens url "https://www.saucedemo.com/"
    And User enter username "standard_user" and password "secret_sauce"
    And Click on login
    Then Page title should be "Swag Labs"
    And User clicks on any items add to cart
    And User clicks on cart 
    Then User verify cart items
    And Close the browser
