@account_activity
Feature: Navigate to Account Activity page

  Background: open login page
    Given user is on the login page

  Scenario: Account Activity page components
    Given the user is logged in to Acccount activity
    Then ActivityPage title shows "Zero - Account Activity"
    And Account drop down default should be "Savings":
    And Account drop down should have the following options
      |Savings|
      |Checking|
      |Loan|
      |Credit Card|
      |Brokerage|
    Then Transactions table should have column names
      |Date|
      |Description|
      |Deposit|
      |Withdrawal|