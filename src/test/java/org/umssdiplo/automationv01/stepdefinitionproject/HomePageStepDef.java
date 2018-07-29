package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Home.HomePage;

public class HomePageStepDef {
    HomePage home = new HomePage();
    @When("^I search a course with \"([^\"]*)\"$")
    public void i_search_a_course_with(String course){
        home.searchCourse(course);
    }

    @When("^I see the course \"([^\"]*)\" in home page$")
    public void verifyCourseIsDisplayed(String course){
        home.verifyCouseIsDisplayed(course);
    }
    @When("^I go to create New Equipo$")
    public void i_go_to_create_New_Equipo() {
        home.goToCreateEquipo();
        }
    @When("^I will go fill the fields$")
    public void i_will_go_fill_the_fields(DataTable datos) {
        home.goToFillTheFields(datos);
    }

    @When("^I select new TipoEquipo$")
    public void i_select_new_TipoEquipo() {
        home.createNewTipoEquipo();
    }

    @When("^I will go fill the fields of tipoEquipo$")
    public void i_will_go_fill_the_fields_of_tipoEquipo(DataTable datos) {
        home.goToFillFieldsTipoEquipo(datos);
    }
}
