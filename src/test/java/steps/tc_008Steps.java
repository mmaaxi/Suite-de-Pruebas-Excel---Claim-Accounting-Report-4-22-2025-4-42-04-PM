package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;
import pages.tc_008Page;

public class tc_008Steps {
    tc_008Page page = new tc_008Page();

    @Given("El registro de un movimiento de pago en el Excel está identificado")
    public void identifyPaymentRecordInExcel() {
        assertTrue("El registro de pago no se muestra correctamente", page.isPaymentRecordDisplayed());
    }

    @When("Verifico la celda de {string} en el movimiento de pago")
    public void verifyFormulaInPaymentMovement(String cellLocator) {
        page.verifyFormulaInCell(cellLocator);
    }

    @Then("La fórmula aplica correctamente y calcula el total de IVA y otros montos asociados")
    public void validateCorrectFormulaApplication() {
        assertTrue("La fórmula no está correctamente aplicada", page.isFormulaCorrect());
    }
}