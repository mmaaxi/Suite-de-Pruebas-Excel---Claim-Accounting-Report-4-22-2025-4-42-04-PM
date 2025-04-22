Feature: Validar actualización de la fórmula en el movimiento de "pago" para "Monto Acumulado Folio OPC (2121)"

  Scenario: Verificar registro y fórmula en movimiento de pago
    Given El registro de un movimiento de pago en el Excel está identificado
    When Verifico la celda de "Monto Acumulado Folio OPC (2121)" en el movimiento de pago
    Then La fórmula aplica correctamente y calcula el total de IVA y otros montos asociados