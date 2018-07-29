package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Departament.Departamento;

import java.util.List;

public class DepartamentoStepdef {
    Departamento depart = new Departamento();

    @Then("^Presiono en la opcion departamento que se encuentra en el header$")
    public void hagoClickDepartamento() {
        depart.SelectDepartemento();
    }

    @And("^registramos una nuevo departamento$")
    public void registramosUnaNuevoDepartamento() {
        depart.NewDepartament();
    }

    @And("^llenar el formulario del departmento$")
    public void llenarElFormularioDelDepartmento(DataTable datosDepart) {
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


    @And("^registramos el nuevo departamento$")
    public void registramosElNuevoDepartamento() {
        depart.guardarDepartament();
    }
}
