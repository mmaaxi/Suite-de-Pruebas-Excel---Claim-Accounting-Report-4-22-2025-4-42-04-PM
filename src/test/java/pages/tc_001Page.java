package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {

    WebDriver driver;

    private By cannedReportsLink = By.id("cannedReports");
    private By claimAccountingReportLink = By.id("claimAccountingReport");
    private By exportButton = By.id("exportButton");
    private By exportSuccessMessage = By.id("exportSuccess");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToCannedReports() {
        driver.findElement(cannedReportsLink).click();
    }

    public boolean isExportOptionVisible() {
        WebElement exportButtonElement = driver.findElement(exportButton);
        return exportButtonElement.isDisplayed();
    }

    public void selectClaimAccountingReport() {
        driver.findElement(claimAccountingReportLink).click();
    }

    public void exportReport() {
        driver.findElement(exportButton).click();
    }

    public boolean isReportExported() {
        WebElement successMessageElement = driver.findElement(exportSuccessMessage);
        return successMessageElement.isDisplayed();
    }
}