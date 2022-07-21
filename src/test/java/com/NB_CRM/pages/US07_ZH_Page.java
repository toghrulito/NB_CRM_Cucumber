package com.NB_CRM.pages;

import com.NB_CRM.utils.BrowserUtils2;
import com.NB_CRM.utils.Driver;
import io.cucumber.java.an.E;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class US07_ZH_Page {

    public US07_ZH_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Like']")
    private List<WebElement> likeButtonOfCRMWindow;

    @FindBy(xpath = "//span[@id='log_entry_follow_14052']")
    public List<WebElement> followButtonOfCRMWindow;

    @FindBy(xpath = "//a[.='Unfollow']")
    public List<WebElement> unfollowButtonOfCRMWindow;

    @FindBy(xpath = "//span[@class='feed-content-view-cnt']")
    public List<WebElement> eyeIconButtonWindow;

    @FindBy(xpath = "//a[@class='bx-contentview-popup-img']")
    public List<WebElement> viewedAPostWindow;

    @FindBy(xpath = "//div[@class='feed-post-important-switch']")
    private List<WebElement> starIconOnCRMWindow;

    @FindBy(xpath = "//div[@class='feed-post-important-switch feed-post-important-switch-active']")
    private List<WebElement> starIconChangedToOrangeColorOnCRMWindow;

    @FindBy(xpath = "//a[.='Comment']")
    public List<WebElement> commentSectionOnCRMWindow;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement commentBodySectionOnCRWindow;

    @FindBy(xpath = "//button[.='Cancel']")
    public List<WebElement> cancelButtonOnCRMWindow;


    @FindBy(xpath = "//button[.='Send']")
    public List<WebElement> sendButtonOnCRMWindow;

    public void clickButtons(String button) throws Exception {

        switch (button.toLowerCase()) {
            case LibraryConstants.FOLLOWBUTTON:
                for (int i = 0; i < followButtonOfCRMWindow.size(); i++) {
                    followButtonOfCRMWindow.get(0).click();
                    break;
                }
                break;
            case LibraryConstants.UNFOLLOWBUTTON:
                for (int i = 0; i < unfollowButtonOfCRMWindow.size(); i++) {
                    unfollowButtonOfCRMWindow.get(0).click();
                    break;
                }
                break;
            case LibraryConstants.LIKEBUTTON:
                for (int i = 0; i < likeButtonOfCRMWindow.size(); i++) {
                    likeButtonOfCRMWindow.get(0).click();
                    break;
                }
            default:
                throw new Exception("Failed " + button);
        }
    }

    public void eyeIconButtonOnCRM() throws Exception {

        WebElement elements = null;
        for (int i = 0; i < eyeIconButtonWindow.size(); i++) {
            elements = eyeIconButtonWindow.get(0);
            BrowserUtils2.waitForVisibility(elements, 10);
            BrowserUtils2.hover(elements);
            elements = viewedAPostWindow.get(0);
            BrowserUtils2.waitForVisibility(elements, 10);
            BrowserUtils2.verifyElementDisplayed(elements);

        }
        throw new Exception("Failed");
    }

    public void starIconOnCRMWindow() throws Exception {
        WebElement element = null;
        for (int i = 0; i < starIconOnCRMWindow.size(); i++) {
            element = starIconOnCRMWindow.get(0);
            element.click();
            BrowserUtils2.waitForVisibility(element, 10);
            element = starIconChangedToOrangeColorOnCRMWindow.get(0);
            BrowserUtils2.verifyElementDisplayed(element);

        }
        throw new Exception("Failed");
    }


    public void commentSectionOnCRMWindoww() throws Exception {
        WebElement element = null;
        for (int i = 0; i < commentSectionOnCRMWindow.size(); i++) {
            element = commentSectionOnCRMWindow.get(0);
            element.click();
            BrowserUtils2.waitForVisibility(element, 10);
            Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
            BrowserUtils2.waitForVisibility(element, 10);
            commentBodySectionOnCRWindow.sendKeys(LibraryConstants.COMMENT);

        }
        throw new Exception("Failed");
    }

    public void cancelAndSENDButtonOnCRMWindow(String buttons) throws Exception {
        WebElement element = null;
        for (int i = 0; i < commentSectionOnCRMWindow.size(); i++) {
            element = commentSectionOnCRMWindow.get(0);
            element.click();
            BrowserUtils2.waitForVisibility(element, 10);
            Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
            BrowserUtils2.waitForVisibility(element, 10);
            commentBodySectionOnCRWindow.sendKeys(LibraryConstants.COMMENT);

            switch (buttons.toLowerCase()) {
                case LibraryConstants.CANCELBUTTON:
                    for (int j = 0; j < cancelButtonOnCRMWindow.size(); j++) {
                        element = cancelButtonOnCRMWindow.get(0);
                        element.click();
                        break;
                    }
                case LibraryConstants.SENDBUTTON:
                    for (int a = 0; a < sendButtonOnCRMWindow.size(); a++) {
                        element = sendButtonOnCRMWindow.get(0);
                        element.click();
                        break;
                    }
                default:
                    throw new Exception("Failed");
            }
        }
    }
}
