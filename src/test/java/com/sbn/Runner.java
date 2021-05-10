package com.sbn;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.sbn.glue"
        ,features = "C:\\Users\\idnkiw\\OneDrive\\Repo\\SimpleTest\\src\\test\\java\\com\\sbn\\features"
        ,plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"})
public class Runner {
}
