package com.sbn.tests;
import com.sbn.util.StringUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class StringPatterTest {

    @DataProvider(name = "inputs")
    public Object[][] getInputs(){
        return new Object[][]{{"Hi", Arrays.asList("Hi","iH")},
                {"Hello", Arrays.asList("Hello","elloH","lloHe","loHel","oHell")},
                {"Bye",Arrays.asList("Bye","yeB","eBy")}
        };
    }


    @Test(dataProvider = "inputs")
    public void testForCombinationStringUtil(String inpStr, List<String> expectedList){

        String[] expected = (String[]) expectedList.toArray();
        String[] actual = StringUtil.getCombination(inpStr);
        Assert.assertEquals(actual,expected,"did not matched");
    }

    @DataProvider(name = "statements")
    public Object[][] getStatements(){
        return new String[][]{{"My     Name   is Kirtesh     ","My Name is Kirtesh"}};
    }

    @Test(dataProvider = "statements")
    public void testForeRemovingExtraSpaces(String inpStr,String expected){
        String actual = StringUtil.removeExtraSpaces(inpStr);
        Assert.assertEquals(actual,expected,"Did not matched");
    }


}
