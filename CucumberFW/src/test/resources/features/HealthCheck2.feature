@search
Feature: Healtch Check Script for CSCart App
  I will navigate the App till Search

  Background: Open browser and navigate 1
    Given I open a browser
    And I navigate to env
    
  Scenario: Search Product computer 1
    When I Search the Product "computer"
    Then Page is navigated to Search Page
    
  Scenario: Search Product mobile 1
    When I Search the Product "mobile"
    Then Page is navigated to Search Page
    
  Scenario: Search Product computer and scroll 1
    When I Search the Product "computer"
    Then Page is navigated to Search Page
    And scroll the page