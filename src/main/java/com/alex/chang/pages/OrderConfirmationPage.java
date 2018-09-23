package com.alex.chang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage extends NavPage {

    public OrderConfirmationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        waitForWebElement(OrderConfrimSection);
    }



    @FindBy(xpath = "//h1[@class='page-heading' and text()='Order confirmation']")
    private WebElement pageHeading ;

    @FindBy(xpath = "//div[@class='box order-confirmation']")
    private WebElement OrderConfrimSection ;

    @FindBy(xpath = "//a[@title='Back to orders']")
    private WebElement orderHistoryButton ;

    @FindBy(xpath = "//div[@class='box order-confirmation']")
    private WebElement orderNumText;

    public OrderConfirmationPage getOrderNumber(){
        System.out.println(orderNumText.getText());
        int a = orderNumText.getText().length();
        System.out.println(a);
        return this;
    }

    public String getOrderText(){
        return orderNumText.getText();
    }

    public OrderHistoryPage navToOrderHistory(){
        orderHistoryButton.click();
        return new OrderHistoryPage(driver);
    }
}
