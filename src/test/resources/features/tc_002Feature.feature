Feature: Validate Concatenation Formula for Key in Column C

  Scenario: Verify concatenation formula for key creation in Excel
    Given the user opens the exported Excel document
    When the user checks the formula for the key in column C
    Then the key should be generated correctly using columns D, H, U, O, and E