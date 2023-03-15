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
    When  User logged in verify it displays Dashboard
    #Then  User close the Browser
    Then  User opens the new tab and enters URL "https://practice.automationtesting.in/"
    #Given User opens the Browser
    #Then  User enters URL "https://practice.automationtesting.in/",application page should be displayed
    #Then  User clicks on My Account Menu

  @RememberMe2 @FunctionalTesting
  Scenario: Verify RememberMe
    Then  User enters URL "https://practice.automationtesting.in/",application page should be displayed
    Then  User clicks on My Account Menu

