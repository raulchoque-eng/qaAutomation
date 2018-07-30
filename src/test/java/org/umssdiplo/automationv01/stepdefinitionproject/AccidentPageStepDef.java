/**
 * @autor: Raúl Choque
 **/
package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Home.AccidentPage;

public class AccidentPageStepDef {

    AccidentPage accidentPage = new AccidentPage();

    @Then("^I go to create Accident$")
    public void i_go_to_create_Accident() throws Throwable{
        accidentPage.goToAccidentForm();
    }

    @Then("^I will to complete the accident form with$")
    public void i_will_to_complete_the_accident_form_with(DataTable data) throws Throwable{
        accidentPage.completeAccidentForm(data);

    }

    @When("^I go to search Accident$")
    public void i_go_to_search_Accident() throws Throwable {

        accidentPage.selectSearch();
    }

    @When("^I go to search Accident by his Accident type \"([^\"]*)\"$")
    public void i_go_to_search_an_or_more_Accident_by_his_Accident_type(String accidentType) throws Throwable {
        accidentPage.searchByAccidentType(accidentType);

    }

    @Then("^I go to see this employee \"([^\"]*)\"$")
    public void iGoToSeeThisEmployee(String firstName) throws Throwable {

        accidentPage.compareToFirstName(firstName);
    }

    @Then("^I go to see an accident register with name \"([^\"]*)\"$")
    public void iGoToSeeAnAccidentRegisterWithName(String nameEmployee) throws Throwable {
        accidentPage.updateAccident(nameEmployee);
    }

    @And("^I go to select buttonUpdate$")
    public void iGoToSelectButtonUpdate() throws Throwable {
        accidentPage.selectButton();
    }

    @And("^I got to update his desccription \"([^\"]*)\"$")
    public void iGotToUpdateHisDesccription(String description) throws Throwable {
        accidentPage.updateDescription(description);
    }
}
