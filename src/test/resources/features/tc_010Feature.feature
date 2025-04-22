Feature: Validar inserción de 'Status Pago Código' y renombramiento de 'Status de Pago'

  Scenario: Verificar columnas en el reporte de pagos
    Given Estoy en la página del reporte de pagos
    When Verifico si la columna 'Status Pago Código' está junto a 'Fecha de Pago'
    Then La columna 'Status Pago Código' se muestra correctamente
    When Confirmo si la columna 'Status de Pago' ha sido renombrada
    Then El encabezado refleja el nuevo nombre 'Descripción Status Pago'