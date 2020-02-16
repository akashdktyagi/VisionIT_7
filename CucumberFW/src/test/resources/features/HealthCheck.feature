@search
Feature: Healtch Check Script for CSCart App
  I will navigate the App till Search

  Background: Open browser and navigate
    Given I open a browser
    And I navigate to URL "http://demo.cs-cart.com/"
    
  Scenario: Search Product computer
    When I Search the Product "computer"
    Then Page is navigated to Search Page
    
  Scenario: Search Product mobile
    When I Search the Product "mobile"
    Then Page is navigated to Search Page
    
  Scenario: Search Product computer and scroll
    When I Search the Product "computer"
    Then Page is navigated to Search Page
    And scroll the page