package com.NB_CRM.pages;

import com.NB_CRM.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkTimePage extends BasePage {

    public WorkTimePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//label[.='Statistics']")
    public WebElement statisticsCheckbox;


//    @FindBy(xpath = "//label[.='Show start and end times']")
//    public WebElement showStartAndEndTimesCheckbox;

    @FindBy(id = "additional")
    public WebElement showStartAndEndTimesCheckbox;



}
