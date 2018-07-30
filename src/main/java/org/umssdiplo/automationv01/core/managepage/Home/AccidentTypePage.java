/**
 * @autor: Raúl Choque
 **/
package org.umssdiplo.automationv01.core.managepage.Home;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

import java.util.List;

public class AccidentTypePage extends BasePage {

    @FindBy(id = "nombre_equipo")
    private WebElement nameTextBox;

    @FindBy(id = "description")
    private  WebElement descriptionTextBox;

    @FindBy(css = ".btn.btn-success.pull-right")
    private WebElement sabeButton;

    public void completeAcciTypeForm(DataTable data) {
        List<List<String>> credenciales = data.raw();
        sendName(credenciales.get(0).get(1));
        sendDesciption(credenciales.get(1).get(1));
        toDoClickButtonSaveAccidentType();
    }

    private void sendName(String name) {
        nameTextBox.sendKeys(name);

    }

    private void sendDesciption(String description) {
        descriptionTextBox.sendKeys(description);

    }

    private void toDoClickButtonSaveAccidentType() {
        sabeButton.click();
    }
}
