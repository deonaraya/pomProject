package com.alex.chang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage extends BasePage {


    public OrderSummaryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        waitForWebElement(confirmPaymentFooter);
    }

    @FindBy(id = "cart_navigation")
    private WebElement confirmPaymentFooter ;

    @FindBy(xpath = "//span[text()='I confirm my order']//parent::button")
    private WebElement confirmOrder ;

    public OrderConfirmationPage confirmOrder(){
        confirmOrder.click();
        return new OrderConfirmationPage(driver);
    }
}
