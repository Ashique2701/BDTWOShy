Feature: Home page




@Test
Scenario: Verify search result display

Given Open application "<URL>"
Then Enter XPS in Searchfiled
Then Click on Searchlink
Then Verify search results display
