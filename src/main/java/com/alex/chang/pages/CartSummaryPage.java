package com.alex.chang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartSummaryPage extends BasePage {

    //STEPS :
//    1. Creaste /Store  WebEleemtns
//    2. Writer menthodds on these webElements
//    3. Create a constructor dfor the webDriver to be initialized
//    4. Define PAge Factory.initiElements

    public CartSummaryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        waitForWebElement(cartSummary);

    }

    @FindBy(className = "page-heading")
    private WebElement pageHeading;

    @FindBy(id = "cart_summary")
    private WebElement cartSummary ;

    @FindBy(xpath = "//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']")
    private WebElement checkoutStep2 ;



    public AuthenticationPage navToAuth(){
        checkoutStep2.click();
        return new AuthenticationPage(driver);
    }

}
