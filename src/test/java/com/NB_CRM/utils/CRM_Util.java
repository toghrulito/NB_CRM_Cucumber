package com.NB_CRM.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Util {

    public static void crm_login(WebDriver driver) {

//        3- Login Homepage ( Login with valid username and
//                password)


        WebElement user_login = driver.findElement(By.name("USER_LOGIN"));
        user_login.sendKeys("marketing21@cybertekschool.com");
        // And valid password
        WebElement user_password = driver.findElement(By.name("USER_PASSWORD"));
        user_password.sendKeys("UserUser");
        // Then click log in button
        driver.findElement(By.className("login-btn")).click();
    }


    public static void crm_login(WebDriver driver,String username,String password) {

//        3- Login Homepage ( Login with valid username and
//                password)


        WebElement user_login = driver.findElement(By.name("USER_LOGIN"));
        user_login.sendKeys(username);
        // And valid password
        WebElement user_password = driver.findElement(By.name("USER_PASSWORD"));
        user_password.sendKeys(password);
        // Then click log in button
        driver.findElement(By.className("login-btn")).click();
    }


}
