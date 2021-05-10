package com.sbn.selenium.pages;

import com.sbn.selenium.util.DbCon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.sql.ResultSet;
import java.util.List;

public class EmployeeEditPage extends BasePage {
    public EmployeeEditPage(WebDriver driver) throws Exception {
        super(driver);
        if(driver.findElements(By.xpath("//h5[text()='Employee Management']")).size()==0){
            throw new Exception("Not On Employee Edit Page");
        }
    }

    public void validateEmployeeList() throws Exception {
        DbCon dbCon = new DbCon();
        ResultSet resEmpList = dbCon.getRecords("SELECT * FROM Employee");
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='tbl']/tbody/tr"));
        resEmpList.last();
        int records = resEmpList.getRow();
        resEmpList.beforeFirst();
        if(records==rows.size()){
            int index=0;
            SoftAssert softAssert = new SoftAssert();
            while (resEmpList.next()){
                softAssert.assertEquals(rows.get(index).findElement(By.xpath("./td[2]")).getText(),resEmpList.getString("first_name"),"Record "+index+" not matched");
                index++;
            }
            softAssert.assertAll();
        }else{
            Assert.fail("Employee Record count does not match");
        }
    }
}
