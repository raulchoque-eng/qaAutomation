package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Login extends BasePage {
    @FindBy(id = "user")
    private WebElement emailTextBox;

    @FindBy(id = "passw")
    private WebElement passwordTextBox;

    @FindBy(id = "buton")
    private WebElement loginButton;

    @FindBy(id = "user-dropdown")
    private WebElement Desloguearse;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logout;
//    @FindBy(xpath = "//p[contains(text(),'Signed in successfully.')]")
//    private WebElement successLoginMessage;

    public void login(){
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        CommonEvents.setInputField(emailTextBox,username);
        CommonEvents.setInputField(passwordTextBox,password);
        CommonEvents.clickButton(loginButton);
//        CommonEvents.waitForEelmentIsNotVisible(successLoginMessage);


    }

    public void cerrarSesion1() {
        CommonEvents.clickButton(Desloguearse);
    }

    public void cerrarSesion() {
        CommonEvents.clickButton(logout);
    }
}
