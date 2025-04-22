package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("La página de transacciones está abierta")
    public void laPaginaDeTransaccionesEstaAbierta() {
        page.navegarAPaginaDeTransacciones();
    }

    @When("Inserto la columna 'Monto acumulado Folio Reserva 5401'")
    public void insertoLaColumnaMontoAcumuladoFolioReserva5401() {
        page.insertarColumnaMontoAcumulado();
    }

    @Then("Verifico que la columna 'Monto acumulado Folio Reserva 5401' está a la derecha de la columna 'Monto (reserva)'")
    public void verificoQueLaColumnaEstaALaDerechaDeMontoReserva() {
        Assert.assertTrue(page.esColumnaEnPosicionCorrecta());
    }
    
    @And("Verifico que la fórmula sume el monto acumulado inmediato anterior y el monto de reserva actual")
    public void verificoQueLaFormulaSumeCorrectamente() {
        Assert.assertTrue(page.esFormulaCorrecta());
    }
}