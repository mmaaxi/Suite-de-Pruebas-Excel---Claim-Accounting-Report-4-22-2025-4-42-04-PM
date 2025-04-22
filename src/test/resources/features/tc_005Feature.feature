Feature: Validar adición y fórmula de la columna 'Monto acumulado Folio Reserva 5401'

  Scenario: Verificar la posición y la fórmula de la columna 'Monto acumulado Folio Reserva 5401'
    Given La página de transacciones está abierta
    When Inserto la columna 'Monto acumulado Folio Reserva 5401'
    Then Verifico que la columna 'Monto acumulado Folio Reserva 5401' está a la derecha de la columna 'Monto (reserva)'
    And Verifico que la fórmula sume el monto acumulado inmediato anterior y el monto de reserva actual