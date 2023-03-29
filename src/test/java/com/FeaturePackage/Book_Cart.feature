Feature: BookCart Application testing

  Scenario: Positive Login functionality
    Given user click the url "https://bookcart.azurewebsites.net/"
    And user clicks the login button
    And user enter the username as "ortoni"
    And user enter the password as "pass1234"
    When user enter the login button
    Then Login page should be success

  Scenario: Negative Login functionality
    Given user clicks the url "https://bookcart.azurewebsites.net/"
    And user clicks login button
    And user enter the username "Dinesh"
    And user enter the password "password21"
    When user enter login button
    Then Login should fail

  Scenario Outline: Add to cart functionality
    Given User navigate to the bookcart application "https://bookcart.azurewebsites.net/"
    When user login to the application with "<username>" and "<password>"
    And user search for a "<book>"
    And user add the book to the cart
    Then the card should be updated

    Examples: 
      | username | password | book       |
      | ortoni   | pass1234 | Robbie     |
      | ortonikc | pass1234 | Rot & Ruin |
