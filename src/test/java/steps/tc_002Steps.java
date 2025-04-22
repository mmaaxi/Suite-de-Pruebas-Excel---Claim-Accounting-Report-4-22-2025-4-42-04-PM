package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_002Page;

public class tc_002Steps {

    WebDriver driver;
    tc_002Page excelPage = new tc_002Page(driver);

    @Given("the user opens the exported Excel document")
    public void open_excel_document() {
        excelPage.openExcelDocument("path/to/excel/document.xlsx");
    }

    @When("the user checks the formula for the key in column C")
    public void check_formula_in_column_C() {
        excelPage.verifyConcatenationFormula();
    }

    @Then("the key should be generated correctly using columns D, H, U, O, and E")
    public void verify_key_generation() {
        excelPage.assertCorrectKeyGeneration();
    }
}