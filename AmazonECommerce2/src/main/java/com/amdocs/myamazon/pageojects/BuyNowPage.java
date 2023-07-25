package com.amdocs.myamazon.pageojects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.myamazon.actiondriver.Action;
import com.amdocs.myamazon.baseclass.BaseClass;

public class BuyNowPage extends BaseClass{
	
    @FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
    WebElement proceedToBy;

    @FindBy(xpath = "//div[@class='a-row address-row list-address-selected']")
    WebElement address;

    public BuyNowPage()
    {
        PageFactory.initElements(driver, this);
    }

    public CheckOutPage checkOut()
    {
        Action.click(driver, proceedToBy);
        return new CheckOutPage();
    }
}
