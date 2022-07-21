package com.NB_CRM.step_definitions;

import com.NB_CRM.pages.*;
import com.NB_CRM.utils.BrowserUtils2;
import com.NB_CRM.utils.ConfigReader;
import com.NB_CRM.utils.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US06_ZH_StepDefs {

    US06_ZH_ClockInPage us06_zh_clockInPage=new US06_ZH_ClockInPage();
    US06_ZH_EditPage us06_zh_editPage=new US06_ZH_EditPage();
    Faker faker=new Faker();
    Actions actions=new Actions(Driver.getDriver());
    US06_ZH_LogOutPage logOutPage=new US06_ZH_LogOutPage();
    LoginPage loginPage=new LoginPage();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        loginPage.login(ConfigReader.getProperty("usernameHelpDesk"),ConfigReader.getProperty("passwordHelpDesk"));
    }
    @When("I start time tracking with {string} button")
    public void i_start_time_tracking_with_button(String string) {
        BrowserUtils2.waitFor(10);
        BrowserUtils2.waitForClickablility(us06_zh_clockInPage.clock,10);
        us06_zh_clockInPage.clock.click();
        BrowserUtils2.waitFor(10);
        us06_zh_clockInPage.clockInModule.click();
        BrowserUtils2.waitFor(10);
        BrowserUtils2.waitForClickablility(us06_zh_clockInPage.clockOutModule,10);
        us06_zh_clockInPage.clockOutModule.click();

    }
    @Then("I can see working day duration tab")
    public void i_can_see_working_day_duration_tab() {
        us06_zh_clockInPage.dailyPlanModule.click();
        BrowserUtils2.waitFor(10);
        us06_zh_clockInPage.enterANewTaskModule.sendKeys("Hi");
     BrowserUtils2.waitFor(10);
        actions.moveToElement(us06_zh_clockInPage.increaseUpMinuteModule).doubleClick().perform();
        BrowserUtils2.waitForInvisibilityOf(us06_zh_clockInPage.increaseUpMinuteModule);
        actions.moveToElement(us06_zh_clockInPage.increaseUpMinuteModule).doubleClick().perform();

    }
    @When("I click stop tracking with {string} button")
    public void i_click_stop_tracking_with_button(String string) {


    }
    @Then("I can see work hour is end")
    public void i_can_see_work_hour_is_end() {
    }

    @When("I create a new task for daily plan")
    public void i_create_a_new_task_for_daily_plan() {

    }
    @Then("I should see the daily plan")
    public void i_should_see_the_daily_plan() {

    }

    @When("I add an event with starting and ending time")
    public void i_add_an_event_with_starting_and_ending_time() {

    }
    @Then("I should see the event")
    public void i_should_see_the_event() {

    }

    @When("I edit work day starting and ending time")
    public void i_edit_work_day_starting_and_ending_time() {

    }
    @Then("I can see edited work day")
    public void i_can_see_edited_work_day() {

    }

}
