package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Home.TipoDocumentoPage;

public class TipoDocumentoStepDef {
  TipoDocumentoPage tipoDocumentoPage=new TipoDocumentoPage();

  @When("^I go to create New TipoDocumento$")
  public void i_go_to_create_New_TipoDocumento() throws Throwable {
    tipoDocumentoPage.crearTipoDocumento();
  }

  @When("^I go to modification TipoDocumento$")
  public void i_go_to_modification_TipoDocumento() throws Throwable {
    tipoDocumentoPage.modificarTipoDocumento();
  }

  @When("^I will go fill the fields tipoDocumento$")
  public void i_will_go_fill_the_fields_tipoDocumento(DataTable datos) {
    tipoDocumentoPage.goToFillTheFieldsTipoDocumento(datos);
  }
}
