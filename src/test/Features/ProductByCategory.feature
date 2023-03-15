Feature:Product Under Categories

  @ProductCategories  @FunctionalTesting
Scenario: Verify user should able to shop
Given User opens the Browser
Then  User enters URL "https://practice.automationtesting.in/",application page should be displayed
Then  User clicks on My Account Menu
Then  User Close the ad and return to default content
Then  User can able to enter Username "Trainingproject2@gmail.com"
And   password "Practice.automation@testing"
Then  User clicks on Login Button
When  Logged in, User clicks on shop menu
Then  User select JavaScript under Product Categories
Then  User can verify whether it displays JavaScript page
Then  User takes a screenshot
Then  User clicks on Add to basket button which adds that book to basket
Then  User should able to click on view Basket
Then  User close the Browser