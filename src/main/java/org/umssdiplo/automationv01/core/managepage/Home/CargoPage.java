package org.umssdiplo.automationv01.core.managepage.Home;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

import java.util.List;

public class CargoPage extends BasePage {
  @FindBy(xpath = "//button[contains(text(),'Nuevo Cargo')]")
  private WebElement crearNuevoCargo;

  @FindBy(xpath = "//table/tbody/tr[1]/td[4]/button")
  private WebElement modificarCargo;

  @FindBy(id = "nombre")
  private WebElement NombreCargo;
  @FindBy(id = "firstName")
  private WebElement FechaCargo;
  @FindBy(id = "descripcion")
  private WebElement DescripcionCargo;
  @FindBy(className = "btn-success")
  private WebElement guardar;


  public void crearCargo() {
    crearNuevoCargo.click();
  }

  public void modificarCargo() {
    modificarCargo.click();
  }

  public void goToFillTheFieldsCargo(DataTable datos) {
    List<List<String>> goToFillTheFields = datos.raw();

    lleno_el_campo_nombre_cargo(goToFillTheFields.get(0).get(1));
    lleno_el_campo_fecha_cargo(goToFillTheFields.get(1).get(1));
    lleno_el_campo_descripcion_cargo(goToFillTheFields.get(2).get(1));
    hago_click_en_el_boton_guardar_cargo();
  }

  private void hago_click_en_el_boton_guardar_cargo() {
    guardar.click();
  }

  private void lleno_el_campo_nombre_cargo(String nombre) {
    NombreCargo.clear();
    NombreCargo.sendKeys(nombre);
  }
  private void lleno_el_campo_fecha_cargo(String nombre) {
    FechaCargo.clear();
    FechaCargo.sendKeys(nombre);
  }
  private void lleno_el_campo_descripcion_cargo(String nombre) {
    DescripcionCargo.clear();
    DescripcionCargo.sendKeys(nombre);
  }
}
