/**
 * @autor: Raúl Choque
 **/
package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Home.AccidentTypePage;

public class AccidentTypeStepDef {

    AccidentTypePage accidentType = new AccidentTypePage();


    @Then("^I will to complete the accident type form with$")
    public void i_will_to_complete_the_accident_type_form_with(DataTable data) throws Throwable {
        accidentType.completeAcciTypeForm(data);
    }
}
