package pages;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class tc_003Page {

    private final String filePath = "path_to_exported_excel.xlsx";

    public void exportarExcel() {
        // Método simulado para exportar el Excel desde la aplicación
    }

    public void abrirExcel() {
        // Métodos simulados para abrir y preparar el análisis del Excel
    }

    public boolean verificarColumnaEstadoCodigo() {
        try (FileInputStream file = new FileInputStream(new File(filePath))) {
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            Row firstRow = sheet.getRow(0);
            Cell cell = firstRow.getCell(9);  // Columna 'Estado Código' está a la derecha de la columna 'i', que es índice 8

            if (cell != null && cell.getStringCellValue().equals("Estado Código")) {
                return true;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}