package com.amdocs.myamazon.testcases;

import org.testng.annotations.Test;

import com.amdocs.myamazon.pageojects.HomePage;
import com.amdocs.myamazon.pageojects.SignInPage;

public class SignInTestPage {
	
	public SignInPage signin;
    public HomePage homepage;

    @Test
    public void signIn() throws Throwable
    {
        signin = new SignInPage();
        homepage = signin.clickOnBtn();
    }
}
