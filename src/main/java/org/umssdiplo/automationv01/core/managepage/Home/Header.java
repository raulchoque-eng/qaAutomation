package org.umssdiplo.automationv01.core.managepage.Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

public class Header extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'All Courses')]")
    private WebElement allCoursesTab;


    public  void goToAllCoursesTab(){
        allCoursesTab.click();
    }

    @FindBy(id="empleados-dropdown")
    private WebElement SelectPersonal;

    @FindBy(xpath = "//span[contains(text(),'Empleados')]")
    //@FindBy(id="navbar-menu")
    private WebElement SelectEmployees;

    public void goToEmployees() {
        SelectPersonal.click();
        SelectEmployees.click();
    }


    //SALIMOS DE LA PAGINA PRINCIPAL
    @FindBy(id="user-dropdown")
    private WebElement endUser;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement fin;

    public void goTofin() {
        endUser.click();
        fin.click();
    }

    @FindBy(id="empleados-dropdown")
    private WebElement SelectPersona;

    @FindBy(xpath = "//span[contains(text(),'Cargos')]")
    private WebElement SelectCargo;

    public void goToEmployeesCargo() {
        SelectPersona.click();
        SelectCargo.click();
    }
}
