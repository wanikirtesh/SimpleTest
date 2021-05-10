Feature: Login functionality

  Background: Application is running
    Given Application is Running with "firefox" _loginFeature

  Scenario: : Validate user login with valid username and password scenario
    Given when we Logged into EMS Application with "wanikirtesh@gmail.com" and "password" _loginFeature
    Then User Must able to Login
    And User Logging Out

  Scenario Outline: : Validate user login with valid username and password
    Given when we Logged into EMS Application with "<user>" and "<password>" _loginFeature
    Then User Must able to Login
    And User Logging Out

    Examples:
      | user                  | password |
      | wanikirtesh@gmail.com | password |
      | waniashwini@gmail.com | password |
