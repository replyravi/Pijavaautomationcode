
@forgotpassword
Feature: Forget password for PI application

Scenario: Forget password for English language
  
Given Click on forgot password
When Navigate to Forgot password page
Then Enter email address
Then Enter phone number
Then Click on continue button
When Navigate to Rest password page
Then Click on reset via email
Then Click on continue button via email
When Navigate to Rest password page otp
Then Enter otp and click continue
Then Enter password and confirm password
Then Click finish
Then Click back to log inFeature