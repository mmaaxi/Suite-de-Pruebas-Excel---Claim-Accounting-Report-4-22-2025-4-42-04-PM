Feature: Validar modificación de la fórmula en la columna 'IVA Acumulado'

  Scenario: Validar fórmula IVA Acumulado en Excel
    Given El usuario tiene acceso al archivo Excel con la columna 'IVA Acumulado'
    When El usuario inspecciona la fórmula presente en la columna 'IVA Acumulado'
    Then La fórmula debe haberse modificado para incluir los tipos de IVA (16%, Fronterizo, 0%, Exento) exceptuando el 'IVA retenido'