package pages;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class tc_007Page {

    private Workbook workbook;
    private Sheet sheet;

    public void openExcelFile() {
        try {
            FileInputStream file = new FileInputStream(new File("path/to/excel.xlsx"));
            workbook = WorkbookFactory.create(file);
            sheet = workbook.getSheetAt(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void findColumns(String column1, String column2, String column3) {
        // In a real scenario, implement logic to search columns within the sheet
    }

    public boolean verifyColumns() {
        // Example code to check the existence of columns
        Row row = sheet.getRow(0);
        boolean col1Exists = false, col2Exists = false, col3Exists = false;
        
        for (Cell cell : row) {
            String cellValue = cell.getStringCellValue();
            if (cellValue.equals("IVA 0%")) {
                col1Exists = true;
            }
            if (cellValue.equals("IVA exento")) {
                col2Exists = true;
            }
            if (cellValue.equals("IVA retenido")) {
                col3Exists = true;
            }
        }
        return col1Exists && col2Exists && col3Exists;
    }
}