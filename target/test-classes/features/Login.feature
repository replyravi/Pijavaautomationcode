@SignIn
Feature: SignIn for PI application

Scenario Outline: SignIn for English language
Given Open Pi Application
When Username and password show in Pi Application
Then Enter valid username and password
When Pi Application dashboard show
Then Navigate to setting and click on logout
