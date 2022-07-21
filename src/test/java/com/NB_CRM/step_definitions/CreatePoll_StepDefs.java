package com.NB_CRM.step_definitions;

import com.NB_CRM.pages.HomePage;
import com.NB_CRM.pages.LoginPage;
import com.NB_CRM.utils.BrowserUtils2;
import com.NB_CRM.utils.ConfigReader;
import com.NB_CRM.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class CreatePoll_StepDefs {
    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();

    String question;
    String title;

    WebDriverWait wait;

    String answer1 = "It is my dream work";

    String answer3 = "Haya kuye dushdum";


    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        String url = ConfigReader.getProperty("env");
        Driver.getDriver().get(url);

        loginPage.login("HelpDesk", "passwordHelpDesk");


    }

    @When("I click {string} button on {string} window")
    public void i_click_button_on_window(String button, String window) throws Exception {
        switch (window.toLowerCase()) {
            case "homepage":
                homePage.clickButton(button);
                break;
                default:
                throw new Exception("There is NOT such a window: " + window);

        }
        BrowserUtils2.sleep();
    }

    @When("I fill all fields and click {string} button on the {string} window")
    public void i_fill_all_fields_and_click_button_on_the_window(String button, String window)  throws Exception{
        Driver.getDriver().switchTo().frame(homePage.iframe);
        title = "NIYE aye?";
        homePage.titleMSG.sendKeys(title);
        Driver.getDriver().switchTo().defaultContent();
        question = "Don't worry";
        homePage.questionFieldForPoll.sendKeys(question);
        homePage.answerQuestionToPoll1.sendKeys(answer1);
        homePage.answerQuestionToPoll2.sendKeys(answer3);
        switch (window.toLowerCase()) {
            case "homepage":
                homePage.clickButton(button);
                break;
            case "send":
                homePage.clickButton(button);
                break;
            default:
                throw new Exception("There is NOT such a window: " + window);

        }


        BrowserUtils2.sleep();


    }

    @Then("I should see poll in the activity stream")
    public void i_should_see_poll_in_the_activity_stream() {



        Assert.assertTrue(homePage.element(title).isDisplayed());

    }



    @When("I click {string} checkbox")
    public void i_click_checkbox_on_the_window(String checkbox) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",homePage.allowMultipleChoiceCheckboxPoll);
        BrowserUtils2.sleep();
    }
    @Then("allow multiple Choice should be checked")
    public void should_be_checked_on_the_window() {
        Assert.assertTrue(homePage.allowMultipleChoiceCheckboxPoll.isSelected());
    }


    @Then("I should be able to add more question")
    public void i_should_be_able_to_add_more_question() {
        List<WebElement> addMoreQuestionPoll = homePage.addMoreQuestionPoll;
        Assert.assertEquals("TEST FAILED!",1,addMoreQuestionPoll.size());
    }

    @Then("I should be able to cancel poll")
    public void i_should_be_able_to_cancel_poll() {
        List<WebElement> questionFieldForPollForCanceling = homePage.questionFieldForPollForCanceling;
        Assert.assertEquals("TEST FAILED",0,questionFieldForPollForCanceling.size());
    }




}
