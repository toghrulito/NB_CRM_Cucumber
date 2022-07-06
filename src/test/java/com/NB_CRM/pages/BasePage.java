package com.NB_CRM.pages;

import com.NB_CRM.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
