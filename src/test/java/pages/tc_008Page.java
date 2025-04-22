package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_008Page {
    WebDriver driver;

    // Constructor
    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By paymentRecordLocator = By.id("paymentRecord"); // Adjust as necessary
    By formulaCellLocator = By.id("formulaCell"); // Adjust as necessary

    // Methods
    public boolean isPaymentRecordDisplayed() {
        WebElement paymentRecord = driver.findElement(paymentRecordLocator);
        return paymentRecord.isDisplayed();
    }

    public void verifyFormulaInCell(String cellLocator) {
        WebElement formulaCell = driver.findElement(By.id(cellLocator));
        String formula = formulaCell.getAttribute("formula");
        String expectedFormula = "=Z4+AD5+AE5+AH5+AC5+AB5+AM5";
        assert formula.equals(expectedFormula) : "La fórmula no coincide con la esperada.";
    }

    public boolean isFormulaCorrect() {
        WebElement formulaCell = driver.findElement(formulaCellLocator);
        String formula = formulaCell.getAttribute("formula");
        String expectedFormula = "=Z4+AD5+AE5+AH5+AC5+AB5+AM5";
        return formula.equals(expectedFormula);
    }
}