package com.sbn.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }

    public BasePage doLogin(String user, String password) throws Exception {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(user);
        driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        return new BasePage(driver);
    }

    public void quit() {
        driver.quit();
    }
}
