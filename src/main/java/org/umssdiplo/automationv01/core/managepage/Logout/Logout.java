/**
 * @autor: Raúl Choque
 **/
package org.umssdiplo.automationv01.core.managepage.Logout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.BasePage;

public class Logout extends BasePage {

    @FindBy(id = "user-dropdown")
    private WebElement user;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logout;


    public void clouseSesion() {
        user.click();
        logout.click();

    }

}
