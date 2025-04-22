package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {

    WebDriver driver;

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openExcelFile() {
        // logic to open Excel file
    }

    public void locateOriginalColumn() {
        // logic to locate the column originally named 'Monto Acumulado Folio OPC'
    }

    public boolean isColumnRenamedCorrectly() {
        // logic to verify the renaming of the column
        // This should confirm that the column is now labeled as 'Monto Acumulado Folio OPC (2121)'
        return driver.findElement(By.xpath("//column[contains(text(), 'Monto Acumulado Folio OPC (2121)')]")) != null;
    }
}