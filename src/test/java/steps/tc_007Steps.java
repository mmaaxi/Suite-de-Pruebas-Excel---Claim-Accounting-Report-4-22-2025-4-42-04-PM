package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("I have opened the Excel file")
    public void iHaveOpenedTheExcelFile() {
        page.openExcelFile();
    }

    @When("I look for the columns {string}, {string}, and {string}")
    public void iLookForTheColumns(String column1, String column2, String column3) {
        page.findColumns(column1, column2, column3);
    }

    @Then("I should see the columns are present and correctly located")
    public void iShouldSeeTheColumnsArePresentAndCorrectlyLocated() {
        Assert.assertTrue(page.verifyColumns());
    }
}