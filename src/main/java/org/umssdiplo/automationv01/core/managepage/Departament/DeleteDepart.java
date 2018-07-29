package org.umssdiplo.automationv01.core.managepage.Departament;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class DeleteDepart extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Departamentos')]")
    private WebElement selectdepartment;

    @FindBy(id = "department")
    private WebElement newdepartment;

    @FindBy(name = "depName")
    private WebElement nanedepartment;

    @FindBy(name = "depUbicacion")
    private WebElement ubicadepartment;

    @FindBy(name = "depTelefono")
    private WebElement telefonodepartment;

    @FindBy(name = "depDescripcion")
    private WebElement descriptdepartment;

    @FindBy(id = "depar")
    private WebElement guardar;

//
//    @FindBy(xpath = "//button[@class='navbar-toggler'][last()]")
//    private WebElement eliminar;

    @FindBy(id = "delet36")
    private WebElement eliminar;

    public void SelectDepartemento() {
        CommonEvents.clickButton(selectdepartment);
    }

    public void NewDepartament() {
        CommonEvents.clickButton(newdepartment);
    }

    public void llenoNombre(String nombre) {
        CommonEvents.setInputField(nanedepartment, nombre);
    }

    public void ubicaciondepartament(String ubicacion) {
        CommonEvents.setInputField(ubicadepartment, ubicacion);
    }

    public void telefonodepartament(String telefono) {
        CommonEvents.setInputField(telefonodepartment, telefono);
    }

    public void descriptiondepartament(String description) {
        CommonEvents.setInputField(descriptdepartment, description);
    }

    public void guardarDepartament() {
        CommonEvents.clickButton(guardar);
    }

    public void eleminardepartamento() {
        CommonEvents.clickButton(eliminar);
    }
}
