package pages;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class tc_002Page {

    WebDriver driver;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openExcelDocument(String filePath) {
        // Logic to open Excel document
    }

    public void verifyConcatenationFormula() {
        try (FileInputStream fis = new FileInputStream(new File("path/to/excel/document.xlsx"));
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(1);  // Assuming the formula is at row 2 (index 1)
            Cell cell = row.getCell(2); // Column C (index 2)

            FormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator();
            assertEquals("Checking formula", "CONCATENATE(D2,\"_\",H2,\"_\",U2,\"_\",O2,\"_\",E2)", cell.getCellFormula());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void assertCorrectKeyGeneration() {
        // Logic to assert that the key generation is correct using concatenation results
    }
}