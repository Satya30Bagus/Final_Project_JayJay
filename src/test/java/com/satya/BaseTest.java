package com.satya;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest {

    protected static WebDriver driver;

    protected void getDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().fullscreen();
    }





}
