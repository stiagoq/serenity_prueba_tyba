Feature: Add products and checkout
  @cartZZZZZZ
  Scenario: Add products to cart and checkout
    Given The user is in tab popular items
    When the user select and add of the products
    And the user enter of data in the form
    Then The user sees message of successful purchase

