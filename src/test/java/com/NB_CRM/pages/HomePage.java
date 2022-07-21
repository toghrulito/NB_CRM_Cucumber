package com.NB_CRM.pages;

import com.NB_CRM.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class HomePage extends LoginPage{

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollButton;

    @FindBy(css = ".bx-editor-iframe")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement titleMSG;

    @FindBy(xpath = "//input[contains(@placeholder,'Question')]")
    public WebElement questionFieldForPoll;

    @FindBy(id = "answer_0__0_")
    public WebElement answerQuestionToPoll1;

    @FindBy(id = "answer_0__1_")
    public WebElement answerQuestionToPoll2;


    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButtonForPoll;

    @FindBy(css = ".vote-checkbox-wrap>input")
    public WebElement allowMultipleChoiceCheckboxPoll;

    @FindBy(id = "question_0")
    public WebElement questionForPoll;
    @FindBy(id = "question_1")
    public List<WebElement> addMoreQuestionPoll;

    @FindBy(linkText = "Add question")
    public WebElement addQuestionButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelPollButton;

    @FindBy(xpath = "//input[contains(@placeholder,'Question')]")
    public List<WebElement> questionFieldForPollForCanceling;


//    public boolean isAdded() {
//        String locator = questionForPoll.getAttribute("id");
//        locator = locator.substring(0,locator.length() - 1) +"1";
//
//        try {
//            Driver.getDriver().findElement(By.id(locator));
//            return true;
//        }catch (Exception e){
//            return false;
//        }
//
//    }


    public void clickButton(String button) {

        WebElement element = null;


        try {


            switch (button.toLowerCase()) {

                case "poll":
                    element = pollButton;
                    break;
                case "send":
                    element = sendButtonForPoll;
                    break;
                case "add question":
                    element = addQuestionButton;
                    break;
                case "cancel":
                    element = cancelPollButton;
                    break;

                default:
                    throw new Exception("There is NOT such a button: " + button);
            }
            if (element.isEnabled() && element != null) {
                element.click();
            } else {
                System.out.println(button + " is NOT enabled");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public WebElement element(String input) {
        String locator = "//div[.='" + input + "']";

        return Driver.getDriver().findElement(By.xpath(locator));
    }


}
