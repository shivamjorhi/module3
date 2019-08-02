@RegressionTest
Feature: ECommerce Transfer
Scenario: Decrease product quantity from bag page
Given This is a blank Test
@SmokeTest @End2End
Scenario: Buy a product with cash payment
Given This is a blank Test
@SmokeTest @End2End
Scenario: Buy a product with CC payment
Given This is a blank Test
@End2End
Scenario Outline: Payment Declined
Given This is blank Test
Examples:
|Payment Method|
|"CC card"|
|"DD card"|
|"Bank Transfer"|
|"PayPal"|
|"Cash"|
