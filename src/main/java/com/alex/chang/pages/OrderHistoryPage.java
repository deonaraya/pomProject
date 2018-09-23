package com.alex.chang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.ArrayList;
import java.util.List;

public class OrderHistoryPage extends NavPage {
    public OrderHistoryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        waitForWebElement(subheading);
    }

    @FindBy(xpath = "//h1[text()='Order history']")
    private WebElement subheading;

    @FindBy(id = "center_column")
    private WebElement OrderHistorySection ;

    @FindBy(className = "color-myaccount")
    private List<WebElement> orderNumbers ;

    @FindBy(xpath = "//td[@class='history_date bold']")
    private WebElement orderDate ;

    @FindBy(className = "price")
    private WebElement orderPrice ;

    @FindBy(className = "history_method")
    private WebElement paymentMethod ;

    @FindBy(xpath = "//td[@class='history_state']/span")
    private WebElement orderStatus ;


    public boolean isOrderNUmExists(String orderNumber){
        boolean res  = false;
        for (WebElement orderNum : orderNumbers) {
            if(orderNum.getText() == orderNumber)
                res = true;
        }
        return res;
    }

    public List<String> getOrderNumbers(){
        List<String> orderList = new ArrayList<String>();
        for (WebElement elem : orderNumbers) {
            orderList.add(elem.getText());
        }
        return orderList;
    }
}
