package com.NB_CRM.step_definitions;

import com.NB_CRM.pages.BasePage;
import com.NB_CRM.pages.LoginPage;
import com.NB_CRM.utils.BrowserUtils2;
import com.NB_CRM.utils.ConfigReader;
import com.NB_CRM.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US10_TJ {
    BasePage main=new BasePage();
    LoginPage loginPage=new LoginPage();

    @Given("user on the landing page")
    public void user_on_the_landing_page() {
        String env = ConfigReader.getProperty("env");
        Driver.getDriver().get(env);

        String usernameMarketing = ConfigReader.getProperty("usernameMarketing");
        String passwordMarketing = ConfigReader.getProperty("passwordMarketing");
        loginPage.login(usernameMarketing,passwordMarketing);
    }



    @When("user click on Task tab")
    public void user_click_on_task_tab() {
        main.taskTab.click();
        BrowserUtils2.sleep(2);

    }
    @When("user check the High Priority")
    public void user_check_the_high_priority() {
        main.highPriorityCheck.click();

    }
    @Then("verify that {string} check box is selected")
    public void verify_that_check_box_is_selected(String string) {
        Assert.assertTrue(main.highPriorityCheck.isDisplayed());
        Assert.assertTrue(main.highPriorityLabel.isEnabled());

    }

    @And("user click on checklist button")
    public void userClickOnChecklistButton() {
        BrowserUtils2.sleep(2);
        main.checklist.click();


    }

    @Then("verify that user can add checklist")
    public void verifyThatUserCanAddChecklist() {
        main.checklistItemInputBox.sendKeys("Item Number one" + Keys.ENTER);
        Assert.assertTrue(main.checklistItem.isDisplayed());
    }

    @And("user should able to add deadline time")
    public void userShouldAbleToAddDeadlineTime() {
        main.deadlineTimeBox.click();
        BrowserUtils2.sleep(1);
        main.deadlineTimeBoxSelect.click();

    }

    @And("user should able to add time planing start and finish date")
    public void userShouldAbleToAddTimePlaningStartAndFinishDate() {
        main.timePlaningLink.click();
        main.timePlaningStartDate.click();
        main.deadlineTimeBoxSelect.click();
        //main.timePlaningEndDate.click();

    }

    @Then("user should able to see dates added")
    public void userShouldAbleToSeeDatesAdded() {
        Assert.assertTrue(main.deadlineTimeBox.isDisplayed());
        Assert.assertTrue(main.timePlaningEndDate.isDisplayed());
        //TODO verification problem date selection

    }
}
