@tag
Feature: Healtch Check Script for CSCart App
  I will navigate the App till Search

  Background: Open browser and navigate
    Given I open a browser
    And I navigate to URL "http://demo.cs-cart.com/"
    
  @tag1
  Scenario: Search Product
    When I Search the Product "computer"
    Then Page is navigated to Search Page
    
  @tag1
  Scenario: Navigating the CSCart App till Search
    When I Search the Product "mobile"
    Then Page is navigated to Search Page