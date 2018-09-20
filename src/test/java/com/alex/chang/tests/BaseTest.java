package com.alex.chang.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

     WebDriver driver;

//    public com.alex.chang.tests.BaseTest(WebDriver driver) {
//        this.driver = driver;
//    }

    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser){

        if (browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "/Users/cnarayan/Documents/gitRepo/driver/webdrivers/mac/geckodriver");
            driver = new FirefoxDriver();
        }

         else if(browser.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.chrome.driver", "/Users/cnarayan/Documents/gitRepo/driver/webdrivers/mac/chromedriver");
        driver = new ChromeDriver();
        }

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
