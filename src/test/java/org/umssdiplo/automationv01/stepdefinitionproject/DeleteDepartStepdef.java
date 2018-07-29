package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Departament.DeleteDepart;

import java.util.List;

public class DeleteDepartStepdef {
    DeleteDepart deleted = new DeleteDepart();


    @Then("^hacemos click en la opcion departamento que se encuentra en el header$")
    public void hacemosClickEnLaOpcionDepartamentoQueSeEncuentraEnElHeader() {
        deleted.SelectDepartemento();

    }

    @And("^registramos una nuevo departamentos$")
    public void registramosUnaNuevoDepartamentos() {
        deleted.NewDepartament();
    }

    @And("^llenar el formulario del departmentos$")

    public void llenarElFormularioDelDepartmentos(DataTable datosDepart) {
        List<List<String>> datos = datosDepart.raw();
        for (List<String> dato : datos) {
            switch (dato.get(0)) {
                case "Ingresar el nombre":
                    deleted.llenoNombre(dato.get(1));
                    break;
                case "Ubicacion":
                    deleted.ubicaciondepartament(dato.get(1));
                    break;
                case "Telefono":
                    deleted.telefonodepartament(dato.get(1));
                    break;
                case "Descripcion":
                    deleted.descriptiondepartament(dato.get(1));
                    break;
            }
        }
    }

    @And("^hacemos click en deleted$")
    public void hacemosClickEnDeleted() {
        deleted.eleminardepartamento();
    }

    @And("^hacer click en el botoon guardar$")
    public void hacerClickEnElBotoonGuardar() {
        deleted.guardarDepartament();
        ;
    }
}