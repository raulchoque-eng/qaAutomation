package org.umssdiplo.automationv01.core.managepage.Home;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.testng.Assert;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.security.Key;
import java.sql.DriverManager;
import java.util.List;

public class HomePage extends BasePage {


    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchCourseTextBox;


    @FindBy(id = "nombre")
    private WebElement ingresarNombreObra;


    @FindBy(id = "code")
    private WebElement ingresarCodigoObra;


    @FindBy(id = "ubicacion")
    private WebElement ingresarUbicacionObra;


    @FindBy(id = "descripcion")
    private WebElement ingresarDescripcionObra;


    @FindBy(xpath = "//button[contains(text(),'Guardar')]")
    private WebElement guardarFormularioObra;


    @FindBy(xpath = "//button[contains(text(),'Crear Etapa')]")
    private WebElement crearEtapa;



    @FindBy(id = "nombre")
    private WebElement ingresarNombreEtapa;



    @FindBy(id = "code")
    private WebElement ingresarCodigoEtapa;


    @FindBy(id = "ubicacion")
    private WebElement ingresarNumEmpleados;


    @FindBy(xpath = "//button[contains(text(),'Guardar')]")
    private WebElement guardarFormularioEtapa;





    @FindBy(xpath = "//table[1]/tbody/tr[1]/td/button[@ngbtooltip='AGREGAR ETAPAS A LA OBRA']")
    private WebElement asignarEtapasObra;




    @FindBy(id = "tipoContractId")
    private WebElement ingresarEtapaAsignar;

    @FindBy(xpath = "//option[contains(text(),'Etapa final de obra')]")
    private WebElement opcionEtapaAsignar;




    @FindBy(id="especializacion")
    private WebElement descripcionEtapaAsignar;




    @FindBy(xpath = "//button[contains(text(),'Asignar')]")
    private WebElement guardarAsignarEtapaObra;



    public void searchCourse(String course){
        CommonEvents.setInputField(searchCourseTextBox,course);
        CommonEvents.pressKey(Keys.ENTER);
    }

    public void verifyCouseIsDisplayed(String course){
        WebElement courseName=ManageDriver.getInstance().getWebDriver().
                findElement(By.xpath("//h4[contains(text(),'"+course+"')]"));
        Assert.assertTrue(CommonEvents.isVisible(courseName));

    }


    public void llenarFormularioObra(DataTable datos) {

        List<List<String>> credenciales = datos.raw();
        lleno_el_campo_Nombre_con(credenciales.get(0).get(1));
        lleno_el_campo_Codigo_con(credenciales.get(1).get(1));
        lleno_el_campo_Ubicacion_con(credenciales.get(2).get(1));
        lleno_el_campo_Descripcion_con(credenciales.get(3).get(1));

        hago_click_en_el_boton_Guardar();
    }

    private void lleno_el_campo_Descripcion_con(String descripcionObra) {

        ingresarDescripcionObra.sendKeys(descripcionObra);

    }

    private void hago_click_en_el_boton_Guardar() {

        guardarFormularioObra.click();

    }

    private void lleno_el_campo_Ubicacion_con(String ubicacionObra) {


        ingresarUbicacionObra.sendKeys(ubicacionObra);



    }

    private void lleno_el_campo_Codigo_con(String codigoObra) {

        ingresarCodigoObra.sendKeys(codigoObra);


    }

    private void lleno_el_campo_Nombre_con(String nombreObra) {

        ingresarNombreObra.sendKeys(nombreObra);

    }

    public void clickCrearEtapa() {

        crearEtapa.click();


    }

    public void llenarFormularioEtapa(DataTable datos) {


        List<List<String>> credenciales = datos.raw();
        lleno_el_campo_NombreEtapa_con(credenciales.get(0).get(1));
        lleno_el_campo_CodigoEtapa_con(credenciales.get(1).get(1));
        lleno_el_campo_NroEmpleados_con(credenciales.get(2).get(1));

       hago_click_en_el_boton_GuardarEtapa();


    }

    private void hago_click_en_el_boton_GuardarEtapa() {

        guardarFormularioEtapa.click();


    }

    private void lleno_el_campo_CodigoEtapa_con(String codigoEtapa) {

        ingresarCodigoEtapa.sendKeys(codigoEtapa);

    }

    private void lleno_el_campo_NombreEtapa_con(String nombreEtapa) {
        ingresarNombreEtapa.sendKeys(nombreEtapa);


    }

    private void lleno_el_campo_NroEmpleados_con(String  numeroEmpleados) {


        ingresarNumEmpleados.sendKeys(numeroEmpleados);



    }

    public void clickAsignarEtapaObra() {

     asignarEtapasObra.click();

    }



    public void llenarFormularioAsigEtapa(DataTable datos) {

        List<List<String>> credenciales = datos.raw();
        lleno_el_campo_Etapas_con(credenciales.get(0).get(1));
        lleno_el_campo_Description_con(credenciales.get(1).get(1));

        hago_click_en_el_boton_Asignar();
    }

    private void hago_click_en_el_boton_Asignar() {


      guardarAsignarEtapaObra.click();

    }

    private void lleno_el_campo_Description_con(String descripcionEtapa) {

       descripcionEtapaAsignar.sendKeys(descripcionEtapa);

    }

    private void lleno_el_campo_Etapas_con(String nombreEtapas) {

        ingresarEtapaAsignar.sendKeys(nombreEtapas);
        //opcionEtapaAsignar.click();

    }
}
