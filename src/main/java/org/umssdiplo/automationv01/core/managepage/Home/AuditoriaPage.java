package org.umssdiplo.automationv01.core.managepage.Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

public class AuditoriaPage extends BasePage {

  @FindBy(xpath = "//table/tbody/tr[1]/td[7]/button[contains(text(),'Ver reporte individual')]")
  private WebElement imprReport;

  public void impreReporte() {
    imprReport.click();
  }
}



