package com.NB_CRM.pages;

import com.NB_CRM.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US01_ZM_Page {

    public US01_ZM_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name="USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(className="login-btn")
    public WebElement loginButton;

    @FindBy(xpath = "//label[contains(text(),'Remember me on this computer')]")
    public WebElement rememberMe;

    @FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
    public WebElement forgotPassword;

    @FindBy(xpath = "//div[contains(text(),'Get Password')]")
    public WebElement forgotPasswordPage;

    public void login_NB(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}










