Feature: Employee Management feature

  Background: Application is running
    Given Application is Running with "Firefox"

  Scenario: To Validate Employee List On Employee Edit Screen
    Given when we Logged into EMS Application with "wanikirtesh@gmail.com" and "password"
    And Navigate to Employee Edit Screen
    Then I should get correct list of employee as per database
