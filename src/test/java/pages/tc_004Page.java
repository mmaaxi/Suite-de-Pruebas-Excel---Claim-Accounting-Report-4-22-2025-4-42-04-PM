package pages;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class tc_004Page {

    private Workbook workbook;
    private Sheet sheet;

    public void openExcelFile() {
        try {
            FileInputStream file = new FileInputStream(new File("path/to/excel/file.xlsx"));
            workbook = WorkbookFactory.create(file);
            sheet = workbook.getSheetAt(0); // Assuming the data is in the first sheet
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inspectEstadoColumnValues() {
        for (int i = 1; i <= sheet.getLastRowNum(); i++) { // Starting from row 1 to skip headers
            String estadoValue = sheet.getRow(i).getCell(1).getStringCellValue(); // Assuming 'estado' is the second column
            System.out.println("Estado column value at row " + i + ": " + estadoValue);
        }
    }

    public boolean verifyEstadoColumnValues() {
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            String estadoValue = sheet.getRow(i).getCell(1).getStringCellValue(); // Assuming 'estado' is the second column
            // Add your validation logic according to the defined requirements here
            if (!isValidEstadoValue(estadoValue)) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidEstadoValue(String estadoValue) {
        // Implement the validation logic according to the requirements
        return true; // Placeholder
    }
}