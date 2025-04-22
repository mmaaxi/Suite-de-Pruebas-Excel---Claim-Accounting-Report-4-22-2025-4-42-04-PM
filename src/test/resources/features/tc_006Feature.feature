Feature: Validar renombramiento de la columna 'Monto Acumulado Folio OPC'

  Scenario: Renombramiento de columna en Excel
    Given I open the Excel file
    When I locate the column originally named 'Monto Acumulado Folio OPC'
    Then I see the column is now displayed as 'Monto Acumulado Folio OPC (2121)'