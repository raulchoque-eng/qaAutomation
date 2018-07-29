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

    public void searchCourse(String course){
        CommonEvents.setInputField(searchCourseTextBox,course);
        CommonEvents.pressKey(Keys.ENTER);
    }

    public void verifyCouseIsDisplayed(String course){
        WebElement courseName=ManageDriver.getInstance().getWebDriver().
                findElement(By.xpath("//h4[contains(text(),'"+course+"')]"));
        Assert.assertTrue(CommonEvents.isVisible(courseName));

    }

        @FindBy(xpath = "//button[contains(text(),'Nuevo Equipo')]")
        private WebElement RegisterEquipo;



    public void goToCreateEquipo() {
        RegisterEquipo.click();
    }
        @FindBy(id = "nombre_equipo")
        private WebElement NombreEquipo;

        @FindBy(id = "code")
        private WebElement CodigoEquipo;

        @FindBy(id = "tipoContractId")
        private WebElement tipo_Equipo;

        @FindBy(id = "descripcion")
        private WebElement descripcion_equipo;

        @FindBy(className = "btn-success")
        private WebElement guardar;

    public void goToFillTheFields(DataTable datos) {
        List<List<String>> goToFillTheFields = datos.raw();

        lleno_el_campo_nombre(goToFillTheFields.get(0).get(1));
        lleno_el_campo_codigo(goToFillTheFields.get(1).get(1));
        lleno_el_campo_tipoEquipo(goToFillTheFields.get(2).get(1));
        lleno_el_campo_descripcion(goToFillTheFields.get(3).get(1));
        hago_click_en_el_boton_guardar();
    }

    private void hago_click_en_el_boton_guardar() {
        guardar.click();
    }

    private void lleno_el_campo_descripcion(String descripcion) {
        descripcion_equipo.sendKeys(descripcion);
    }

    private void lleno_el_campo_tipoEquipo(String tipoEquipo) {
        tipo_Equipo.sendKeys(tipoEquipo);
    }

    private void lleno_el_campo_codigo(String codigo) {
        CodigoEquipo.sendKeys(codigo);
    }

    private void lleno_el_campo_nombre(String nombre) {
        NombreEquipo.sendKeys(nombre);
    }
//Tipo Equipo...
            @FindBy(xpath = "//button[contains(text(),'Nuevo Tipo Equipo')]")
            private WebElement nuevoTipoEquipo;
    public void createNewTipoEquipo() {
        nuevoTipoEquipo.click();
    }
        @FindBy(id = "nombre_equipo")
        private WebElement NombreTipoEquipo;

        @FindBy(id = "code")
        private WebElement CodigoTipoEquipo;

        @FindBy(id = "descripcion")
        private WebElement descripcion_tipo_equipo;

        @FindBy(className = "btn-success")
        private WebElement guardarTipoEquipo;

    public void goToFillFieldsTipoEquipo(DataTable datos) {
        List<List<String>> goToFillFieldsTipoEquipo = datos.raw();

        lleno_el_campo_nombreTipoEquipo(goToFillFieldsTipoEquipo.get(0).get(1));
        lleno_el_campo_codigoTipoEquipo(goToFillFieldsTipoEquipo.get(1).get(1));
        lleno_el_campo_descripcionTipoEquipo(goToFillFieldsTipoEquipo.get(2).get(1));
        hago_click_en_el_boton_guardarTipoEquipo();
    }

    private void hago_click_en_el_boton_guardarTipoEquipo() {
        guardarTipoEquipo.click();
    }

    private void lleno_el_campo_descripcionTipoEquipo(String descripcionTipoEquipo) {
        descripcion_tipo_equipo.sendKeys(descripcionTipoEquipo);
    }

    private void lleno_el_campo_codigoTipoEquipo(String codigoTipoEquipo) {
        CodigoTipoEquipo.sendKeys(codigoTipoEquipo);
    }

    private void lleno_el_campo_nombreTipoEquipo(String nombreTipoEquipo) {
        NombreTipoEquipo.sendKeys(nombreTipoEquipo);
    }
}
