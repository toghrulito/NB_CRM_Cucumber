package com.NB_CRM.pages;

import com.NB_CRM.utils.ConfigReader;
import com.NB_CRM.utils.Driver;
import com.google.common.base.Function;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public  class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name = "USER_LOGIN")
    public WebElement loginField;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordField;


    @FindBy(className = "login-btn")
    public WebElement loginButton;



    public void login(String username,String password){
       String s =ConfigReader.getProperty(username);
       String pass  = ConfigReader.getProperty(password);
        loginField.sendKeys(s);
        passwordField.sendKeys(pass);
        loginButton.click();



    }








}
