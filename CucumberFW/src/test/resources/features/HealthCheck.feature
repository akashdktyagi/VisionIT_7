@tag
Feature: Healtch Check Script for CSCart App
  I will navigate the App till Search

  @tag1
  Scenario: Navigating the CSCart App till Search
    #Given I open a "chrome" browser
    Given I open a browser
    And I navigate to URL "http://demo.cs-cart.com/"
    When I Search the Product "computer"
    Then Page is navigated to Search Page
    
    #When I enter text "computer" in Search Box
    #And I click on Submit Button


