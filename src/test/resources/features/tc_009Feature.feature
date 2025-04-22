Feature: Validar inserción de columnas en el Excel

  Scenario: Verificar que las columnas 'Folio Pre solicitud' y 'Folio de Pago' existan en el Excel
    Given el Excel está abierto
    When reviso que el Excel incluya la columna 'Folio Pre solicitud' a la derecha de la columna 'Ramo'
    Then la columna 'Folio Pre solicitud' existe y se muestra, aunque esté vacía
    And reviso que el Excel incluya la columna 'Folio de Pago' a la derecha de 'Folio Pre solicitud'
    Then la columna 'Folio de Pago' existe y se muestra, aunque esté vacía