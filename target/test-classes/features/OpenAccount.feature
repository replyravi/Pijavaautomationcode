
@Openaccountflow 
Feature: Open account flow 

Scenario: Open account flow for English language
  
Given login with PI application
Given click on wallet 
Given click on open account button
Then select Thai nationality
Given click on start button
Given click skip button on referral page
When navigate to choose account page
Then click on continue button account page 
Given select all account check box
Given click on continue button check box
Given click active both add account feature option
When navigate to personal details page
Given click on continue button personal details page
Given click allow camera permission
Given camera on thai ID and take photo
When navigate to personal details page
Then select title in the option
Then scroll down and enter laser code
Given click on continue button laser code
