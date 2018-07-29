package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Home.CargoPage;

public class CargoStepDef  {
 CargoPage cargoPage=new CargoPage();

  @When("^I go to create New Cargo$")
  public void i_go_to_create_New_Cargo() throws Throwable {
    cargoPage.crearCargo();
  }

  @When("^I go to modification Cargo$")
  public void i_go_to_modification_Cargo() throws Throwable {
    cargoPage.modificarCargo();
  }

  @When("^I will go fill the fields cargo$")
  public void i_will_go_fill_the_fields_cargo(DataTable datos) {
    cargoPage.goToFillTheFieldsCargo(datos);
  }
}
