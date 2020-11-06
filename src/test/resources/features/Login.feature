@Login
Feature:Login
  As an user, I want to be able to login with username and password

  Background: open login page
    Given user is on the login page

    @authorized_user
    Scenario: Login as authorized user and verify that account summary page should be displayed
    When User logs in with valid credentials
    Then Account summary page should be displayed

    @unauthorized_user
    Scenario: Login as unauthorized user and verify that error message "Login and/or password are wrong" should be displayed
    When  Users with wrong username or wrong password should not be able to login
      And Users with blank username or password should also not be able to login
      Then Error message "Login and/or password are wrong." should be displayed


