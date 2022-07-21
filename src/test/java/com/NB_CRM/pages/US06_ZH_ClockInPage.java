package com.NB_CRM.pages;

import com.NB_CRM.utils.Driver;
import com.google.errorprone.annotations.FormatMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US06_ZH_ClockInPage {
   public US06_ZH_ClockInPage(){
       PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#timeman-block")
    public WebElement clock;

    //CLOCK IN
    @FindBy(css = "#timeman-container")
    public WebElement clockInModule;

   //CLOCK OUT
    @FindBy(css = "span[class='webform-small-button-text']")
    public WebElement clockOutModule;

    ////span[@class='webform-small-button-text']

    //Daily Plan
    @FindBy(xpath = "//span[.='Daily Plan']")
    public WebElement dailyPlanModule;

    //Enter a new task
    @FindBy(xpath ="//div[@class='tm-popup-task-form tm-popup-task-form-disabled']//input" )
    public WebElement enterANewTaskModule;

    //Time Start
    @FindBy(xpath = "//input[@class='tm-popup-event-start-time-textbox_am_pm']")
    public WebElement timeStartModule;

    //Clock -increase Hour
    @FindBy(xpath = "(//table[@class='bxc-cus-sel-tbl']//tr//td[@title='Increase (Up)'])[1]")
    public WebElement increaseUpHourModule;

    //Clock - Decrease Hour
    @FindBy(xpath = "(//table[@class='bxc-cus-sel-tbl']//tr//td[@title='Decrease (Down)'])[1]")
    public WebElement decreaseUpHourModule;


    //Clock - Increase Minute
    @FindBy (xpath = "(//table[@class='bxc-cus-sel-tbl']//tr//td[@title='Increase (Up)'])[2]")
    public WebElement increaseUpMinuteModule;
   //Clock - Decrease Minute
    @FindBy(xpath = "(//table[@class='bxc-cus-sel-tbl']//tr//td[@title='Decrease (Down)'])[2]")
    public WebElement decreaseUpMinuteModule;

    //Select button
    @FindBy(xpath = "//span[.='Select']")
    public WebElement selectModule;

    //New Event
    @FindBy(xpath = "//input[@class='tm-popup-event-form-textbox_am_pm']")
    public WebElement newEventModule;

    //out of office
    @FindBy(xpath = "//input[@class='checkbox']")
    public WebElement outOfOfficeModule;



}
