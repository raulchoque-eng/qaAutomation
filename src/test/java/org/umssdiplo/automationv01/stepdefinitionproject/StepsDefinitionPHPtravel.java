package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;

    @Given("^La página de concretec está cargado$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }


    //@And("^set my credentials on 'Login' page$")
    //public void setMyCredentialsOnLoginPage() throws Throwable {
        //login.setCredentials();
    //}
}
