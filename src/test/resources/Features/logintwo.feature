Feature: Login

@Test
Scenario: Verify user can login
Given Open application "<URL>"
Then Click on Singinbutton
Then Click on Signinlink
Then Enter user name and pass and click signin
Then Verify Signin 
 