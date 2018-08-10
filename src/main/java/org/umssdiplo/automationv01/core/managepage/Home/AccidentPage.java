/**
 * @autor: Raúl Choque
 **/
package org.umssdiplo.automationv01.core.managepage.Home;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class AccidentPage extends BasePage {

    @FindBy(xpath = "//span[@class = 'btn btn-link']")
    private WebElement accidentFormLink;

    @FindBy(id = "employeeId")
    private WebElement selectEmployee;

    @FindBy(id = "typeAccidentId")
    private WebElement selectAccidentType;

    @FindBy(id = "description")
    private WebElement description;

    @FindBy(xpath = "//button[contains(text(),'Guardar\n" +
            "          ')]")
    private WebElement saveAccident;

    @FindBy(xpath = "//span[@class='btn btn-link pull-right']")
    private WebElement imagaSearch;

    @FindBy(id = "typeAccidentFilter")
    private WebElement selectSearchAccidentType;

    @FindBy(xpath = "//button[contains(text(),'Buscar')]")
    private WebElement searchButton;

    @FindBy(xpath = "//table[1]/tbody/tr/td[2]")
    private WebElement searchFirstName;

    @FindBy(xpath = "//table[@class='table']/tbody/tr[45]/td[2]")
    private WebElement nameEmployeeUpdate;

    @FindBy(xpath = "//table[@class='table']/tbody/tr[6]/td[4]/button")
    private WebElement buttonToEmployeeUpdate;


    public void sendEmployee(String nameEmployee) {

        WebElement employeeName=ManageDriver.getInstance().getWebDriver().
                findElement(By.xpath("//option[contains(text(),'"+nameEmployee+"')]"));
        selectEmployee.click();
        employeeName.click();
    }

    private void sendAccidentType(String nameAccidentType) {
        WebElement AccidentTypeName=ManageDriver.getInstance().getWebDriver().
                findElement(By.xpath("//option[contains(text(),'"+nameAccidentType+"')]"));

        selectAccidentType.click();
        AccidentTypeName.click();
    }

    private void sendDescription(String senddescription) {
        description.sendKeys(senddescription);
    }


    public void goToAccidentForm(){
        accidentFormLink.click();
    }

    public void completeAccidentForm(DataTable data) {

        List<List<String>> credenciales = data.raw();
        sendEmployee(credenciales.get(0).get(1));
        sendAccidentType(credenciales.get(1).get(1));
        sendDescription(credenciales.get(2).get(1));
        toDoClickButtonSaveAccdent();
    }

    private void toDoClickButtonSaveAccdent() {

        saveAccident.click();

    }

    public void selectSearch() {

        imagaSearch.click();

    }

    public void searchByAccidentType(String accidentType) {


        selectSearchAccidentType.click();
        WebElement AccidentTypeNameone=ManageDriver.getInstance().getWebDriver().
                findElement(By.xpath("//select[@id='typeAccidentFilter']/option[contains(text(),'"+accidentType+"')]"));
        AccidentTypeNameone.click();
        searchButton.click();

    }

    public void compareToFirstName(String firstName) {

        String actuaFirstName = searchFirstName.getAttribute("innerText");
        Assert.assertTrue(actuaFirstName.contains(firstName));
    }

    public void updateAccident(String nameEmployee) {
        String actualName = nameEmployeeUpdate.getAttribute("innerText");
        Assert.assertTrue(actualName.contains(nameEmployee), "this name with name: "+nameEmployee+ " not exist");

    }

    public void selectButton() {
        buttonToEmployeeUpdate.click();
    }

    public void updateDescription(String neWDescription) {
        description.clear();
        description.sendKeys(neWDescription);
        toDoClickButtonSaveAccdent();
    }
}
