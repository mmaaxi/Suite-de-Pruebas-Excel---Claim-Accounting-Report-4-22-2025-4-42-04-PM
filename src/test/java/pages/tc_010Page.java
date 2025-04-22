package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {
    WebDriver driver;

    private By statusPagoCodigoColumn = By.xpath("//th[contains(text(),'Status Pago Código')]");
    private By fechaDePagoColumn = By.xpath("//th[contains(text(),'Fecha de Pago')]");
    private By statusDePagoColumnHeader = By.xpath("//th[contains(text(),'Descripción Status Pago')]");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToReportPage() {
        driver.get("https://example.com/report");
    }

    public boolean isStatusPagoCodigoNextToFechaDePago() {
        WebElement statusPagoCodigoElem = driver.findElement(statusPagoCodigoColumn);
        WebElement fechaDePagoElem = driver.findElement(fechaDePagoColumn);
        // Logic to check if 'Status Pago Código' is next to 'Fecha de Pago'
        return fechaDePagoElem.getLocation().getX() + fechaDePagoElem.getSize().getWidth() == statusPagoCodigoElem.getLocation().getX();
    }

    public boolean isStatusPagoCodigoColumnDisplayed() {
        return driver.findElement(statusPagoCodigoColumn).isDisplayed();
    }

    public String getStatusDePagoColumnHeaderText() {
        return driver.findElement(statusDePagoColumnHeader).getText();
    }
}