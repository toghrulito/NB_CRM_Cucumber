package com.NB_CRM.step_definitions;

import com.NB_CRM.pages.US01_ZM_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US01_StepDef_ZM {
    US01_ZM_Page page=new US01_ZM_Page();


    @Given("User is at NextBase login page and user entered email {string} and passcode {string}")
    public void user_is_at_next_base_login_page_and_user_entered_email_and_passcode(String string, String string2) {
        
    }
    @Given("User is checked on  {string} option")
    public void user_is_checked_on_option(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User succesfully logged in the page")
    public void user_succesfully_logged_in_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @Given("Verify user is able to see {string}")
    public void verify_user_is_able_to_see(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User is able to enter to {string} link page")
    public void user_is_able_to_enter_to_link_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {

    }
}
