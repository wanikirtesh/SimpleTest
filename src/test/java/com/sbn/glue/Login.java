package com.sbn.glue;

import com.sbn.selenium.pages.BasePage;
import com.sbn.selenium.pages.LoginPage;
import com.sbn.selenium.tests.BaseTest;
import com.sbn.selenium.util.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Login extends BaseTest {
    BasePage basePage;
    @Given("Application is Running with {string} _loginFeature")
    public void applicationIsRunningWith(String browser) {
        driver = WebDriverManager.getDriver(browser);
        driver.get("http://localhost:8080");
        loginPage = new LoginPage(driver);
    }

    @Given("when we Logged into EMS Application with {string} and {string} _loginFeature")
    public void whenWeLoggedIntoEMSApplicationWithAnd(String user, String password) throws Exception {
        basePage= loginPage.doLogin(user, password);
    }

    @io.cucumber.java.en.Then("User Must able to Login")
    public void userMustAbleToLogin() {
        Assert.assertTrue(driver.findElements(By.xpath("//a[text()='Sign Out']")).size()>0);
    }


    @And("User Logging Out")
    public void userLoggingOut() {
        basePage.logOut();
       // basePage.quit();
    }


}
