package com.NB_CRM.step_definitions;

import com.NB_CRM.pages.LoginPage;
import com.NB_CRM.utils.ConfigReader;
import com.NB_CRM.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the login window")
    public void i_am_on_the_login_window() {
        String url = ConfigReader.getProperty("env");
        Driver.getDriver().get(url);
    }

    @When("I enter {string} and enter {string}")
    public void i_enter_and_enter(String username, String password,String window) {
        username+="@cybertekschool.com";
        loginPage.loginField.sendKeys(username);
        loginPage.passwordField.sendKeys(password);

    }



    @Then("I should land homepage")
    public void i_should_land_homepage() {

    }

}
