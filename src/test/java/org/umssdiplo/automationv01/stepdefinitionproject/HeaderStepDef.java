package org.umssdiplo.automationv01.stepdefinitionproject;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Home.Header;

public class HeaderStepDef {
    Header headerUI = new Header();
    @When("^I go to the All Courses Tab$")
    public void goToAllCoursesTab() {
        headerUI.goToAllCoursesTab();
    }


    @When("^I go to the Accident tab$")
    public void igo_to_the_Accident_tab(){
            headerUI.goToAccidentTab();
    }

    @Then("^I go to the Accident Type tab$")
    public void iGoToTheAccidentTypeTab() throws Throwable {
        headerUI.goToAccidentTypeTab();
    }

    @When("^I go to the All Equipo Tab$")
    public void i_go_to_the_All_Equipo_Tab() {
        headerUI.goToAllEquipo();
    }
    @When("^I left of the page$")
    public void i_left_of_the_page()  {
        headerUI.leftToPage();
    }
    @When("^I left to the app$")
    public void i_left_to_the_app() {
        headerUI.leftToApp();
    }

    //TipoEquipo
    @When("^I go to the All TipoEquipo Tab$")
    public void i_go_to_the_All_TipoEquipo_Tab() {
        headerUI.goToTipoEquipo();
    }
    @When("^I Select TipoEquipo$")
    public void i_Select_TipoEquipo() {
        headerUI.SelectTipoEquipo();
    }
    @When("^I left of the page TipoEquipo$")
    public void i_left_of_the_page_TipoEquipo()  {
        headerUI.leftToPageTipeEquipo();
    }
    @When("^I left to the app izzy$")
    public void i_left_to_the_app_izzy() {
        headerUI.leftToAppIzzy();
    }

    @And("^I go to the All Cargo Tab$")
    public void iGoToTheAllCargoTab() throws Throwable {
        headerUI.entrarALaPestaniaCargo();
    }

    @And("^entrar a la pestania de auditoria$")
    public void entrarALaPestaniaDeAuditoria() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        headerUI.entrarALaPestaniaAuditoria();
    }
}
