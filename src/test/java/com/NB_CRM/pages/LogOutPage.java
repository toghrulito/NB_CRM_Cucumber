package com.NB_CRM.pages;

import com.NB_CRM.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
    public LogOutPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (css = "#user-block")
    public WebElement logoutTab;

    @FindBy (xpath = "//span[.='Log out']")
    public WebElement logoutButton;

    public void logout(){
        logoutTab.click();
        logoutButton.click();
    }
}
