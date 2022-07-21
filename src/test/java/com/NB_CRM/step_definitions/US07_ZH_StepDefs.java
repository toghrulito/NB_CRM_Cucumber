package com.NB_CRM.step_definitions;

import com.NB_CRM.pages.LibraryConstants;
import com.NB_CRM.pages.LogOutPage;
import com.NB_CRM.pages.LoginPage;
import com.NB_CRM.pages.US07_ZH_Page;
import com.NB_CRM.utils.BrowserUtils2;
import com.NB_CRM.utils.ConfigReader;
import com.NB_CRM.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US07_ZH_StepDefs {

    LoginPage loginPage = new LoginPage();
    LogOutPage logOutPage = new LogOutPage();
    US07_ZH_Page us07_zh_page = new US07_ZH_Page();

    @Given("I am on the NextBase CRM homepage")
    public void iAmOnTheNextBaseCRMHomepage() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        loginPage.login(ConfigReader.getProperty("usernameHelpDesk"), ConfigReader.getProperty("passwordHelpDesk"));
    }
    @When("I able to {string} a post by clicking {string} button")
    public void i_able_to_a_post_by_clicking_button(String follow,String followButton ) throws Exception {
            switch (followButton.toLowerCase()) {
                case LibraryConstants.FOLLOWBUTTON :
                    us07_zh_page.clickButtons(follow);
                    break;
                case LibraryConstants.UNFOLLOWBUTTON:
                    us07_zh_page.clickButtons(follow);

                    break;
                case LibraryConstants.LIKEBUTTON:
                    us07_zh_page.clickButtons(follow);
                    break;
                default:
                    throw new Exception("Failed " + followButton);
            }
            logOutPage.logout();
        }
    @When("I hover over mouse on eye icon button and can see who viewed a post")
    public void i_hover_over_mouse_on_eye_icon_button_and_can_see_who_viewed_a_post() throws Exception {
        Driver.getDriver().navigate().refresh();
        us07_zh_page.eyeIconButtonOnCRM();
        logOutPage.logout();
    }

    @When("I click on star icon and I can see start icon changed it color to orange")
    public void i_click_on_star_icon_and_i_can_see_start_icon_changed_it_color_to_orange() throws Exception {
        BrowserUtils2.waitFor(3);
        us07_zh_page.starIconOnCRMWindow();
        logOutPage.logout();
    }
    @When("I click on comment section and I able to write comment")
    public void i_click_on_comment_section_i_able_to_write_comment() throws Exception {
        us07_zh_page.commentSectionOnCRMWindoww();
        logOutPage.logout();
    }

    @Then("I can {string} a comment with {string} button")
    public void i_can_cancel_a_comment_with_button(String string,String button) throws Exception {
        switch (string.toLowerCase()) {
            case LibraryConstants.CANCELBUTTON:
                us07_zh_page.cancelAndSENDButtonOnCRMWindow(button);
                break;
            case LibraryConstants.SENDBUTTON:
                us07_zh_page.cancelAndSENDButtonOnCRMWindow(button);
                break;
            default:
                throw new Exception("Failed " + button);
        }
        logOutPage.logout();
    }
}
