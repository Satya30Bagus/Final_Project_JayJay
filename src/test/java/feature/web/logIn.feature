@login
Feature: Login

  @success-login
  Scenario: Login using valid user name and password
    Given User is on landing page
    When User click login button in navigation
    And User input username with "satyabagusputra98"
    And User input password with "rahasia"
    And User click login button
    Then User able to see message on navigation "Welcome satyabagusputra98"

  @login-invalid-username
  Scenario: Login using invalid user name and invalid password
    Given User is on landing page
    When User click login button in navigation
    When User input username with "satyabagusputra90"
    And User input password with "wrongpassword"
    And User click login button
    And User stay on landing page
    Then User able to see error message "Wrong password"