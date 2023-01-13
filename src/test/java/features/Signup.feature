
 @Signuptest
Feature: SignUp for PI application

Scenario Outline: SignUp for English language
Given Launch Pi application
Given Change language and click on Sign Up
Then Click on checkbox term and condition
Then Click on continue
Then Enter email id and phone number
Then Click on continue tap
When Verify email page open
Then Click on send verification code
Then Enter verification code
When Verify mobile phone page open
Then Click on send verification code for mobile
Then Enter verification code for mobile
Then Enter password and confirm password and click finish

