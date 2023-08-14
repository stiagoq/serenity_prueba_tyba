Feature: Enter the data to create a new user

  Scenario: Register a new user
    Given User is in the registration page
    When User enters the data required in the form
    Then it shows me a successful registration
