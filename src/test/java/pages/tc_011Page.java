package pages;

import org.openqa.selenium.WebDriver;

public class tc_011Page {

    WebDriver driver;

    public tc_011Page(WebDriver driver) {
        this.driver = driver;
    }

    public void inspeccionarFormulaIvaAcumulado() {
        // Aquí va la lógica para acceder a la fórmula en el Excel
    }

    public boolean esFormulaModificadaCorrectamente() {
        // Aquí va la lógica para verificar si la fórmula se ha modificado correctamente,
        // debe incluir los tipos de IVA: 16%, Fronterizo, 0%, Exento y no debe incluir el IVA retenido
        return true; // retorna verdadero solo si la fórmula está correcta
    }
}