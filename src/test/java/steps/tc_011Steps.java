package steps;

import org.openqa.selenium.WebDriver;
import pages.tc_011Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_011Steps {

    WebDriver driver;
    tc_011Page ivaAcumuladoPage;

    @Given("El usuario tiene acceso al archivo Excel con la columna 'IVA Acumulado'")
    public void elUsuarioTieneAccesoAlArchivoExcel() {
        // Aquí va la lógica para abrir el archivo Excel y configurar la conexión si es necesaria
        ivaAcumuladoPage = new tc_011Page(driver);
    }

    @When("El usuario inspecciona la fórmula presente en la columna 'IVA Acumulado'")
    public void elUsuarioInspeccionaLaFormula() {
        ivaAcumuladoPage.inspeccionarFormulaIvaAcumulado();
    }

    @Then("La fórmula debe haberse modificado para incluir los tipos de IVA (16%, Fronterizo, 0%, Exento) exceptuando el 'IVA retenido'")
    public void verificarModificacionDeFormula() {
        assertTrue(ivaAcumuladoPage.esFormulaModificadaCorrectamente());
    }
}