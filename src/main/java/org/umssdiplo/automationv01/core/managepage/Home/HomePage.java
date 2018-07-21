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
}
