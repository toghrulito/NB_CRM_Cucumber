package com.NB_CRM.pages;

import com.NB_CRM.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TimeAndReportsPage extends BasePage {
    public TimeAndReportsPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//a[@class='main-buttons-item-link']//span[.='Absence Chart']")
    public WebElement absenceChartLink;


    @FindBy(xpath = "//span[.='Day']")
    public WebElement dayFilter;

    @FindBy(xpath = "//span[.='Week']")
    public WebElement weekFilter;

    @FindBy(xpath = "//span[.='Month']")
    public WebElement monthFilter;


    @FindBy(xpath = "//table[@class='bx-calendar-day-control-table']//tr/td[2]")
    public WebElement getDayFilterDay;

    @FindBy(xpath = "(//table[@class='bx-calendar-week-main-table']//td/a)[1]")
    public WebElement weekFilterDay;


    @FindBy(xpath = "//table[@class='bx-calendar-month-main-table']//td/a")
    public List<WebElement> monthFilterDays;









}
