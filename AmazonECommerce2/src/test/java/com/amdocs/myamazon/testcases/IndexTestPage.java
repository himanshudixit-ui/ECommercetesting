package com.amdocs.myamazon.testcases;

import org.testng.annotations.Test;

import com.amdocs.myamazon.actiondriver.Action;
import com.amdocs.myamazon.baseclass.BaseClass;
import com.amdocs.myamazon.pageojects.BuyNowPage;
import com.amdocs.myamazon.pageojects.CheckOutPage;
import com.amdocs.myamazon.pageojects.HomePage;
import com.amdocs.myamazon.pageojects.IndexPage;
import com.amdocs.myamazon.pageojects.SearchPage;
import com.amdocs.myamazon.pageojects.Shipping;
import com.amdocs.myamazon.pageojects.SignInPage;

public class IndexTestPage extends BaseClass{

	public IndexPage indexpage;
	
    public SignInPage signIn;
    public HomePage homepage;
    public BuyNowPage byunowpage;
    public CheckOutPage checkout;
    public Shipping shipping;

    @Test
    public void  SignIn() throws Throwable
    {
        Action.windowMaximize(driver);

        indexpage=new IndexPage();
        signIn = indexpage.clickSingIn();

        homepage=signIn.clickOnBtn();
        SearchPage search = homepage.searchBox();

        byunowpage = search.clickByNow();

        checkout = byunowpage.checkOut();

        shipping = checkout.clickBtn();

        shipping.order();
    }
}
