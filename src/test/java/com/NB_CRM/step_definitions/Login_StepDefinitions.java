package com.NB_CRM.step_definitions;

import com.NB_CRM.pages.LoginPage;
import com.NB_CRM.utils.BrowserUtils2;
import com.NB_CRM.utils.ConfigReader;
import com.NB_CRM.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {
    LoginPage loginPage;
    @Given("User is on NextBaseCRM login page")
    public void user_is_on_next_base_crm_login_page() {
        String env = ConfigReader.getProperty("env");
        Driver.getDriver().get(env);
    }
    @When("User enters marketing valid username")
    public void user_enter_valid_user_name() {
        String usernameMarketing = ConfigReader.getProperty("usernameMarketing");
        loginPage=new LoginPage();
        loginPage.usernameInput.sendKeys(usernameMarketing);
    }
    @When("User enters marketing valid password")
    public void user_enter_valid_password() {
        String passwordMarketing = ConfigReader.getProperty("passwordMarketing");
        loginPage=new LoginPage();
        loginPage.passwordInput.sendKeys(passwordMarketing);

    }
    @When("User click login button")
    public void user_click_login_button() {
        loginPage=new LoginPage();
        loginPage.loginButton.click();
    }
    @Then("User should launch to the homepage")
    public void user_should_launch_to_the_homepage() {
        String expected="Portal";
        Assert.assertEquals(expected,Driver.getDriver().getTitle());

    }

    @When("User enters hr valid username")
    public void userEntersHrValidUsername() {
        String usernameHr = ConfigReader.getProperty("usernameHr");
        loginPage=new LoginPage();
        loginPage.usernameInput.sendKeys(usernameHr);
    }


    @And("User enters hr valid password")
    public void userEntersHrValidPassword() {
        String passwordHr = ConfigReader.getProperty("passwordHr");
        loginPage=new LoginPage();
        loginPage.passwordInput.sendKeys(passwordHr);
    }

    @When("User enters helpdesk valid username")
    public void userEntersHelpdeskValidUsername() {
        String usernameHelpDesk = ConfigReader.getProperty("usernameHelpDesk");
        loginPage=new LoginPage();
        loginPage.usernameInput.sendKeys(usernameHelpDesk);
    }

    @And("User enters helpdesk valid password")
    public void userEntersHelpdeskValidPassword() {
        String passwordHelpDesk = ConfigReader.getProperty("passwordHelpDesk");
        loginPage=new LoginPage();
        loginPage.passwordInput.sendKeys(passwordHelpDesk);
    }
}
