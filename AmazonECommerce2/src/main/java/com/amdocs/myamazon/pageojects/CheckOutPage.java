package com.amdocs.myamazon.pageojects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.myamazon.actiondriver.Action;
import com.amdocs.myamazon.baseclass.BaseClass;

public class CheckOutPage extends BaseClass{
	
	@FindBy(xpath = "//div[@class='a-row address-row list-address-selected']")
    WebElement address;

    @FindBy(xpath = "//span[@id='shipToThisAddressButton-announce']")
    WebElement useThisAddress;

    public CheckOutPage()
    {
        PageFactory.initElements(driver, this);
    }
    public Shipping clickBtn() throws Throwable
    {
        Thread.sleep(3000);
        Action.click(driver, useThisAddress);
        return new Shipping();
    }
}
