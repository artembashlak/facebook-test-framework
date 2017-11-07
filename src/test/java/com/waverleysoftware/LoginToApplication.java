package com.waverleysoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginToApplication extends BaseClass {
    WebElement username = driver.findElement(By.id("email"));
    WebElement password = driver.findElement(By.id("pass"));
    WebElement Login = driver.findElement(By.id("u_0_2"));
    String pageTitle = driver.getTitle();

    @Test(description = "Perform login to application")
    public void loginToApplication() throws Throwable {

        username.sendKeys("artembashlak@gmail.com");
        password.sendKeys("fuck123.");
        Login.click();
        Thread.sleep(200);
        System.out.println(pageTitle);
    }


    @Test(description = "Perform login with invalid credentials")
    public void failLoginToApplication() {
        username.sendKeys("notcorrect@gmail.com");
        password.sendKeys("failpassword");
        Login.click();
        System.out.println(pageTitle);
    }

}