@account_summary
Feature: Navigate to Account Summary page

  Background: open login page
    Given user is on the login page

  Scenario: Account Summary page components
    Given the user is logged in
    Then Page title shows "Zero - Account Summary"
      And Account summary page should have to following account types:
        |Cash Accounts|
        |Investment Accounts|
        |Credit Accounts|
        |Loan Accounts|
      And Credit Accounts table must have columns Account, Credit Card and Balance
        |Account|
        |Credit Card|
        |Balance|
