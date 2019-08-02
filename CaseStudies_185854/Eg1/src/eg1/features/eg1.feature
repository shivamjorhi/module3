Feature: Log In and Out
Scenario: Logging In
Given I am not logged in as an administrator
When I go to the administrative page
And I fill in the fields
	|username|admin|
	|password|secret|
And I press "LogIn"
Then I should be on the administrative page
And I should see "LogOut"

Scenario: Logging Out
Given I am logged in as admin
When I press "LogOut"
Then I should return back to home page