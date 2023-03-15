Feature: Proceed to Checkout through Items Menu

  @ItemsCheckout @FunctionalTesting
Scenario: User should able to checkout through items menu
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
Then  User clicks on Add to basket button which adds that book to basket
Then  User can able to view the Items with price and clicks on Items
Then  User can enter Coupon Code
And   User click on Apply Coupon
Then  User takes a screenshot of checkout page
Then  User verify and clicks on Proceed to Checkout
And   User close the Browser