  Feature:PracticeAutomationTesting

    @Login1 @SmokeTesting @regressionTesting
    Scenario: Verify user should able to Login
    Given User opens the browser
    Then  User enters URL,application page should be displayed
    Then  User clicks on My Account Menu
    Then  User Close the ad and return to default content
    Then  User can able to enter Username
    And   Password
    Then  User clicks on Login Button
    When  User logged in verify whether it navigate to Dashboard
    Then  User takes a screenshot and stores it
    Then  User close the Browser

     @Shop1  @FunctionalTesting1
     Scenario: Verify user should able to shop
     Given User opens the browser
     Then  User enters URL,application page should be displayed
     Then  User clicks on My Account Menu
     Then  User Close the ad and return to default content
     Then  User can able to enter Username
     And   Password
     Then  User clicks on Login Button
     When  Logged in, User clicks on shop menu
     Then  User select JavaScript under Product Categories
     Then  It navigates to particular product page
     Then  User clicks on Add to Basket button which adds that book to Basket
     When  User add the item to Basket,user should able to click on view Basket to verify
     Then  User takes a screenshot and stores it
     Then  User close the Browser

        @FunctionalTesting2
         Scenario: Verify user should able to checkout through items menu
         Given User opens the browser
         Then  User enters URL,application page should be displayed
         Then  User clicks on My Account Menu
         Then  User Close the ad and return to default content
         Then  User can able to enter Username
         And   Password
         Then  User clicks on Login Button
         When  Logged in, User clicks on shop menu
         Then  User select JavaScript under Product Categories
         When  It navigates to particular product page
         Then  User clicks on Add to Basket button which adds that book to Basket
         Then  User can able to view the menu Items with price
         And   User clicks on menu Items
         Then  User should able to Proceed to Checkout
         Then  User takes a screenshot and stores it
         And   User close the Browser

         @CheckOut1 @FunctionalTesting3
         Scenario: Verify user should able to proceed checkout
            Given User opens the browser
            Then  User enters URL,application page should be displayed
            Then  User clicks on My Account Menu
            Then  User Close the ad and return to default content
            Then  User can able to enter Username
            And   Password
            Then  User clicks on Login Button
            When  Logged in, User clicks on shop menu
            Then  User select JavaScript under Product Categories
            When  It navigates to particular product page
            Then  User clicks on Add to Basket button which adds that book to Basket
            When  User add the item to Basket,user should able to click on view Basket to verify
            Then  User should able to Proceed to Checkout
            Then  User close the Browser

           @PlaceOrder1 @FunctionalTesting4 @EndToEndTesting1
           Scenario: Verify user should able to Place Order
            Given User opens the browser
            Then  User enters URL,application page should be displayed
            Then  User clicks on My Account Menu
            Then  User Close the ad and return to default content
            Then  User can able to enter Username
            And   Password
            Then  User clicks on Login Button
            When  Logged in, User clicks on shop menu
            Then  User apply filter by Price
            When  user can verify it navigates to the particular page
            Then  User clicks on Add to Basket button which adds that book to Basket
            When  User add the item to Basket,user should able to click on view Basket to verify
            Then  User clicks on Proceed to Checkout
            Then  User should verify Billing Details and Your Order
            And   User should able to select payment option
            Then  User should click on Place Order button
            When  Order placed user can verify with order number
            Then  User takes a screenshot and stores it
            Then  User close the Browser



