package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {
    tc_003Page page = new tc_003Page();

    @Given("el usuario ha exportado el Excel")
    public void el_usuario_ha_exportado_el_Excel() {
        page.exportarExcel();
    }

    @When("el usuario revisa el Excel exportado")
    public void el_usuario_revisa_el_Excel_exportado() {
        page.abrirExcel();
    }

    @Then("la columna 'Estado Código' se encuentra en la posición correcta")
    public void la_columna_Estado_Código_se_encuentra_en_la_posición_correcta() {
        boolean isCorrect = page.verificarColumnaEstadoCodigo();
        Assert.assertTrue("La columna 'Estado Código' no se encuentra en la posición correcta", isCorrect);
    }
}