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
}
