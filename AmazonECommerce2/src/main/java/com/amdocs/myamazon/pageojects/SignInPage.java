package com.amdocs.myamazon.pageojects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.myamazon.actiondriver.Action;
import com.amdocs.myamazon.baseclass.BaseClass;

public class SignInPage extends BaseClass{
	
	@FindBy(xpath = "//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
    WebElement emailBox;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueBtn;

    @FindBy(xpath = "//a[@id='createAccountSubmit']")
    WebElement createAccount;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    WebElement signinBtn;
    
    public SignInPage()
    {
        PageFactory.initElements(driver, this);
    }
    public HomePage clickOnBtn() throws Throwable
    {        
        System.out.println("hi");
        Action.type(emailBox, "USERNAME");
        Action.pageWaiting(driver);        
        Action.click(driver, continueBtn);
        Action.type(password, "YOUR PASSWORD");
        Action.click(driver, signinBtn);
        Thread.sleep(3000);    
        return new HomePage();        
    }
}
