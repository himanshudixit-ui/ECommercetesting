package com.amdocs.myamazon.pageojects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.myamazon.actiondriver.Action;
import com.amdocs.myamazon.baseclass.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
    WebElement seachbox;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    WebElement searchBtn;

    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }
    public SearchPage searchBox() throws Throwable
    {        
        System.out.println("Homepage search box");
        Thread.sleep(5000);
        Action.type(seachbox, "wardrobe");
        Action.click(driver,searchBtn);
        return new SearchPage();
    }
}
