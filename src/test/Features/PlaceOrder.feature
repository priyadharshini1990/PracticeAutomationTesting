Feature: Place Order

  @PlaceOrder @FunctionalTesting @EndToEndTesting
Scenario: Verify user should able to Place Order
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
Then  User should able to click on view Basket
Then  User clicks on Proceed to Checkout
Then  User enter FirstName
And   LastName
And   CompanyName
And   PhoneNumber
And   Street Address
And   Apartment
And   City
And   Zipcode
And   User should able to select payment option
Then  User should click on Place Order button
When  Order placed user can verify
Then  User takes a screenshot of Placed order page
Then  User close the Browser