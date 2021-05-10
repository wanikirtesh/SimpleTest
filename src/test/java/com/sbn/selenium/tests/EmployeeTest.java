package com.sbn.selenium.tests;

import com.sbn.selenium.pages.BasePage;
import com.sbn.selenium.pages.EmployeeEditPage;
import org.testng.annotations.Test;

public class EmployeeTest extends BaseTest{
    @Test
    public void validateEmployeeList() throws Exception {
        BasePage basePage = loginPage.doLogin("wanikirtesh@gmail.com", "password");
        EmployeeEditPage employeeEditPage = basePage.goToEmployeeEditPage();
        employeeEditPage.validateEmployeeList();
    }
}
