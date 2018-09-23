package com.alex.chang.tests;

import com.alex.chang.pages.BasePage;
import com.alex.chang.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class pomTestOne extends BaseTest {

    @Test(enabled = false)
    public void testnameAndPrice(){
        driver.get("http://automationpractice.com/index.php");
        HomePage homePage = new HomePage(driver);
        homePage.getProductNames();
        homePage.getProductPrices();
    }


    @Test(enabled = false)
    public void demoActions(){
        driver.get("http://automationpractice.com/index.php");
        HomePage homePage = new HomePage(driver);

        homePage.getProductPrices();
        homePage.getProductNames();
        homePage.addToCart();
    }

    @Test
    public void demoAssert(){
        driver.get("http://automationpractice.com/index.php");

        HomePage homePage = new HomePage(driver);
//        homePage.getProductPrices().addToCart().verifySuccessMessage().proceedToCheckOut().navToAuth().signUp("logan_randopnQE@grr.la").register();
        String orderText = homePage.getProductPrices().addToCart().verifySuccessMessage().proceedToCheckOut()
                .navToAuth().signIn("nadcido@mailinator.com","pass123").
                navToShipping().navToPayment().payByCheck().confirmOrder().getOrderText();

        driver.get("http://automationpractice.com/index.php");
        List<String> orderNum = homePage.navToMyOrders().getOrderNumbers();
        Assert.assertTrue(orderText.contains(orderNum.get(0)));
    }
}
