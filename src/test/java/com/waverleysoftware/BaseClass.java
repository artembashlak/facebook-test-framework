package com.waverleysoftware;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public WebDriver driver;

    @BeforeClass
    public void setupApplication() {
        Reporter.log("Session started", true);
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        Reporter.log("Application started", true);
    }

    @AfterClass
    public void closeApplication() {
        driver.quit();
        Reporter.log("Browser session end", true);
    }
}