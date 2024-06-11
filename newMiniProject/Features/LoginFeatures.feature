Feature: Login

  @smoke
  Scenario: Successful login with valid credentials
    Given User launch chrome browser
    When User opens url "https://www.saucedemo.com/"
    And User enter username "standard_user" and password "secret_sauce"
    And Click on login
    Then Page title should be "Swag Labs"
    When User click on handBurger icon
    And Click on logout 
    Then Page title should be "Swag Labs"
    And Close the browser 
    
    
 Scenario Outline: Successful login with diffrent credentials
    Given User launch chrome browser
    When User opens url "https://www.saucedemo.com/"
    And User enter username "<username>" and password "<password>"
    And Click on login
    Then Page title should be "Swag Labs"
    And Close the browser 
    
    Examples:
    |username|password|
    |locked_out_user|secret_sauce|
    |rithesh|secret_sauce|
    |visual_user|secret_sauce|