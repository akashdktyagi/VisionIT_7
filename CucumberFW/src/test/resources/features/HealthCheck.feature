@search
Feature: Healtch Check Script for CSCart App
  I will navigate the App till Search

  Background: Open browser and navigate
    Given I open a browser
    And I navigate to env
    
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
    
      #Scenario: Search Multiple Product computer
  #When I search and add products
  #|   CODE   | Quantity|
  #|H0217E3OE9|  5      |
  #|F01262AH0T|  6      |
  #When I Check out
  #
  #Scenario Outline: Searc and Add Multiple Products
  #When I search and add products with code as "<CODE>" and quantity "<Quantity>"
  #Examples: 
   #|   CODE   | Quantity|
  #|H0217E3OE9|  5      |
  #|F01262AH0T|  6      |
  