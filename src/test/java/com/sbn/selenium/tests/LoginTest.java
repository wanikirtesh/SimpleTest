package com.sbn.selenium.tests;

import com.sbn.selenium.pages.BasePage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void validateLoginForValidUserPassword() throws Exception {
        BasePage basePage = loginPage.doLogin("wanikirtesh@gmail.com","password");
        basePage.logOut();
    }


}
