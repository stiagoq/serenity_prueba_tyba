Feature: login home page

  Scenario Outline: Login successful
    Given the user on the home page
    When the user type the '<username>' and '<password>'
    Then the app shows the init page
    Examples:
      |username  |password|
      |Santiagooo|S4ntii14g0|
      |Santi7    |S4nt14g000|


