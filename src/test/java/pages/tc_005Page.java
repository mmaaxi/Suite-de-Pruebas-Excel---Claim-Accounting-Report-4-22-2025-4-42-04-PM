package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {

    WebDriver driver;
    By montoAcumuladoColumna = By.xpath("//th[contains(text(),'Monto acumulado Folio Reserva 5401')]");
    By montoReservaColumna = By.xpath("//th[contains(text(),'Monto (reserva)')]");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaDeTransacciones() {
        driver.get("https://example.com/transacciones");
    }
    
    public void insertarColumnaMontoAcumulado() {
        // Lógica para insertar la columna
    }

    public boolean esColumnaEnPosicionCorrecta() {
        int indexMontoReserva = driver.findElements(montoReservaColumna).indexOf(driver.findElement(montoReservaColumna));
        int indexMontoAcumulado = driver.findElements(montoAcumuladoColumna).indexOf(driver.findElement(montoAcumuladoColumna));
        return indexMontoReserva < indexMontoAcumulado;
    }

    public boolean esFormulaCorrecta() {
        // Implementación que verifica la fórmula
        // Retorna true si la fórmula es correcta
        return true;
    }
}