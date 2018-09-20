package com.alex.chang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage extends BasePage {
    public OrderConfirmationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
//        waitForWebElement(confirmOrderButton);
    }

    @FindBy(xpath = "//span[text()='I confirm my order']")
    private WebElement confirmOrderButton;

    @FindBy(id = "cart_navigation")
    private WebElement confirmPaymentFooter ;

    @FindBy(xpath = "//span[text()='I confirm my order']//parent::button")
    private WebElement confirmOrder ;

    @FindBy(xpath = "//h1[@class='page-heading' and text()='Order confirmation']")
    private WebElement pageHeading ;

    @FindBy(xpath = "//div[@class='box order-confirmation']")
    private WebElement OrderConfrimSection ;

    @FindBy(xpath = "//p[@class='cart_navigation exclusive']/a")
    private WebElement navToOrderHistory ;

    @FindBy(xpath = "//div[@class='box order-confirmation']//br[4]")
    private WebElement orderNumText;

    public OrderConfirmationPage confirmOrder(){
        confirmOrderButton.click();
        waitForWebElement(OrderConfrimSection);
        return this;
    }

    public OrderConfirmationPage getOrderNumber(){
        System.out.println(orderNumText.getText());
        int a = orderNumText.getText().length();
        System.out.println(a);

//        System.out.println(orderNumText.getText().substring(a -10,a-1));
        return this;
    }
}
