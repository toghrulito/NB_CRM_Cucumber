package com.NB_CRM.pages;

import com.NB_CRM.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    

    @FindBy(css = "#feed-add-post-form-tab-tasks span")
    public WebElement elementSpan;

    @FindBy(xpath = "//span[.='Task']/span")
    public WebElement taskTab;

    @FindBy(xpath = "//span[.='Event']/span")
    public WebElement eventTab;

    @FindBy(id = "tasks-task-priority-cb")
    public WebElement highPriorityCheck;


    @FindBy(xpath = "//label[@for='tasks-task-priority-cb']")
    public WebElement highPriorityLabel;

    @FindBy(css = ".tasks-task-mpf-link")
    public WebElement checklist;

    @FindBy(css = ".js-id-checklist-is-i-title ")
    public WebElement checklistItem;

    @FindBy(css = ".task-checklist-form-vpadding>input")
    public WebElement checklistItemInputBox;

    @FindBy(xpath = "//span[@data-bx-id='dateplanmanager-deadline']/input[@type='text']")
    public WebElement deadlineTimeBox;

    @FindBy(xpath = "//span[.='Select']")
    public WebElement deadlineTimeBoxSelect;


    @FindBy(xpath = "//span[.='Time planning']")
    public WebElement timePlaningLink;


    @FindBy(xpath = "//span[@data-bx-id='dateplanmanager-start-date-plan']/input[@type='text']")
    public WebElement timePlaningStartDate;

    @FindBy(xpath = "//span[@data-bx-id='dateplanmanager-end-date-plan']/input[@type='text']")
    public WebElement timePlaningEndDate;


    @FindBy(id = "sitemap-menu")
    public WebElement siteMapMenu;


    @FindBy(xpath = "//input[@placeholder='Event name']")
    public WebElement eventNameInput;


    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;











}
