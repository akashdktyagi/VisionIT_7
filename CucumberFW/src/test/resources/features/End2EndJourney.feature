@e2e
Feature: Healtch Check Script for CSCart App
  I will navigate the App till Search


  Scenario: Search Multiple Product computer
  When I search and add products
  |   CODE   | Quantity|
  |H0217E3OE9|  5      |
  |F01262AH0T|  6      |
  When I Check out
  
  Scenario Outline: Searc and Add Multiple Products
  When I search and add products with code as "<CODE>" and quantity "<Quantity>"
  Examples: 
   |   CODE   | Quantity|
  |H0217E3OE9|  5      |
  |F01262AH0T|  6      |
  
		
    