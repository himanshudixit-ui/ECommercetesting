package com.amdocs.myamazon.pageojects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.myamazon.actiondriver.Action;
import com.amdocs.myamazon.baseclass.BaseClass;

public class Shipping extends BaseClass{
	
	@FindBy(xpath = "//div[@class='a-box pmts-instrument-box']//input[@type='radio']")
    List<WebElement> paymentMethod;

    @FindBy(xpath = "//*[@id='orderSummaryPrimaryActionBtn-announce']")
    WebElement paymentSubmit;

    @FindBy(xpath = "//*[@id=\"submitOrderButtonId\"]/span/input")
    WebElement placeYourOrder;

    public Shipping()
    {
        PageFactory.initElements(driver, this);
    }

    public void order() throws Throwable
    {
        System.out.println("payment");
        Thread.sleep(20000);
        Action.click(driver, paymentMethod.get(2));
        Action.pageWaiting(driver);
        Action.click(driver, paymentSubmit);
        Thread.sleep(20000);
        Action.click(driver, placeYourOrder);

    }
}
