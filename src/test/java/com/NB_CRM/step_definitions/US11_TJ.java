package com.NB_CRM.step_definitions;

import com.NB_CRM.pages.LoginPage;
import com.NB_CRM.pages.SiteMapMenuPage;
import com.NB_CRM.pages.TimeAndReportsPage;
import com.NB_CRM.pages.WorkTimePage;
import com.NB_CRM.utils.BrowserUtils2;
import com.NB_CRM.utils.ConfigReader;
import com.NB_CRM.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US11_TJ {

    LoginPage loginPage = new LoginPage();
    SiteMapMenuPage siteMap = new SiteMapMenuPage();
    TimeAndReportsPage timeAndReportsPage = new TimeAndReportsPage();
    WorkTimePage workTimePage = new WorkTimePage();


    @Given("{string} on the landing page")
    public void on_the_landing_page(String string) {
        String env = ConfigReader.getProperty("env");
        Driver.getDriver().get(env);

        String passwordMarketing = ConfigReader.getProperty("passwordMarketing");
        loginPage.login(string, passwordMarketing);
    }

    @When("user click navigation bar")
    public void user_click_navigation_bar() {

        loginPage.siteMapMenu.click();
    }

    @When("should able to click time and reports module")
    public void should_able_to_click_time_and_reports_module() {
        siteMap.timeAndReports.click();
    }

    @Then("User should able to see absence char")
    public void user_should_able_to_see_absence_char() {
        boolean displayed = timeAndReportsPage.absenceChartLink.isDisplayed();
        Assert.assertTrue(displayed);

    }

    @When("User should able to click Day in the chart")
    public void userShouldAbleToClickDayInTheChart() {
        timeAndReportsPage.dayFilter.click();

    }

    @Then("User should able to see one of the day on the top of chart")
    public void userShouldAbleToSeeOneOfTheDayOnTheTopOfChart(List<String> daysOfTheWeek) {
        String actual = timeAndReportsPage.getDayFilterDay.getText();

        for (String day : daysOfTheWeek) {

            if (day.contains(actual)) {
                Assert.assertTrue(true);
                break;
            }
        }
    }

    @When("User should able to click week in the chart")
    public void userShouldAbleToClickWeekInTheChart() {
        timeAndReportsPage.weekFilter.click();

    }

    @Then("User should able to see week days in the chart")
    public void userShouldAbleToSeeWeekDaysInTheChart() {
        String actual = timeAndReportsPage.weekFilterDay.getText();

        Assert.assertTrue(actual.contains("Mo"));

    }

    @When("User should able to click Month in the chart")
    public void userShouldAbleToClickMonthInTheChart() {
        timeAndReportsPage.monthFilter.click();
    }

    @Then("User should able to see days of the month in the chart")
    public void userShouldAbleToSeeDaysOfTheMonthInTheChart() {

        List<WebElement> monthFilterDays = timeAndReportsPage.monthFilterDays;
        Assert.assertTrue(monthFilterDays.size() >= 28);
    }

    @And("should able to click time and work time")
    public void shouldAbleToClickTimeAndWorkTime() {
        siteMap.workTime.click();
        BrowserUtils2.sleep(2);

    }

    @Then("user should able to check statistics")
    public void userShouldAbleToCheckStatistics() {
        boolean selected = workTimePage.statisticsCheckbox.isSelected();
        BrowserUtils2.sleep(5);

        if (selected) {
            workTimePage.statisticsCheckbox.click();
            selected=workTimePage.statisticsCheckbox.isSelected();
            Assert.assertFalse(selected);}
//
            BrowserUtils2.sleep(2);

        }


        @And("user should able to check Show start and end times")
        public void userShouldAbleToCheckShowStartAndEndTimes () {
            boolean selected = workTimePage.showStartAndEndTimesCheckbox.isSelected();
            BrowserUtils2.sleep(3);

                workTimePage.showStartAndEndTimesCheckbox.click();
                BrowserUtils2.sleep(3);
                selected=workTimePage.showStartAndEndTimesCheckbox.isSelected();
                Assert.assertTrue(selected);
            }

    }
