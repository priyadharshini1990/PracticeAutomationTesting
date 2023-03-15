Feature:Register Functionality
  @Register @SmokeTesting
  Scenario: User able to Register an Account
    Given User opens the Browser
    Then  User enters URL "https://practice.automationtesting.in/",application page should be displayed
    Then  User clicks on My Account Menu
    Then  User Close the ad and return to default content
    Then  User can able to enter Register Email address
    And   password
    Then  User clicks on Register Button
    When  User registered verify it displays Dashboard
    And   User close the Browser