Feature:RememberMe Functionality

  Background: To Check Remember Me
    Given User opens the Browser

  @RememberMe1 @FunctionalTesting
  Scenario: Verify RememberMe
    Then  User enters URL "https://practice.automationtesting.in/",application page should be displayed
    Then  User clicks on My Account Menu
    Then  User Close the ad and return to default content
    Then   User can able to enter Username "Trainingproject2@gmail.com"
    And   password "Practice.automation@testing"
    Then  User clicks on RememberMe checkbox
    Then  User clicks on Login Button
    Then  User opens the new tab
    Then  User switch to previous window and closed it
    Then  User enters URL "https://practice.automationtesting.in/",application page should be displayed
    Then  User clicks on My Account Menu

  @RememberMe2 @FunctionalTesting
  Scenario: Verify RememberMe
    Then  User enters URL "https://practice.automationtesting.in/",application page should be displayed
    Then  User clicks on My Account Menu

