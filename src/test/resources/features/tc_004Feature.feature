Feature: Validate the update of the 'estado' column fields

  Scenario: Verify that the values in the 'estado' column are updated correctly
    Given I have the Excel file open
    When I inspect the values of the 'estado' column
    Then the values should be updated according to the defined requirements