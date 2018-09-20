package com.alex.chang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingAddressPage extends BasePage {

    public ShippingAddressPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        waitForWebElement(shippingSection);
    }

    @FindBy(id = "HOOK_BEFORECARRIER")
    private WebElement shippingSection ;

    @FindBy(id = "cgv")
    private WebElement tncCheckbox ;

    @FindBy(name = "processCarrier")
    private WebElement checkoutStep4 ;

    public PaymentPage navToPayment(){
        tncCheckbox.click();
        checkoutStep4.click();
        return new PaymentPage(driver);
    }
}
