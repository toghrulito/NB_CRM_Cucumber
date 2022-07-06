package com.NB_CRM.pages;

import com.NB_CRM.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name="USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(className="login-btn")
    public WebElement loginButton;

    public void Login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
