package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Home.AuditoriaPage;

public class AuditoriaStepDef {
  AuditoriaPage auditoriaPage = new AuditoriaPage();

  @When("^descargarReporte$")
  public void descargarReporte() throws Throwable {
    auditoriaPage.impreReporte();
  }


}
