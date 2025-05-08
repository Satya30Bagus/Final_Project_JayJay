package com.satya;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        glue = {"com.satya"},
        features = {"/Users/satyabagus/IdeaProjects/Final_Project_Satya/src/test/java/feature/web"},
        plugin = {"pretty","html:reports/cucumber.html", "json:reports/cucumber.json"}
)

public class Web_Runner_Test {
}
