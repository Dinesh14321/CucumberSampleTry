Feature: This is the Instagram login feature
Scenario: This is the Login Scenario
Given user is on the login URL page "https://www.instagram.com/"
When user should enter the valid username & password
And user sholud click the login button
Then get the failure results