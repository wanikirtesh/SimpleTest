package com.sbn.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import sun.plugin.dom.exception.InvalidStateException;

public class BasePage {
    WebDriver driver;
    public BasePage(WebDriver driver) throws Exception {
        this.driver =driver;
        if(driver.findElements(By.xpath("//a[text()='Sign Out']")).size()==0){
            throw new Exception("Not On Base Application Page");
        }
    }

    public void logOut() {
        driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
    }

    public EmployeeEditPage goToEmployeeEditPage() throws Exception {
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",driver.findElement(By.xpath("//a[@id='edEmp']")));
        return new EmployeeEditPage(driver);
    }
}
