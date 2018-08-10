package org.umssdiplo.automationv01.core.managepage.Home;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TipoDocumentoPage {
  @FindBy(xpath = "//button[contains(text(),'Nuevo Tipo de Contrato')]")
  private WebElement crearNuevoTipoDocumento;

  @FindBy(xpath = "//table/tbody/tr[1]/td[3]/button")
  private WebElement modificarTipoDocumento;

  @FindBy(id = "nombre")
  private WebElement NombreTipoDocumento;
  @FindBy(id = "code")
  private WebElement CodigoTipoDocumento;
  @FindBy(id = "descripcion")
  private WebElement DescripcionTipoDocumento;
  @FindBy(className = "btn-success")
  private WebElement guardar;


  public void crearTipoDocumento() {
    crearNuevoTipoDocumento.click();
  }

  public void modificarTipoDocumento() {
    modificarTipoDocumento.click();
  }

  public void goToFillTheFieldsTipoDocumento(DataTable datos) {
    List<List<String>> goToFillTheFields = datos.raw();

    lleno_el_campo_nombre_tipoDocumento(goToFillTheFields.get(0).get(1));
    lleno_el_campo_codigo_tipoDocumento(goToFillTheFields.get(1).get(1));
    lleno_el_campo_descripcion_tipoDocumento(goToFillTheFields.get(2).get(1));
    hago_click_en_el_boton_guardar_tipoDocumento();
  }

  private void hago_click_en_el_boton_guardar_tipoDocumento() {
    guardar.click();
  }

  private void lleno_el_campo_nombre_tipoDocumento(String nombre) {
    NombreTipoDocumento.clear();
    NombreTipoDocumento.sendKeys(nombre);
  }
  private void lleno_el_campo_codigo_tipoDocumento(String nombre) {
    CodigoTipoDocumento.clear();
    CodigoTipoDocumento.sendKeys(nombre);
  }
  private void lleno_el_campo_descripcion_tipoDocumento(String nombre) {
    DescripcionTipoDocumento.clear();
    DescripcionTipoDocumento.sendKeys(nombre);
  }
}
