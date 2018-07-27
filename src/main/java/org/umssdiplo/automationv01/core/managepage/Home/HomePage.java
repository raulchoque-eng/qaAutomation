package org.umssdiplo.automationv01.core.managepage.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.testng.Assert;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.security.Key;
import java.sql.DriverManager;
import java.util.List;

public class HomePage extends BasePage {
    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchCourseTextBox;

    public void searchCourse(String course){
        CommonEvents.setInputField(searchCourseTextBox,course);
        CommonEvents.pressKey(Keys.ENTER);
    }

    public void verifyCouseIsDisplayed(String course){
        WebElement courseName=ManageDriver.getInstance().getWebDriver().
                findElement(By.xpath("//h4[contains(text(),'"+course+"')]"));
        Assert.assertTrue(CommonEvents.isVisible(courseName));

    }

    @FindBy(xpath = "//button[contains(text(),'Crear Empleado')]")
    //@FindBy(id="navbar-menu")
    private WebElement SelectCreateEmployee;

    public void goToCreateEmployees() {
        SelectCreateEmployee.click();
    }

    public void registerPerson() {
        List<List<String>> registerPersonal = datos.raw();
        lleno_el_campo_email_con(credenciales.get(0).get(1));
        lleno_el_campo_password_con(credenciales.get(1).get(1));
        hago_click_en_el_boton_Sing_In();
    }
}


