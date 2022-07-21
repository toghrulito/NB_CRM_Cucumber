package com.NB_CRM.pages;

import com.NB_CRM.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteMapMenuPage extends BasePage{
    public SiteMapMenuPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[.='Time and Reports']")
    public WebElement timeAndReports;


    @FindBy(xpath = "//a[.='Worktime']")
    public WebElement workTime;



}
