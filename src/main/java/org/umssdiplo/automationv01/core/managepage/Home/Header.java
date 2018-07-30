package org.umssdiplo.automationv01.core.managepage.Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

public class Header extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'All Courses')]")
    private WebElement allCoursesTab;

    @FindBy(id = "accident-dropdown")
    private WebElement selectAccidentTab;

    @FindBy(xpath = "//span[contains(text(),'Accidentes')]")
    private WebElement accidentTab;

    @FindBy(xpath = "//span[contains(text(),'Tipo de Accidentes')]")
    private WebElement accidentTypeTab;

    public  void goToAllCoursesTab(){
        allCoursesTab.click();
    }

    public void goToAccidentTab(){
        selectAccidentTab.click();
        accidentTab.click();

    }

    public void goToAccidentTypeTab() {
        selectAccidentTab.click();
        accidentTypeTab.click();
    }

}
