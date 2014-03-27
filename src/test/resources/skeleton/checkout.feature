Feature: Checkout

  In order to serve customers more quickly
  the cashier should use the till to total
  the number of items.

  Rules:
  - Prices already exist in the system
  - One button for each product
  - Just Expresso for now (add more later)

  Background:
    Given the price of an expresso is 250c
    Given the price of a croissant is 110c

  Scenario: One expresso
    When I click expresso
    Then it should display 250c

  Scenario: Two expressos
    When I click expresso
    And I click expresso
    Then it should display 500c

  Scenario: One expresso and a croissant
    When I click expresso
    And I click croissant
    Then it should display 360c

