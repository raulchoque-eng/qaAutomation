package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Login extends BasePage {
    @FindBy(id = "user_email")
    private WebElement emailTextBox;

    @FindBy(id = "user_password")
    private WebElement passwordTextBox;

    @FindBy(id = "btn-signin")
    private WebElement loginButton;

    @FindBy(xpath = "//p[contains(text(),'Signed in successfully.')]")
    private WebElement successLoginMessage;

    public void login(){
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        CommonEvents.setInputField(emailTextBox,username);
        CommonEvents.setInputField(passwordTextBox,password);
        CommonEvents.clickButton(loginButton);
        CommonEvents.waitForEelmentIsNotVisible(successLoginMessage);


    }
}
