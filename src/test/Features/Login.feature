Feature:Login Functionality

  @Login @SmokeTesting
  Scenario Outline: Verify user should able to Login
    Given User opens the Browser
    Then  User enters URL "https://practice.automationtesting.in/",application page should be displayed
    Then  User clicks on My Account Menu
    Then  User Close the ad and return to default content
    Then  User can able to enter email address "<email address>"
    And   Password "<password>"
    Then  User clicks on Login Button
    #When  User logged in verify it displays Dashboard
    Then  User takes a screenshot of Login Page
    Then  User close the Browser
    Examples:
      |email address                  |password|
      |Trainingproject2@gmail.com|Practice.automation@testing |
      |Trainingproject@com       |123456789                   |
      |Trainingproject2@gmail.com |                           |

