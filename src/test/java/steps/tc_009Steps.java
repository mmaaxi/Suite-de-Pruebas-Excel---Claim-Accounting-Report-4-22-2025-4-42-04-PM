package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_009Page;
import java.util.List;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("el Excel está abierto")
    public void elExcelEstaAbierto() {
        page.openExcel();
    }

    @When("reviso que el Excel incluya la columna 'Folio Pre solicitud' a la derecha de la columna 'Ramo'")
    public void revisoColumnaFolioPreSolicitud() {
        List<String> columnNames = page.getColumnNames();
        Assert.assertTrue("La columna 'Folio Pre solicitud' no se encuentra a la derecha de 'Ramo'.",
            page.isColumnRightOf("Ramo", "Folio Pre solicitud", columnNames));
    }

    @Then("la columna 'Folio Pre solicitud' existe y se muestra, aunque esté vacía")
    public void columnaFolioPreSolicitudExiste() {
        Assert.assertTrue("La columna 'Folio Pre solicitud' no está presente.", page.isColumnPresent("Folio Pre solicitud"));
    }

    @When("reviso que el Excel incluya la columna 'Folio de Pago' a la derecha de 'Folio Pre solicitud'")
    public void revisoColumnaFolioDePago() {
        List<String> columnNames = page.getColumnNames();
        Assert.assertTrue("La columna 'Folio de Pago' no se encuentra a la derecha de 'Folio Pre solicitud'.",
            page.isColumnRightOf("Folio Pre solicitud", "Folio de Pago", columnNames));
    }

    @Then("la columna 'Folio de Pago' existe y se muestra, aunque esté vacía")
    public void columnaFolioDePagoExiste() {
        Assert.assertTrue("La columna 'Folio de Pago' no está presente.", page.isColumnPresent("Folio de Pago"));
    }

}