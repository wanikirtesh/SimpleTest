package com.sbn.glue;

import com.sbn.selenium.pages.BasePage;
import com.sbn.selenium.pages.EmployeeEditPage;
import com.sbn.selenium.pages.LoginPage;
import com.sbn.selenium.tests.BaseTest;
import com.sbn.selenium.util.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EmployeeManagement extends BaseTest {
    BasePage basePage;
    EmployeeEditPage employeeEditPage;

    @Given("Application is Running with {string}")
    public void applicationIsRunningWith(String browser) {
        driver = WebDriverManager.getDriver(browser);
        driver.get("http://localhost:8080");
        loginPage = new LoginPage(driver);
    }

    @Given("when we Logged into EMS Application with {string} and {string}")
    public void whenWeLoggedIntoEMSApplicationWithAnd(String user, String password) throws Exception {
         basePage= loginPage.doLogin(user, password);
    }

    @And("Navigate to Employee Edit Screen")
    public void navigateToEmployeeEditScreen() throws Exception {
        employeeEditPage = basePage.goToEmployeeEditPage();
    }

    @Then("I should get correct list of employee as per database")
    public void iShouldGetCorrectListOfEmployeeAsPerDatabase() throws Exception {
        employeeEditPage.validateEmployeeList();
    }

    @After
    public void tearDown(){
        //basePage.quit();
    }
}
