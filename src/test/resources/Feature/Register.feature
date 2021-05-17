@ExamPortalRegistration
Feature: Title of your feature

  @RegisterHappyPath
  Scenario Outline: Launch exam portal
    Given User launches exam portal URL
    When User lands on home page
    Then User clicks on register button
    Then User gets redirected to register page
    And User fills registration form with details
      | Username | Password      | Firstname | Lastname | Email          | Phone      |
      | TestUser | NewPassord01! | Test      | User     | test@gmail.com | 9823447223 |
    And clicks on Register button
    Then Registration gets successful and alerts is displayed with user ID

    Examples:
      | examportalurl         |
      | http://localhost:4200 |
  