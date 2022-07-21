package com.NB_CRM.pages;

import com.NB_CRM.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US06_ZH_EditPage extends BasePage{
    public US06_ZH_EditPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // edit - pencil
    @FindBy(css = ".tm-popup-notice-pencil")
    public WebElement editModule;

    // Start Time
    @FindBy(xpath = "(//table[@class='bxc-cus-sel-tbl']//tr//td[@class='bxc-pointer'])[1]")
    public WebElement increaseUpStartHourModule;

    @FindBy(xpath = "(//table[@class='bxc-cus-sel-tbl']//tr//td[@class='bxc-pointer'])[2]")
    public WebElement decreaseUpStartHourModule;

    @FindBy(xpath = "(//table[@class='bxc-cus-sel-tbl']//tr//td[@class='bxc-pointer'])[3]")
    public WebElement increaseUpStartMinuteModule;

    @FindBy(xpath = "(//table[@class='bxc-cus-sel-tbl']//tr//td[@class='bxc-pointer'])[4]")
    public WebElement decreaseUpStartMinuteModule;

    // End Time
    @FindBy(xpath = "(//table[@class='bxc-cus-sel-tbl']//tr//td[@class='bxc-pointer'])[5]")
    public WebElement increaseUpEndHourModule;

    @FindBy(xpath = "(//table[@class='bxc-cus-sel-tbl']//tr//td[@class='bxc-pointer'])[6]")
    public WebElement decreaseUpEndHourModule;

    @FindBy(xpath = "(//table[@class='bxc-cus-sel-tbl']//tr//td[@class='bxc-pointer'])[7]")
    public WebElement increaseUpEndMinuteModule;

    @FindBy(xpath = "(//table[@class='bxc-cus-sel-tbl']//tr//td[@class='bxc-pointer'])[8]")
    public WebElement decreaseUpEndMinuteModule;

    //Reason
    @FindBy(xpath = "//div[.='Reason']//textarea")
    public WebElement reasonTextArea;

}
