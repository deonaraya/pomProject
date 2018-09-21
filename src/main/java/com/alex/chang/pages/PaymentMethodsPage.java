package com.alex.chang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodsPage extends NavPage {
    public PaymentMethodsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        waitForWebElement(paymentSection);
    }

    @FindBy(className = "paiement_block")
    private WebElement paymentSection ;

    @FindBy(className = "bankwire")
    private WebElement payByWire ;

    @FindBy(className = "cheque")
    private WebElement payByCheck ;

    public OrderSummaryPage payByCheck(){
        payByCheck.click();
        return new OrderSummaryPage(driver);
    }

}
