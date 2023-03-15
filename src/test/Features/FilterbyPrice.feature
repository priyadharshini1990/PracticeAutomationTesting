Feature: Filter By Price

    @Filter @FunctionalTesting
  Scenario: User should able to apply Filter by Price
Given User opens the Browser
Then  User enters URL "https://practice.automationtesting.in/",application page should be displayed
Then  User clicks on My Account Menu
Then  User Close the ad and return to default content
Then  User can able to enter Username "Trainingproject2@gmail.com"
And   password "Practice.automation@testing"
Then  User clicks on Login Button
When  Logged in, User clicks on shop menu
Then  User apply filter by Price
Then  User clicks on filter
Then  User can verify whether it navigates to particular page
Then  User takes a screenshot and stores it
Then  User close the Browser