Feature: This is the Instagram login feature
Scenario Outline: This is the Login Scenario
Given user is on the login URL page "https://www.instagram.com/"
When user should enter the valid username & password
xamples:
|username|password|
|admin|admin123|
And user sholud click the login button
Then get the failure results

Scenario: User is on Home Page
Given user selecting the product
When user can add to the card
And user can open the card page
Then user can able to see payment page