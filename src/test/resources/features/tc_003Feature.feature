Feature: Validar inserción de la columna 'Estado Código'

  Scenario: Revisar el Excel exportado para localizar la nueva columna 'Estado Código'
    Given el usuario ha exportado el Excel
    When el usuario revisa el Excel exportado
    Then la columna 'Estado Código' se encuentra en la posición correcta