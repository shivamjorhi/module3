Feature: login to the system
As a user, I want to login into the system when I provide username and pass

Scenario Outline: Verify that can login gmail
Given I launch "https://accounts.google.com" page
When I fill in "Email" with <Email>
And I fill in "Password" with <Pass>
And I click on "Sign In" button
Then I am on the "Home" page
Scenarios:
|Email|Pass|
|kms.admin@gmail.com|kms@2013|
|kms.user@gmail.com|kms@1234|