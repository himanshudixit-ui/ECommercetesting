package com.amdocs.myamazon.pageojects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.myamazon.actiondriver.Action;
import com.amdocs.myamazon.baseclass.BaseClass;

public class IndexPage extends BaseClass{
	
	@FindBy(xpath = "//a[@id='nav-link-accountList']")
    WebElement signIn;

    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    WebElement logo;

    public IndexPage()
    {
        PageFactory.initElements(driver, this);
    }

    public SignInPage clickSingIn()
    {
        Action.click(driver, signIn);
        return new SignInPage();
    }

}
