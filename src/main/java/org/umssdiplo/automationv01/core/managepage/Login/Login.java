package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Login extends BasePage {


    @FindBy(xpath = "//input[contains(@placeholder,'Username')]")
    private WebElement emailTextBox;

    @FindBy(xpath = "//input[contains(@placeholder,'Password')]")
    private WebElement passwordTextBox;

    @FindBy(className = "w-100")
    private WebElement loginButton;


    public void login() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        CommonEvents.setInputField(emailTextBox,username);
        CommonEvents.setInputField(passwordTextBox,password);
        CommonEvents.clickButton(loginButton);

    }

}
