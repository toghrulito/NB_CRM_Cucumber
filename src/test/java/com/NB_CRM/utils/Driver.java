package com.NB_CRM.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public abstract class Driver {

        /*
    Creating the private constructor so this class' object
    is not reachable from outside
         */

    private Driver() {}

    /*
    Making our 'driver' instance private so that it is not reachable from outside of the class.
    We make it static, because we want it to run before everything else, and also we will use it in a static method
*/

private static WebDriver driver;
    /*
    Creating re-usable utility method that will return same
    */

public static WebDriver getDriver(){
    if(driver==null){
        /*
        We read our browser type from configuration.properties file using
        •getProperty method we're creating in ConfigurationReader class.
        */
        String browserType = ConfigReader.getProperty("browser");

        switch (browserType){
            case"chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                break;
            case "safari":
                WebDriverManager.safaridriver().setup();
                driver=new SafariDriver();
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                break;
        }
    }

    /*
        Same driver instance will be returned every time we call Driver.getDriver(); method

     */
    return driver;
}


/*
This method makes sure we have some form of driver session or driver id has.
Either null or not null it must exist.
 */

public static void closeDriver(){
    if(driver!=null){
        driver.quit();
        driver=null;
    }

}
}
