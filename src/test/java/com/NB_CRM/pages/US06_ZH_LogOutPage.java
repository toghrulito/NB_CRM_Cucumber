package com.NB_CRM.pages;

import com.NB_CRM.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US06_ZH_LogOutPage {
    public US06_ZH_LogOutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(css = "#user-name")
    public WebElement logoutModule;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutBtn;
}
