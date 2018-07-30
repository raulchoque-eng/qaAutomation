package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Login extends BasePage {
<<<<<<< HEAD


    @FindBy(xpath = "//input[contains(@placeholder,'Username')]")
    private WebElement emailTextBox;

    @FindBy(xpath = "//input[contains(@placeholder,'Password')]")
    private WebElement passwordTextBox;

    @FindBy(className = "w-100")
    private WebElement loginButton;

=======
   // @FindBy(id = "user_email")
   @FindBy(xpath = "//input[contains(@placeholder,'Username')]")
    private WebElement emailTextBox;

    //@FindBy(id = "user_password")
    @FindBy(xpath = "//input[contains(@placeholder,'Password')]")
    private WebElement passwordTextBox;

    //@FindBy(id = "btn-signin")
    @FindBy(className = "w-100")
    private WebElement loginButton;

    /*@FindBy(xpath = "//p[contains(text(),'Signed in successfully.')]")
    private WebElement successLoginMessage;*/
>>>>>>> cdbda93bea1c6cfde94659e057ed145e993a8e69

    public void login() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        CommonEvents.setInputField(emailTextBox,username);
        CommonEvents.setInputField(passwordTextBox,password);
        CommonEvents.clickButton(loginButton);
<<<<<<< HEAD
=======
       // CommonEvents.waitForEelmentIsNotVisible(successLoginMessage);

>>>>>>> cdbda93bea1c6cfde94659e057ed145e993a8e69

    }

}
