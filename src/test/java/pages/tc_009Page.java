package pages;

import org.openqa.selenium.WebDriver;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class tc_009Page {

    WebDriver driver;
    Workbook workbook;

    public void openExcel() {
        try {
            FileInputStream fis = new FileInputStream(new File("ruta/del/archivo.xlsx"));
            workbook = WorkbookFactory.create(fis);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo abrir el archivo Excel.");
        }
    }

    public List<String> getColumnNames() {
        List<String> columnNames = new ArrayList<>();
        Sheet sheet = workbook.getSheetAt(0);
        Row headerRow = sheet.getRow(0);

        for (Cell cell : headerRow) {
            columnNames.add(cell.getStringCellValue());
        }
        return columnNames;
    }

    public boolean isColumnPresent(String columnName) {
        return getColumnNames().contains(columnName);
    }

    public boolean isColumnRightOf(String leftColumn, String rightColumn, List<String> columnNames) {
        int leftIndex = columnNames.indexOf(leftColumn);
        int rightIndex = columnNames.indexOf(rightColumn);
        return leftIndex != -1 && rightIndex != -1 && (rightIndex - leftIndex) == 1;
    }

}