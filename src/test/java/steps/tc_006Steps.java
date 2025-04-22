package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_006Page;
import static org.junit.Assert.assertTrue;

public class tc_006Steps {

    WebDriver driver;
    tc_006Page page;

    @Given("I open the Excel file")
    public void iOpenTheExcelFile() {
        page = new tc_006Page(driver);
        page.openExcelFile();
    }

    @When("I locate the column originally named 'Monto Acumulado Folio OPC'")
    public void iLocateTheColumnOriginallyNamed() {
        page.locateOriginalColumn();
    }

    @Then("I see the column is now displayed as 'Monto Acumulado Folio OPC (2121)'")
    public void iSeeTheColumnIsNowDisplayedAs() {
        assertTrue(page.isColumnRenamedCorrectly());
    }
}