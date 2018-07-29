package org.umssdiplo.automationv01.core.managepage.Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

public class Header extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'All Courses')]")
    private WebElement allCoursesTab;

    public  void goToAllCoursesTab(){
        allCoursesTab.click();
    }

    @FindBy(xpath = "//span[contains(text(),'EQUIPO')]")
    private WebElement SelectEquipo;

    @FindBy(xpath = "//span[contains(text(),'Equipos')]")
     private WebElement SelectEquipos;

  public void goToAllEquipo() {
    SelectEquipo.click();
    SelectEquipos.click();
  }
      @FindBy(id = "user-dropdown")
      private WebElement dropdown;
  public void leftToPage() {
    dropdown.click();
  }

  @FindBy(id = "dropdown-item")
  private WebElement Logout;


  @FindBy(xpath = "//button[contains(text(),'Logout')]")
  private WebElement serrarSecion;

  public void leftToApp() {
    serrarSecion.click();
  }
//tipoEquipo...
      @FindBy(xpath = "//span[contains(text(),'EQUIPO')]")
      private WebElement Equipo;
  public void goToTipoEquipo() {
    Equipo.click();
  }

      @FindBy(xpath = "//span[contains(text(),'Tipo Equipos')]")
      private WebElement tipoEquipo;
  public void SelectTipoEquipo() {
    tipoEquipo.click();
  }

    @FindBy(id = "user-dropdown")
    private WebElement leftPage;
  public void leftToPageTipeEquipo() {
    leftPage.click();
  }

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement serrarSecionTipoEquipo;

  public void leftToAppIzzy() {
    serrarSecionTipoEquipo.click();
  }

  @FindBy(xpath = "//span[contains(text(),'Cargos')]")
  private WebElement pestaniaCargo;

  @FindBy(xpath = "//span[contains(text(),'PERSONAL')]")
  private WebElement pestaniaEmpleado;

  public void entrarALaPestaniaCargo() {
    pestaniaEmpleado.click();
    pestaniaCargo.click();
     }
  @FindBy(xpath = "//span[contains(text(),'Auditoria')]")
  private WebElement pestaniaAuditoria;
  @FindBy(xpath = "//span[contains(text(),'Auditoria History')]")
  private WebElement auditoriaHistory;

  public void entrarALaPestaniaAuditoria() {
  pestaniaAuditoria.click();
  auditoriaHistory.click();

  }
}
