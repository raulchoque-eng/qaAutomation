package org.umssdiplo.automationv01.core.managepage.Home;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;
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

    @FindBy(xpath = "//button[contains(text(),'Crear Empleado')]")
    //@FindBy(id="navbar-menu")
    private WebElement SelectCreateEmployee;

    public void goToCreateEmployees() {
        SelectCreateEmployee.click();
    }

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "ci")
    private WebElement ci;

    @FindBy(id = "departamentId")
    private WebElement departamentId;

    @FindBy(id = "cargoId")
    private WebElement cargoId;

    @FindBy(className = "btn-outline-secondary")
    private WebElement buttonfechanacim;

    @FindBy(xpath = "//div[contains(text(),'12')]")
    private WebElement dia;

    @FindBy(id = "estadoCivil")
    private WebElement estadoCivil;

    @FindBy(id = "celular")
    private WebElement celular;

    @FindBy(id = "telefono")
    private WebElement telefono;

    @FindBy(id = "direccion")
    private WebElement direccion;

    @FindBy(className = "btn-success")
    private WebElement guardar;

    public void registerPerson(DataTable datos) {
        List<List<String>> registerPersonal = datos.raw();
        lleno_el_campo_nombre_con(registerPersonal.get(0).get(1));
        lleno_el_campo_apellido_con(registerPersonal.get(1).get(1));
        lleno_el_campo_ci_con(registerPersonal.get(2).get(1));
        lleno_el_campo_departamento_con(registerPersonal.get(3).get(1));
        lleno_el_campo_cargo_con(registerPersonal.get(4).get(1));
        lleno_el_campo_fechaNaci_con(registerPersonal.get(5).get(1));
        lleno_el_campo_estadoCivil_con(registerPersonal.get(6).get(1));
        lleno_el_campo_celular_con(registerPersonal.get(7).get(1));
        lleno_el_campo_telefono_con(registerPersonal.get(8).get(1));
        lleno_el_campo_direccion_con(registerPersonal.get(9).get(1));
        hago_click_en_el_boton_guardar();

    }

    private void hago_click_en_el_boton_guardar() {
        guardar.click();
    }

    private void lleno_el_campo_direccion_con(String direcc) {
        direccion.sendKeys(direcc);
    }

    private void lleno_el_campo_telefono_con(String fono) {
        telefono.sendKeys(fono);
    }

    private void lleno_el_campo_celular_con(String celu) {
        celular.sendKeys(celu);
    }

    private void lleno_el_campo_estadoCivil_con(String EstCivil) {
        estadoCivil.sendKeys(EstCivil);
    }

    private void lleno_el_campo_cargo_con(String cargo) {
        cargoId.sendKeys(cargo);
    }

    private void lleno_el_campo_departamento_con(String departament) {
        departamentId.sendKeys(departament);
    }

    private void lleno_el_campo_fechaNaci_con(String fechanaci) {
        buttonfechanacim.click();
        dia.click();
    }

    private void lleno_el_campo_ci_con(String cedula) {
      //  Integer newCedula = (int)cedula;
        ci.sendKeys(cedula);
    }

    private void lleno_el_campo_apellido_con(String apellido) {
        lastName.sendKeys(apellido);
    }

    private void lleno_el_campo_nombre_con(String nombre) {
        firstName.sendKeys(nombre);
    }
    //REGISTRO DE PERFIL EN EMPLOYEE
    @FindBy(id = "experiencia")
    private WebElement tiempo;

    @FindBy(id = "firstName")
    private WebElement sector;

    @FindBy(id = "descripcion")
    private WebElement descripcion;

    @FindBy(id = "especializacion")
    private WebElement especializacion;


    public void registerPerfil(DataTable datos) {
        List<List<String>> registerPerfil = datos.raw();
        lleno_el_campo_anios_de_experiencia_con(registerPerfil.get(0).get(1));
        lleno_el_campo_sector_con(registerPerfil.get(1).get(1));
        lleno_el_campo_formacion_con(registerPerfil.get(2).get(1));
        lleno_el_campo_especializacion_con(registerPerfil.get(3).get(1));
        hago_click_en_el_boton_guardar();

    }

    private void lleno_el_campo_especializacion_con(String especial) {
        especializacion.sendKeys(especial);
    }

    private void lleno_el_campo_formacion_con(String formacion) {
        descripcion.sendKeys(formacion);
    }

    private void lleno_el_campo_sector_con(String sectores) {
        sector.sendKeys(sectores);
    }

    private void lleno_el_campo_anios_de_experiencia_con(String anios) {
        tiempo.sendKeys(anios);
    }
    //REGISTRO DE CONTRATO EN EMPLOYEE

    @FindBy(className = "btn-outline-secondary")
    private WebElement buttonfechaIni;

    @FindBy(xpath = "//div[contains(text(),'10')]")
    private WebElement dias;

    /*
    @FindBy(how = How.CLASS_NAME, using = "btn-outline-secondary")
    private List<WebElement> buttonfechafin;
    //private WebElement buttonfechafin;

    @FindBy(xpath = "//div[contains(text(),'20')]")
    private WebElement diass;
    */

    @FindBy(id = "tipoContractId")
    private WebElement contrac;

    @FindBy(id = "especializacion")
    private WebElement especial;

    public void registerformuContract(DataTable datos) {
        List<List<String>> registerformuContract = datos.raw();
        lleno_el_campo_fechaInicio_con(registerformuContract.get(0).get(1));
        //lleno_el_campo_fechafin_con(registerformuContract.get(1).get(1));
        lleno_el_campo_tipoContrac_con(registerformuContract.get(2).get(1));
        lleno_el_campo_descripcion_con(registerformuContract.get(3).get(1));
        hago_click_en_el_boton_guardar();
    }

    private void lleno_el_campo_descripcion_con(String especial) {
        especializacion.sendKeys(especial);
    }

    private void lleno_el_campo_tipoContrac_con(String contrato) {
        contrac.sendKeys(contrato);
    }

    /*
    private void lleno_el_campo_fechafin_con(String fin) {

        buttonfechafin.add(btn-outline-secondary);
        diass.click();
    }
    */
    private void lleno_el_campo_fechaInicio_con(String fechaIni) {
        buttonfechaIni.click();
        dias.click();
    }
    //TESTING DE BUSCAR UN EMPLEADO POR DEPARTAMENTO

    @FindBy(className = "btn-outline-secondary")
    private WebElement buscarObra;

    @FindBy(id = "departamentId")
    private WebElement departament;

    @FindBy(xpath = "//button[contains(text(),'Buscar')]")
    private WebElement buscar;


    public void buscarObraenDepa(DataTable datos) {
        List<List<String>> buscarObraenDepa = datos.raw();
        selecciono_una_busqueda();
        lleno_el_campo_buscarPorDepa_con(buscarObraenDepa.get(0).get(1));
        hago_click_en_el_boton_buscar();

    }

    private void selecciono_una_busqueda() {
        buscarObra.click();
    }

    private void hago_click_en_el_boton_buscar() {
        buscar.click();
    }

    private void lleno_el_campo_buscarPorDepa_con(String busqueda) {
        departamentId.sendKeys(busqueda);
    }

    //  TEST ASSIGNAR UN EMPLEADO A UNA OBRA


    @FindBy(xpath ="//table[1]/tbody/tr[1]/td/button[@ngbtooltip='ASIGNAR OBRA']")
    private WebElement assing;

    @FindBy(id = "tipoContractId")
    private WebElement contract;


    @FindBy(xpath = "//button[contains(text(),'Asignar')]")
    private WebElement asignar;

    public void assignaObra(DataTable datos) {
        List<List<String>> assignaObra = datos.raw();
        hago_click_en_el_boton_asignarObra();
        selecciono_una_Obra_con(assignaObra.get(0).get(1));
        hago_click_en_el_boton_asignar();

    }

    private void hago_click_en_el_boton_asignar() {
        asignar.click();
    }

    private void selecciono_una_Obra_con(String contracts) {
        contract.sendKeys(contracts);
    }

    private void hago_click_en_el_boton_asignarObra() {
        assing.click();
    }

    @FindBy(xpath = "//button[contains(text(),'Nuevo Cargo')]")
    private WebElement SelectCreateCargo;

    public void goToCreateCargo() {
        SelectCreateCargo.click();
    }
    //LLENAMOS LOS CAMPOS DE UN NUEVO CARGO

    @FindBy(id = "nombre")
    private WebElement nombres;

    @FindBy(id = "descripcion")
    private WebElement descripciones;

    public void camposCargo(DataTable datos) {
        List<List<String>> camposCargo = datos.raw();
        lleno_el_campo_nombre_de_Cargo_con(camposCargo.get(0).get(1));
        lleno_el_campo_descrip_con(camposCargo.get(2).get(1));
        hago_click_en_el_boton_guardar();
    }

    private void lleno_el_campo_descrip_con(String descrip) {
        descripciones.sendKeys(descrip);
    }

    private void lleno_el_campo_nombre_de_Cargo_con(String datos) {
        nombres.sendKeys(datos);
    }
}


