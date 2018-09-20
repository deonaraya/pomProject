package com.alex.chang.tests;

import org.testng.annotations.*;

public class secondTest extends BaseTest{

    @Test
    public void openWeb(){

        // Opem a URL in the browser
        driver.get("http://www.google.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.close();
    }

    @Test
    public void openFb(){
        // Opem a URL in the browser
        driver.get("http://www.facebook.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }


}
