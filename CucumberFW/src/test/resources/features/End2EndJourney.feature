@search
Feature: Healtch Check Script for CSCart App
  I will navigate the App till Search


  Scenario: Search Product computer
    When I Search the Product "computer"
    And I add a product with id as "1234"
    And I click on Checkout
    And I enter payment detils
    Then Page is navigated to Search Page
    