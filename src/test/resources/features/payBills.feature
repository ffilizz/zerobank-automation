Feature: Navigate to Pay Bills page

  Background: open login page
    Given user is on the login page
    When the user navigate to "Page Bills"page

  Scenario:Pay Bills page should have the title Zero – Pay Bills
   Then Pay Bills Page title should be "Zero - Pay Bills"

  Scenario: User should be complete Pay operation successfully
    When user completes a successful Pay operation,
    Then "The payment was successfully submitted" should be displayed

  Scenario:

