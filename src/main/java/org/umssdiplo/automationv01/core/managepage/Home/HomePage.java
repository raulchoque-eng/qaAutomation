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

import java.security.Key;
import java.sql.DriverManager;
import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Bienvenido!!!!')]")
    private WebElement messageLabel;

    public void seeMessage(String message) {

<<<<<<< HEAD
    public void verifyCouseIsDisplayed(String course){
        WebElement courseName=ManageDriver.getInstance().getWebDriver().
                findElement(By.xpath("//h4[contains(text(),'"+course+"')]"));
        Assert.assertTrue(CommonEvents.isVisible(courseName));

=======
        String actualMesssage = messageLabel.getAttribute("innerText");
        Assert.assertEquals(actualMesssage, message);
>>>>>>> automation test from Accident and Accident Type
    }

}
