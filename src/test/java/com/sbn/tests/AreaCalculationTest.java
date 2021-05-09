package com.sbn.tests;
import com.sbn.util.AreaCalculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AreaCalculationTest {
    @DataProvider(name = "dp")
    public Object[][] getData(){
        return new Integer[][]{{1,2,2},{2,2,4},{7,3,21},{5,6,30}};
    }
    @Test(dataProvider = "dp")
    public void validateRectangleAreaTest(int length,int breadth,int expected){
        int actual = AreaCalculator.forRectangle(length,breadth);
        Assert.assertEquals(actual,expected);
    }
}
