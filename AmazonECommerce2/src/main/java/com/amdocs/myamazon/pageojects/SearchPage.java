package com.amdocs.myamazon.pageojects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.myamazon.actiondriver.Action;
import com.amdocs.myamazon.baseclass.BaseClass;

public class SearchPage extends BaseClass{
	
	@FindBy(xpath ="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div")
    WebElement watchImg;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//input[@id='buy-now-button']")
    WebElement buyNowBtn;

    @FindBy(xpath = "//span[@id='sw-gtc']")
    WebElement goToCart;

    public SearchPage()
    {
        PageFactory.initElements(driver, this);
    }

    public BuyNowPage clickByNow() throws Throwable
    {
        Action.pageWaiting(driver);
        Action.click(driver, watchImg);

        Thread.sleep(2000);

        Action.switchToNewWindow(driver);
        Action.click(driver, addToCartBtn);
        Action.click(driver, goToCart);
        return new BuyNowPage();
    }
}
