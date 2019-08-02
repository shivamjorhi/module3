Feature: Testing my framework
Background: 
Given I have two numbers
Scenario: Add two numbers 2 and 4
When I add "both" the numbers
Then numbers should be added
Scenario: Add three numbers 2 and 4 and 6
And there is third number
When I add "all" the numbers
Then numbers should be added
And check the result