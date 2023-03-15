Feature:Lost Your Password Functionality

  @LostPassword @FunctionalTesting
  Scenario: Verify user should able to change the password
    Given User opens the Browser
    Then  User enters URL "https://practice.automationtesting.in/",application page should be displayed
    Then  User clicks on My Account Menu
    Then  User Close the ad and return to default content
    Then  User can able to enter Username "Trainingproject2@gmail.com"
    #And   password "Practice.automation@testing"
    Then  User clicks on Lost your password
