package org.umssdiplo.automationv01.core.managepage.Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

public class Header extends BasePage {


    /*
    @FindBy(xpath = "//a[contains(text(),'All Courses')]")
    private WebElement allCoursesTab;
    */

    @FindBy(xpath = "//span[contains(text(),'Etapas')]")
    private WebElement  pestañaEtapas;



    @FindBy(id = "obras-dropdown")
    private WebElement  pestañaObra;

    @FindBy(xpath = "//span[contains(text(),'Obras')]")
    private WebElement subMenuObras;


    @FindBy(className = "pull-right")
    private WebElement registrarObra;


    @FindBy(className = "pull-right")
    private WebElement registrarEtapa;


    @FindBy(id ="user-dropdown")
    private WebElement cerrarApp;


    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement cerrarAplicacion;




    /*
    public  void goToAllCoursesTab(){
        allCoursesTab.click();
    }
    */

    public void irAObra() {
        pestañaObra.click();

    }


    public void seleccionarObras()
    {
        subMenuObras.click();
    }

    public void crearObra() {
        registrarObra.click();


    }

    public void irEtapa() {

        pestañaEtapas.click();


    }




    public void cerrarAplicacion() {
        cerrarApp.click();
        cerrarAplicacion.click();


    }
}
