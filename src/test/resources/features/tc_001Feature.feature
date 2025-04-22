Feature: Validate Claim Accounting Report Export

  Scenario: Export Claim Accounting Report
    Given the user is on the Canned Reports module
    When the user selects the 'Claim Accounting Report' to export
    Then the system should export an Excel document with the defined modifications