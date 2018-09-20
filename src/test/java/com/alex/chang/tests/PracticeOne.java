package com.alex.chang.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class PracticeOne extends BaseTest {


    @Test(enabled = false)
    public void typeandSearch() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        WebElement searchTextField =  driver.findElement(By.id("search_query_top")) ;
        System.out.println(searchTextField.getAttribute("class"));
        searchTextField.sendKeys("Find me a good SHIRT");
        Thread.sleep(2000);

        searchTextField.clear();

        Thread.sleep(2000);
        searchTextField.sendKeys("JEANS");

        Thread.sleep(2000);

        WebElement searchButton = driver.findElement(By.name("submit_search"));
        searchButton.click();

        Thread.sleep(5000);




    }

    @Test(enabled = false)
    public void getProductPrice(){
        driver.get("http://automationpractice.com/index.php");

        List<WebElement> prices = driver.findElements(By.xpath("//ul[@id='homefeatured']/li//div[@class='right-block']//span[@itemprop='price']"));

        for (WebElement price : prices) {
            System.out.println(price.getText());
        }

    }

    @Test
    public void travelTOUS() throws InterruptedException {
        driver.get("https://www.phptravels.net/");

        WebElement modeTravel = driver.findElement(By.xpath("//span[contains(text(),'Flights')]")) ;
        modeTravel.click();

        Thread.sleep(4000);

        driver.findElement(By.id("location_from")).sendKeys("BLR");
        driver.findElement(By.className("select2-match")).click();

        driver.findElement(By.id("location_to")).sendKeys("SFO");
        driver.findElement(By.className("select2-match")).click();

        Thread.sleep(4000);





    }


}
