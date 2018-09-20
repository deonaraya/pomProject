package com.alex.chang.tests;

import org.testng.annotations.*;

public class firstTest extends BaseTest {


    @Test
    public void readTitleWebPage(){
        // Opem a URL in the browser
        driver.get("http://www.amazon.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.close();
    }

    @Test
    public void readURLWebPage(){
        // Opem a URL in the browser
        driver.get("http://www.walmart.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.close();
    }





}
