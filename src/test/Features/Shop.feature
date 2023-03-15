Feature:Shop Functionality
  @Shop @FunctionalTesting
Scenario: User able to add item to basket through Shop
Given User opens the Browser
Then  User enters URL "https://practice.automationtesting.in/",application page should be displayed
Then  User clicks on My Account Menu
Then  User Close the ad and return to default content
Then  User can able to enter Username "Trainingproject2@gmail.com"
And   password "Practice.automation@testing"
Then  User clicks on Login Button
When  Logged in, User clicks on shop menu
Then  User clicks on Add to Basket button which adds that book to Basket
When  User add the item to Basket,it displays view basket to verify
Then  User should able to click on view Basket
And   User close the Browser