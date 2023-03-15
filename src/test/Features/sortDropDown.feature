@Sorting

Feature:  Default Sorting

  Background:Steps until we select the sorting option

    Given User opens the Browser
    Then  User enters URL "https://practice.automationtesting.in/",application page should be displayed
    Then  User clicks on My Account Menu
    Then  User Close the ad and return to default content
    Then  User can able to enter Username "Trainingproject2@gmail.com"
    And   password "Practice.automation@testing"
    Then  User clicks on Login Button
    When  Logged in, User clicks on shop menu

  @Newness
  Scenario:  User select default sorting
   Then  User selects based on Newness from sorting dropdown
   And  User close the Browser

  @Popularity
  Scenario:  User select default sorting
  Then  User selects based on Popularity from sorting dropdown
  And  User close the Browser

  @AverageRating
  Scenario:  User select default sorting
  Then  User selects based on AverageRating from sorting dropdown
  And  User close the Browser