package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {
    tc_001Page page = new tc_001Page();

    @Given("^the user is on the Canned Reports module$")
    public void userIsOnCannedReportsModule() {
        page.navigateToCannedReports();
        Assert.assertTrue("Failed to navigate to Canned Reports module", page.isExportOptionVisible());
    }

    @When("^the user selects the 'Claim Accounting Report' to export$")
    public void userSelectsClaimAccountingReport() {
        page.selectClaimAccountingReport();
        page.exportReport();
    }

    @Then("^the system should export an Excel document with the defined modifications$")
    public void systemExportsExcelDocument() {
        Assert.assertTrue("The Excel document was not exported with the defined modifications", page.isReportExported());
    }
}