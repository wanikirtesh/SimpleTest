package com.sbn.selenium.tests;

import com.sbn.selenium.pages.LoginPage;
import com.sbn.selenium.util.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.sql.DriverManager;

public class BaseTest {
    protected WebDriver driver;
    LoginPage loginPage;
    @BeforeClass
    public void init(){
        driver = WebDriverManager.getDriver("firefox");
        driver.get("http://localhost:8080");
        loginPage = new LoginPage(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
