Feature: Validate addition of columns for IVA

  Scenario: Verify existence of IVA columns in Excel
    Given I have opened the Excel file
    When I look for the columns "IVA 0%", "IVA exento", and "IVA retenido"
    Then I should see the columns are present and correctly located