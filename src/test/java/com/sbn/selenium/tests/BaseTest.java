package com.sbn.selenium.tests;

import com.sbn.selenium.pages.LoginPage;
import com.sbn.selenium.util.WebDriverManager;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.sql.DriverManager;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;



}
