Feature: Bank login functionality
Scenario: Verify the user is able to login
Given If user is on home page
When Click on login link
And Enter the username and password
And Click on Submit button
Then Check the Logout button
