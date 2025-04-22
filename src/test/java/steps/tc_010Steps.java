package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_010Page;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page reportPage = new tc_010Page(driver);
    
    @Given("Estoy en la página del reporte de pagos")
    public void estoy_en_la_pagina_del_reporte_de_pagos() {
        reportPage.navigateToReportPage();
    }
    
    @When("Verifico si la columna 'Status Pago Código' está junto a 'Fecha de Pago'")
    public void verifico_columna_status_pago_codigo() {
        Assert.assertTrue(reportPage.isStatusPagoCodigoNextToFechaDePago());
    }
    
    @Then("La columna 'Status Pago Código' se muestra correctamente")
    public void columna_status_pago_codigo_muestra_correctamente() {
        Assert.assertTrue(reportPage.isStatusPagoCodigoColumnDisplayed());
    }
    
    @When("Confirmo si la columna 'Status de Pago' ha sido renombrada")
    public void confirmo_renombramiento_status_de_pago() {
        Assert.assertEquals("Descripción Status Pago", reportPage.getStatusDePagoColumnHeaderText());
    }
    
    @Then("El encabezado refleja el nuevo nombre 'Descripción Status Pago'")
    public void encabezado_refleja_nuevo_nombre_descripcion_status_pago() {
        Assert.assertEquals("Descripción Status Pago", reportPage.getStatusDePagoColumnHeaderText());
    }
}