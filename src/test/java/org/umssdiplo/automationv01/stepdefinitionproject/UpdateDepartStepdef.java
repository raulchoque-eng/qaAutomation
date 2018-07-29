package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Departament.UpadteDepart;

import java.util.List;

public class UpdateDepartStepdef {
    UpadteDepart depart = new UpadteDepart();

    @Then("^Presiono la opcion departamento que se encuentra en el header$")
    public void hagoClickDepartamento() {
        depart.SelectDepartemento();
    }

    @And("^hacemos click boton update departamento$")
    public void hacemosClickBotonUpdateDepartamento() {
        depart.UpdateDepartemento();
    }

    @And("^actulizar el departmento$")
    public void ActuzarFormularioDelDepartmento(DataTable datosDepart) {
        List<List<String>> datos = datosDepart.raw();
        for (List<String> dato : datos) {
            switch (dato.get(0)) {
                case "Ingresar el nombre":
                    depart.llenoNombre(dato.get(1));
                    break;
                case "Ubicacion":
                    depart.ubicaciondepartament(dato.get(1));
                    break;
                case "Telefono":
                    depart.telefonodepartament(dato.get(1));
                    break;
                case "Descripcion":
                    depart.descriptiondepartament(dato.get(1));
                    break;
            }
        }
    }

    @And("^guardamos el nuevo departamento$")
    public void guardamosElNuevoDepartamento() {
        depart.guardarDepartament();
    }
}
