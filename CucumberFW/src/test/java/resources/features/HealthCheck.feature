@tag
Feature: Healtch Check Script for CSCart App
  I will navigate the App till Search

  @tag1
  Scenario: Navigating the CSCart App till Search
    Given I open a "chrome" browser
    And I navigate to URL "http://demo.cs-cart.com/stores/e1c181e71211f4d1/"
    When I Search the Product "computer"
    Then Page is navigated to Search Page
    
    #When I enter text "computer" in Search Box
    #And I click on Submit Button


