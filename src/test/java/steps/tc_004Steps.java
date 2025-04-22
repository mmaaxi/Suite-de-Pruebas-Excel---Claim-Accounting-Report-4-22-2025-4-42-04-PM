package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page page = new tc_004Page();

    @Given("I have the Excel file open")
    public void i_have_the_Excel_file_open() {
        page.openExcelFile();
    }

    @When("I inspect the values of the 'estado' column")
    public void i_inspect_the_values_of_the_estado_column() {
        page.inspectEstadoColumnValues();
    }

    @Then("the values should be updated according to the defined requirements")
    public void the_values_should_be_updated_according_to_the_defined_requirements() {
        boolean result = page.verifyEstadoColumnValues();
        Assert.assertTrue("The values in the 'estado' column are not updated as expected.", result);
    }
}